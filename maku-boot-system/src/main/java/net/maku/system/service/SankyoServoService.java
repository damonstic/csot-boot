package net.maku.system.service;

import jakarta.annotation.Resource;
import net.maku.system.dao.SankyoServoDao;
import net.maku.system.entity.SankyoServo;
import net.maku.system.vo.SankyoServoVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import org.springframework.data.cassandra.core.query.Query;
import static org.springframework.data.cassandra.core.query.Criteria.where;

import java.sql.Timestamp;
import java.util.List;

@Service
public class SankyoServoService {
    @Resource
    CassandraTemplate cassandraTemplate;
    private final SankyoServoDao sankyoServoDao;

    public SankyoServoService(SankyoServoDao sankyoServoDao) {
        this.sankyoServoDao = sankyoServoDao;
    }
    public List<SankyoServo> findAll(SankyoServoVO sankyoServoVO){
        Query query = Query.empty();
        Timestamp timestamp_start = Timestamp.valueOf(sankyoServoVO.getStartTime());
        Timestamp timestamp_end = Timestamp.valueOf(sankyoServoVO.getEndTime());
        if(StringUtils.isNotBlank(sankyoServoVO.getRobotsn())){
            query = query.and(where("servodata_robotsn").is(sankyoServoVO.getRobotsn()));
        }
        if(StringUtils.isNotBlank(sankyoServoVO.getStartTime())){
            query = query.and(where("servodata_datetime").gte(timestamp_start));
        }
        if(StringUtils.isNotBlank(sankyoServoVO.getEndTime())){
            query = query.and(where("servodata_datetime").lte(timestamp_end));
        }
        Sort sort = Sort.by(Sort.Direction.ASC, "servodata_datetime");
        query = query.sort(sort);
        List<SankyoServo> list = cassandraTemplate.select(query, SankyoServo.class);
        return list;

    }
}
