package net.maku.system.service;

import net.maku.system.entity.JointVel;

public interface JointVelService {
    JointVel findJointVel(String robotsn);
    void updateJointVel(JointVel jointVel);
}
