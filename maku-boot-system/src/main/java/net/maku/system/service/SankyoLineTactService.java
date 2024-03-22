package net.maku.system.service;

import jakarta.annotation.Resource;
import net.maku.system.dao.SankyoLineTactDao;
import net.maku.system.entity.SankyoLineTact;
import net.maku.system.entity.SankyoServo;
import net.maku.system.vo.SankyoLineTactVO;
import net.maku.system.vo.SankyoServoVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

import static org.springframework.data.cassandra.core.query.Criteria.where;

@Service
public class SankyoLineTactService {
    @Resource
    CassandraTemplate cassandraTemplate;
    private final SankyoLineTactDao sankyoLineTactDao;

    public SankyoLineTactService(SankyoLineTactDao sankyoLineTactDao) {
        this.sankyoLineTactDao = sankyoLineTactDao;
    }

    public List<SankyoLineTact> findAll(SankyoLineTactVO sankyoLineTactVO){
        Query query = Query.empty();
        Timestamp timestamp_start = Timestamp.valueOf(sankyoLineTactVO.getStartTime());
        Timestamp timestamp_end = Timestamp.valueOf(sankyoLineTactVO.getEndTime());
        if(StringUtils.isNotBlank(sankyoLineTactVO.getRobotsn())){
            query = query.and(where("linetactdata_robotsn").is(sankyoLineTactVO.getRobotsn()));
        }
        if(StringUtils.isNotBlank(sankyoLineTactVO.getStartTime())){
            query = query.and(where("linetactdata_datetime").gte(timestamp_start));
        }
        if(StringUtils.isNotBlank(sankyoLineTactVO.getEndTime())){
            query = query.and(where("linetactdata_datetime").lte(timestamp_end));
        }
        Sort sort = Sort.by(Sort.Direction.ASC, "linetactdata_datetime");
        query = query.sort(sort);
        List<SankyoLineTact> list = cassandraTemplate.select(query, SankyoLineTact.class);
        return list;

    }
}
