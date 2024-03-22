package net.maku.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.maku.system.entity.Vacuum;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VacuumDao extends BaseMapper<Vacuum> {
}
