package net.maku.system.service;

import net.maku.framework.common.utils.PageResult;
import net.maku.framework.mybatis.service.BaseService;
import net.maku.system.entity.SysWarn;
import net.maku.system.query.SysLogLoginQuery;
import net.maku.system.query.SysWarnQuery;
import net.maku.system.vo.SysLogLoginVO;
import net.maku.system.vo.SysWarnVO;

import java.util.List;

public interface SysWarnService extends BaseService<SysWarn> {
    List<SysWarn> selectAll();
    List<SysWarn> selectToday(SysWarnVO sysWarnVO);
    List<SysWarn> selectByCondition(SysWarnVO sysWarnVO);
    void update(SysWarnVO sysWarnVO);
    void updataContent(SysWarnVO sysWarnVO);
    void deleteWarn(SysWarnVO sysWarnVO);

    PageResult<SysWarnVO> page(SysWarnQuery query);

}
