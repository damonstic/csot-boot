package net.maku.system.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.framework.mybatis.service.impl.BaseServiceImpl;
import net.maku.system.convert.SysLogLoginConvert;
import net.maku.system.convert.SysWarnConvert;
import net.maku.system.dao.SysWarnDao;
import net.maku.system.entity.SysLogLoginEntity;
import net.maku.system.entity.SysWarn;
import net.maku.system.query.SysLogLoginQuery;
import net.maku.system.query.SysWarnQuery;
import net.maku.system.service.SysWarnService;
import net.maku.system.vo.SysWarnVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class SysWarnServiceImpl extends BaseServiceImpl<SysWarnDao, SysWarn> implements SysWarnService {
    @Autowired
    private SysWarnDao sysWarnDao;

    @Override
    public List<SysWarn> selectAll() {
        return sysWarnDao.selectAll();
    }

    @Override
    public List<SysWarn> selectToday(SysWarnVO sysWarnVO) {
        return sysWarnDao.selectToday(sysWarnVO);
    }

    @Override
    public List<SysWarn> selectByCondition(SysWarnVO sysWarnVO) {
       // PageHelper.startPage(sysWarnVO.getPageNumber(), sysWarnVO.getPageSize());
        return sysWarnDao.selectByCondition(sysWarnVO);
    }


    @Override
    public void update(SysWarnVO sysWarnVO) {
        Integer id = sysWarnVO.getId();
        String truth = sysWarnVO.getTruth();
        // 构建查询条件
        QueryWrapper<SysWarn> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        // 构建实体对象并设置要更新的字段
        SysWarn sysWarn = new SysWarn();
        sysWarn.setTruth(truth);
        // 执行更新操作
        sysWarnDao.update(sysWarn, queryWrapper);
    }

    @Override
    public void updataContent(SysWarnVO sysWarnVO) {
        Integer id = sysWarnVO.getId();
        String content = sysWarnVO.getContent();
        // 构建查询条件
        QueryWrapper<SysWarn> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        // 构建实体对象并设置要更新的字段
        SysWarn sysWarn = new SysWarn();
        sysWarn.setContent(content);
        sysWarnDao.update(sysWarn,queryWrapper);
    }

    @Override
    public void deleteWarn(SysWarnVO sysWarnVO) {
        Integer id = sysWarnVO.getId();
        // 构建查询条件
        QueryWrapper<SysWarn> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        sysWarnDao.delete(queryWrapper);
    }

    @Override
    public PageResult<SysWarnVO> page(SysWarnQuery query) {
        IPage<SysWarn> page = baseMapper.selectPage(getPage(query), getWrapper(query));
        return new PageResult<>(SysWarnConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }
    private LambdaQueryWrapper<SysWarn> getWrapper(SysWarnQuery query) {
        LambdaQueryWrapper<SysWarn> wrapper = Wrappers.lambdaQuery();
        wrapper.like(StrUtil.isNotBlank(query.getRobotsn()), SysWarn::getRobotsn, query.getRobotsn());
        wrapper.orderByDesc(SysWarn::getId);
        return wrapper;
    }



}
