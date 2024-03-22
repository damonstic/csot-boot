package net.maku.system.service;

import jakarta.annotation.Resource;
import net.maku.system.dao.SankyoHandDao;
import net.maku.system.entity.SankyoAlign;
import net.maku.system.entity.SankyoHand;
import net.maku.system.vo.SankyoAlignVO;
import net.maku.system.vo.SankyoHandVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

import static org.springframework.data.cassandra.core.query.Criteria.where;

@Service
public class SankyoHandService {
    @Resource
    CassandraTemplate cassandraTemplate;
    private final SankyoHandDao sankyoHandDao;

    public SankyoHandService(SankyoHandDao sankyoHandDao) {
        this.sankyoHandDao = sankyoHandDao;
    }

    public List<SankyoHand> findAll(SankyoHandVO sankyoHandVO){
        Query query = Query.empty();
        Timestamp timestamp_start = Timestamp.valueOf(sankyoHandVO.getStartTime());
        Timestamp timestamp_end = Timestamp.valueOf(sankyoHandVO.getEndTime());
        if(StringUtils.isNotBlank(sankyoHandVO.getRobotsn())){
            query = query.and(where("handbend_robotsn").is(sankyoHandVO.getRobotsn()));
        }
        if(StringUtils.isNotBlank(sankyoHandVO.getStartTime())){
            query = query.and(where("handbend_datetime").gte(timestamp_start));
        }
        if(StringUtils.isNotBlank(sankyoHandVO.getEndTime())){
            query = query.and(where("handbend_datetime").lte(timestamp_end));
        }
        Sort sort = Sort.by(Sort.Direction.ASC, "handbend_datetime");
        query = query.sort(sort);
        List<SankyoHand> list = cassandraTemplate.select(query, SankyoHand.class);
        return list;

    }
}
