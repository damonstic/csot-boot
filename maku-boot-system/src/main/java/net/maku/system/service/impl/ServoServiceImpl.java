package net.maku.system.service.impl;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import net.maku.system.dao.ServoDao;
import net.maku.system.entity.Servo;
import net.maku.system.service.ServoService;
import net.maku.system.vo.ServoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServoServiceImpl implements ServoService {
    private final ServoDao servoDao;

    @Autowired
    public ServoServiceImpl(ServoDao servoDao) {
        this.servoDao = servoDao;
    }

    @Override
    public Servo findServo(String robotsn) {
        System.out.println("robotsn: " + robotsn);
        //List<Servo> servoList = servoDao.selectList(Wrappers.<Servo>lambdaQuery().eq(Servo::getRobotsn, robotsn));
        //System.out.println(servoList);
        Servo servo = servoDao.selectOne(Wrappers.<Servo>lambdaQuery().eq(Servo::getRobotsn, robotsn));
        System.out.println("Retrieved servo: " + servo);
        return servo;
    }


    @Override
    public void updateServo(Servo servo) {
        UpdateWrapper<Servo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("robotsn",servo.getRobotsn());
        servoDao.update(servo,updateWrapper);
    }


}
