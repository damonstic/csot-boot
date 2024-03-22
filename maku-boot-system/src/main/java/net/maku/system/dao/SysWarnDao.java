package net.maku.system.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.system.entity.SysWarn;
import net.maku.system.vo.SysWarnVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface SysWarnDao extends BaseDao<SysWarn> {
    List<SysWarn> selectAll();
    //通过序列号查询
    List<SysWarn> selectByCondition(SysWarnVO sysWarnVO);

    List<SysWarn> selectToday(SysWarnVO sysWarnVO);


}
