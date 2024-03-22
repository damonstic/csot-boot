package net.maku.system.service;

import net.maku.system.entity.Vacuum;

public interface VacuumService {
    Vacuum findVacuum(String robotsn);
    void updateVacuum(Vacuum vacuum);
}
