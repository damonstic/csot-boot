package net.maku.system.service;

import net.maku.system.entity.Rpm;

public interface RpmSerice {
    Rpm findRpm(String robotsn);
    void updateRpm(Rpm rpm);
}
