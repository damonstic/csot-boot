package net.maku.system.dao;

import net.maku.system.entity.SankyoLineTact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SankyoLineTactDao extends CrudRepository<SankyoLineTact,String> {
}
