package net.maku.system.dao;

import net.maku.system.entity.SankyoHand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SankyoHandDao extends CrudRepository<SankyoHand,String> {
}
