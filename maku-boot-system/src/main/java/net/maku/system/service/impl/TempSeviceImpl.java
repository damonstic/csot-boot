package net.maku.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import net.maku.system.dao.TempDao;
import net.maku.system.entity.Align;
import net.maku.system.entity.Temp;
import net.maku.system.service.TempService;
import org.springframework.stereotype.Service;

@Service
public class TempSeviceImpl implements TempService {
    private final TempDao tempDao;

    public TempSeviceImpl(TempDao tempDao) {
        this.tempDao = tempDao;
    }

    @Override
    public Temp findTemp(String robotsn) {
        Temp temp = tempDao.selectOne(Wrappers.<Temp>lambdaQuery().eq(Temp::getRobotsn, robotsn));
        return temp;
    }

    @Override
    public void updateTemp(Temp temp) {
        UpdateWrapper<Temp> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("robotsn",temp.getRobotsn());
        tempDao.update(temp,updateWrapper);
    }
}
