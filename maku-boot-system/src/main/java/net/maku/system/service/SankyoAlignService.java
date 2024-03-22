package net.maku.system.service;

import jakarta.annotation.Resource;
import net.maku.system.dao.SankyoAlignDao;
import net.maku.system.entity.SankyoAlign;
import net.maku.system.entity.SankyoLineTact;
import net.maku.system.vo.SankyoAlignVO;
import net.maku.system.vo.SankyoLineTactVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

import static org.springframework.data.cassandra.core.query.Criteria.where;

@Service
public class SankyoAlignService {
    @Resource
    CassandraTemplate cassandraTemplate;
    private final SankyoAlignDao sankyoAlignDao;

    public SankyoAlignService(SankyoAlignDao sankyoAlignDao) {
        this.sankyoAlignDao = sankyoAlignDao;
    }
    public List<SankyoAlign> findAll(SankyoAlignVO sankyoAlignVO){
        Query query = Query.empty();
        Timestamp timestamp_start = Timestamp.valueOf(sankyoAlignVO.getStartTime());
        Timestamp timestamp_end = Timestamp.valueOf(sankyoAlignVO.getEndTime());
        if(StringUtils.isNotBlank(sankyoAlignVO.getRobotsn())){
            query = query.and(where("glassalignment_robotsn").is(sankyoAlignVO.getRobotsn()));
        }
        if(StringUtils.isNotBlank(sankyoAlignVO.getStartTime())){
            query = query.and(where("glassalignment_datetime").gte(timestamp_start));
        }
        if(StringUtils.isNotBlank(sankyoAlignVO.getEndTime())){
            query = query.and(where("glassalignment_datetime").lte(timestamp_end));
        }
        Sort sort = Sort.by(Sort.Direction.ASC, "glassalignment_datetime");
        query = query.sort(sort);
        List<SankyoAlign> list = cassandraTemplate.select(query, SankyoAlign.class);
        return list;

    }
}
