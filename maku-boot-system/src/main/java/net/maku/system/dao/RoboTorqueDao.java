package net.maku.system.dao;

import net.maku.system.entity.RoboTorque;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoboTorqueDao  extends CrudRepository<RoboTorque,String> {
}
