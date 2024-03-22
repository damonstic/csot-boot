package net.maku.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import net.maku.system.dao.RpmDao;
import net.maku.system.entity.JointVel;
import net.maku.system.entity.Rpm;
import net.maku.system.service.RpmSerice;
import org.springframework.stereotype.Service;

@Service
public class RpmServiceImpl implements RpmSerice {
    private final RpmDao rpmDao;

    public RpmServiceImpl(RpmDao rpmDao) {
        this.rpmDao = rpmDao;
    }

    @Override
    public Rpm findRpm(String robotsn) {
        Rpm rpm = rpmDao.selectOne(Wrappers.<Rpm>lambdaQuery().eq(Rpm::getRobotsn, robotsn));
        return rpm;
    }

    @Override
    public void updateRpm(Rpm rpm) {
        UpdateWrapper<Rpm> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("robotsn",rpm.getRobotsn());
        rpmDao.update(rpm,updateWrapper);
    }
}
