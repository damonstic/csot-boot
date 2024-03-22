package net.maku.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.maku.system.entity.Servo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ServoDao extends BaseMapper<Servo> {
}
