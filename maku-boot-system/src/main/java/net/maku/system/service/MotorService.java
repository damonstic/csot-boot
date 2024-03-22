package net.maku.system.service;

import net.maku.system.entity.Motor;

public interface MotorService {
    Motor findMotor(String robotsn);
    void updateMotor(Motor motor);
}
