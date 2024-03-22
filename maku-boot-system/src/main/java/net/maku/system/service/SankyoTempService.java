package net.maku.system.service;

import jakarta.annotation.Resource;
import net.maku.system.dao.SankyoTempDao;
import net.maku.system.entity.SankyoAlign;
import net.maku.system.entity.SankyoTemp;
import net.maku.system.vo.SankyoAlignVO;
import net.maku.system.vo.SankyoTempVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

import static org.springframework.data.cassandra.core.query.Criteria.where;


@Service
public class SankyoTempService {
    @Resource
    CassandraTemplate cassandraTemplate;
    private final SankyoTempDao sankyoTempDao;

    public SankyoTempService(SankyoTempDao sankyoTempDao) {
        this.sankyoTempDao = sankyoTempDao;
    }

    public List<SankyoTemp> findAll(SankyoTempVO sankyoTempVO){
        Query query = Query.empty();
        Timestamp timestamp_start = Timestamp.valueOf(sankyoTempVO.getStartTime());
        Timestamp timestamp_end = Timestamp.valueOf(sankyoTempVO.getEndTime());
        if(StringUtils.isNotBlank(sankyoTempVO.getRobotsn())){
            query = query.and(where("motortemp_robotsn").is(sankyoTempVO.getRobotsn()));
        }
        if(StringUtils.isNotBlank(sankyoTempVO.getStartTime())){
            query = query.and(where("motortemp_datetime").gte(timestamp_start));
        }
        if(StringUtils.isNotBlank(sankyoTempVO.getEndTime())){
            query = query.and(where("motortemp_datetime").lte(timestamp_end));
        }
        Sort sort = Sort.by(Sort.Direction.ASC, "motortemp_datetime");
        query = query.sort(sort);
        List<SankyoTemp> list = cassandraTemplate.select(query, SankyoTemp.class);
        return list;
    }

    }















