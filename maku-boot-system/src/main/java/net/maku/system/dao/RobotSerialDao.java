package net.maku.system.dao;

import net.maku.system.entity.RobotSerial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RobotSerialDao extends CrudRepository<RobotSerial,String> {
}
