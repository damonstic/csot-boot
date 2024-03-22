package net.maku.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import net.maku.system.dao.LineTactDao;
import net.maku.system.entity.LineTact;
import net.maku.system.entity.Servo;
import net.maku.system.service.LineTactService;
import org.springframework.stereotype.Service;

@Service
public class LineTactServiceImpl implements LineTactService {
    private final LineTactDao lineTactDao;

    public LineTactServiceImpl(LineTactDao lineTactDao) {
        this.lineTactDao = lineTactDao;
    }

    @Override
    public LineTact findLineTact(String robotsn) {
        LineTact lineTact = lineTactDao.selectOne(Wrappers.<LineTact>lambdaQuery().eq(LineTact::getRobotsn,robotsn));
        System.out.println("Retrieved LineTact: " + lineTact);
        return lineTact;
    }

    @Override
    public void updateLineTact(LineTact lineTact) {
        UpdateWrapper<LineTact> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("robotsn",lineTact.getRobotsn());
        lineTactDao.update(lineTact,updateWrapper);
    }
}
