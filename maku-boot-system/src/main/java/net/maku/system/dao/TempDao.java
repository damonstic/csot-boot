package net.maku.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.maku.system.entity.Temp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TempDao extends BaseMapper<Temp> {
}
