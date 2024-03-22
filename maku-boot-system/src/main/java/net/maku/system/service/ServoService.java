package net.maku.system.service;

import net.maku.system.entity.Servo;

public interface ServoService {
    Servo findServo(String robotsn);
    void updateServo(Servo servo);
}
