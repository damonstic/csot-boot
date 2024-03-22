package net.maku.system.dao;

import net.maku.system.entity.SankyoVacuum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SankyoVacuumDao extends CrudRepository<SankyoVacuum,String> {
}
