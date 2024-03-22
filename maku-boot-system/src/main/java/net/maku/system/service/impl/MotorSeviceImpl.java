package net.maku.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import net.maku.system.dao.MotorDao;
import net.maku.system.entity.Motor;
import net.maku.system.entity.Temp;
import net.maku.system.service.MotorService;
import org.springframework.stereotype.Service;

@Service
public class MotorSeviceImpl implements MotorService {
    private final MotorDao motorDao;

    public MotorSeviceImpl(MotorDao motorDao) {
        this.motorDao = motorDao;
    }

    @Override
    public Motor findMotor(String robotsn) {
        Motor motor = motorDao.selectOne(Wrappers.<Motor>lambdaQuery().eq(Motor::getRobotsn, robotsn));
        return motor;
    }

    @Override
    public void updateMotor(Motor motor) {
        UpdateWrapper<Motor> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("robotsn",motor.getRobotsn());
        motorDao.update(motor,updateWrapper);
    }
}
