package net.maku.system.dao;

import net.maku.system.entity.SankyoServo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SankyoServoDao extends CrudRepository<SankyoServo,String> {
}
