package net.maku.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import net.maku.system.dao.HandDao;
import net.maku.system.entity.Hand;
import net.maku.system.service.HandService;
import org.springframework.stereotype.Service;

@Service
public class HandServiceImpl implements HandService {
    private final HandDao handDao;

    public HandServiceImpl(HandDao handDao) {
        this.handDao = handDao;
    }

    @Override
    public Hand findHand(String robotsn) {
        Hand hand = handDao.selectOne(Wrappers.<Hand>lambdaQuery().eq(Hand::getRobotsn, robotsn));
        return hand;
    }

    @Override
    public void updateHand(Hand hand) {
        UpdateWrapper<Hand> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("robotsn",hand.getRobotsn());
        handDao.update(hand,updateWrapper);
    }
}
