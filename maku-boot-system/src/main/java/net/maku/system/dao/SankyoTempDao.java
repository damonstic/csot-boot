package net.maku.system.dao;

import net.maku.system.entity.SankyoTemp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface SankyoTempDao extends CrudRepository<SankyoTemp,String> {
}
