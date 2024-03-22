package net.maku.system.dao;

import net.maku.system.entity.SankyoAlign;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SankyoAlignDao extends CrudRepository<SankyoAlign,String> {
}
