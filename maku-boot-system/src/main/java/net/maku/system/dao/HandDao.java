package net.maku.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.maku.system.entity.Hand;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HandDao extends BaseMapper<Hand> {
}
