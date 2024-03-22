package net.maku.system.dao;

import net.maku.system.entity.RoboJointVel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoboJointVelDao extends CrudRepository<RoboJointVel,String> {
}
