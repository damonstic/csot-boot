package net.maku.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import net.maku.system.dao.TorqueDao;
import net.maku.system.entity.Torque;
import net.maku.system.service.TorqueService;
import org.springframework.stereotype.Service;

@Service
public class TorqueServiceImpl implements TorqueService {
    private final TorqueDao torqueDao;

    public TorqueServiceImpl(TorqueDao torqueDao) {
        this.torqueDao = torqueDao;
    }

    @Override
    public Torque findTorque(String robotsn) {
        Torque torque = torqueDao.selectOne(Wrappers.<Torque>lambdaQuery().eq(Torque::getRobotsn, robotsn));
        return torque;
    }

    @Override
    public void updateTorque(Torque torque) {
        UpdateWrapper<Torque> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("robotsn",torque.getRobotsn());
        torqueDao.update(torque,updateWrapper);
    }
}
