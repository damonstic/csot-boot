package net.maku.system.service;

import net.maku.system.entity.Torque;

public interface TorqueService {
    Torque findTorque(String robotsn);
    void updateTorque(Torque torque);
}
