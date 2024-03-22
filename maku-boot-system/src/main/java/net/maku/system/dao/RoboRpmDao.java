package net.maku.system.dao;

import net.maku.system.entity.RoboRpm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoboRpmDao extends CrudRepository<RoboRpm,String> {
}
