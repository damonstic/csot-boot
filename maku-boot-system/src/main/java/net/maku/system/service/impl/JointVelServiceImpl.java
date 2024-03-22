package net.maku.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import net.maku.system.dao.JointVelDao;
import net.maku.system.entity.JointVel;
import net.maku.system.entity.Motor;
import net.maku.system.service.JointVelService;
import org.springframework.stereotype.Service;

@Service
public class JointVelServiceImpl implements JointVelService {
    private final JointVelDao jointVelDao;

    public JointVelServiceImpl(JointVelDao jointVelDao) {
        this.jointVelDao = jointVelDao;
    }

    @Override
    public JointVel findJointVel(String robotsn) {
        return jointVelDao.selectOne(Wrappers.<JointVel>lambdaQuery().eq(JointVel::getRobotsn, robotsn));
    }

    @Override
    public void updateJointVel(JointVel jointVel) {
        UpdateWrapper<JointVel> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("robotsn",jointVel.getRobotsn());
        jointVelDao.update(jointVel,updateWrapper);
    }
}
