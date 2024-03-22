package net.maku.system.service;

import net.maku.system.entity.LineTact;

public interface LineTactService {
    LineTact findLineTact(String robotsn);
    void updateLineTact(LineTact lineTact);
}
