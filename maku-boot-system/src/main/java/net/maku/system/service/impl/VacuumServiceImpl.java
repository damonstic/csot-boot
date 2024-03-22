package net.maku.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import net.maku.system.dao.VacuumDao;
import net.maku.system.entity.Vacuum;
import net.maku.system.service.VacuumService;
import org.springframework.stereotype.Service;

@Service
public class VacuumServiceImpl implements VacuumService {
    private final VacuumDao vacuumDao;

    public VacuumServiceImpl(VacuumDao vacuumDao) {
        this.vacuumDao = vacuumDao;
    }

    @Override
    public Vacuum findVacuum(String robotsn) {
        Vacuum vacuum = vacuumDao.selectOne(Wrappers.<Vacuum>lambdaQuery().eq(Vacuum::getRobotsn, robotsn));
        return vacuum;
    }

    @Override
    public void updateVacuum(Vacuum vacuum) {
        UpdateWrapper<Vacuum> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("robotsn",vacuum.getRobotsn());
        vacuumDao.update(vacuum,updateWrapper);
    }
}
