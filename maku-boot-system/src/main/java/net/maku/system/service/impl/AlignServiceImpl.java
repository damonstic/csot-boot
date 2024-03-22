package net.maku.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import net.maku.system.dao.AlignDao;
import net.maku.system.entity.Align;
import net.maku.system.service.AlignService;
import org.springframework.stereotype.Service;

@Service
public class AlignServiceImpl implements AlignService {
    private final AlignDao alignDao;

    public AlignServiceImpl(AlignDao alignDao) {
        this.alignDao = alignDao;
    }

    @Override
    public Align findAlign(String robotsn) {
        Align align = alignDao.selectOne(Wrappers.<Align>lambdaQuery().eq(Align::getRobotsn, robotsn));
        return align;
    }

    @Override
    public void updateAlign(Align align) {
        UpdateWrapper<Align> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("robotsn",align.getRobotsn());
        alignDao.update(align,updateWrapper);
    }
}
