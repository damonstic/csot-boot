package net.maku.system.service;

import jakarta.annotation.Resource;
import net.maku.system.dao.SankyoVacuumDao;
import net.maku.system.entity.SankyoVacuum;
import net.maku.system.vo.SankyoVacuumVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

import static org.springframework.data.cassandra.core.query.Criteria.where;

@Service
public class SankyoVacuumService {
    @Resource
    CassandraTemplate cassandraTemplate;
    private final SankyoVacuumDao sankyoVacuumDao;

    public SankyoVacuumService(SankyoVacuumDao sankyoVacuumDao) {
        this.sankyoVacuumDao = sankyoVacuumDao;
    }

    public List<SankyoVacuum> findAll(SankyoVacuumVO sankyoVacuumVO){
        Query query = Query.empty();
        Timestamp timestamp_start = Timestamp.valueOf(sankyoVacuumVO.getStartTime());
        Timestamp timestamp_end = Timestamp.valueOf(sankyoVacuumVO.getEndTime());
        if(StringUtils.isNotBlank(sankyoVacuumVO.getRobotsn())){
            query = query.and(where("vacuumpressure_robotsn").is(sankyoVacuumVO.getRobotsn()));
        }
        if(StringUtils.isNotBlank(sankyoVacuumVO.getStartTime())){
            query = query.and(where("vacuumpressure_datetime").gte(timestamp_start));
        }
        if(StringUtils.isNotBlank(sankyoVacuumVO.getEndTime())){
            query = query.and(where("vacuumpressure_datetime").lte(timestamp_end));
        }
        Sort sort = Sort.by(Sort.Direction.ASC, "vacuumpressure_datetime");
        query = query.sort(sort);
        List<SankyoVacuum> list = cassandraTemplate.select(query, SankyoVacuum.class);
        return list;

    }
}
