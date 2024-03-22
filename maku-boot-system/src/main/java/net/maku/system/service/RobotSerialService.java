package net.maku.system.service;

import com.datastax.oss.driver.shaded.guava.common.collect.Lists;
import jakarta.annotation.Resource;
import net.maku.system.dao.RobotSerialDao;
import net.maku.system.entity.RobotSerial;
import net.maku.system.vo.RobotSerialVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.cassandra.core.query.Criteria.where;

@Service
public class RobotSerialService {
    @Resource
    CassandraTemplate cassandraTemplate;
    private final RobotSerialDao robotSerialDao;

    public RobotSerialService(RobotSerialDao robotSerialDao) {
        this.robotSerialDao = robotSerialDao;
    }

    public List<RobotSerial> findAll(){

        return (List<RobotSerial>) robotSerialDao.findAll();
    }

    public List<RobotSerial> findType(RobotSerialVO robotSerialVO) {
        Query query = Query.empty();
        if(StringUtils.isNotBlank(robotSerialVO.getFactory_end())){
            query = Query.query(where("factory_end").is(robotSerialVO.getFactory_end())).withAllowFiltering();
        }
        List<RobotSerial> list = cassandraTemplate.select(query, RobotSerial.class);
        return list;
    }

    //更新连接状态
    public void updateConnectionStatus(String robotsn, String status) {
        Query query = Query.empty();
        query = query.and(where("robotsn").is(robotsn)).withAllowFiltering();
        List<RobotSerial> entities = cassandraTemplate.select(query, RobotSerial.class);
        for (RobotSerial entity : entities) {
            if (entity.getId() != null) {
                entity.setConnection_status(status);
                cassandraTemplate.update(entity);
            }
        }

    }

    //更新上传时间
    public void updateUploadTime(String robotsn, String uploadTime) {
        Query query = Query.empty();
        query = query.and(where("robotsn").is(robotsn)).withAllowFiltering();
        List<RobotSerial> entities = cassandraTemplate.select(query, RobotSerial.class);
        for (RobotSerial entity : entities) {
            if (entity.getId() != null) {
                entity.setUpload_time(uploadTime);
                cassandraTemplate.update(entity);
            }
        }
    }
}
