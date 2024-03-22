package net.maku.system.service;

import net.maku.system.entity.Temp;

public interface TempService {
    Temp findTemp(String robotsn);
    void updateTemp(Temp temp);
}
