package net.maku.system.service;

import net.maku.system.entity.Hand;

public interface HandService {
    Hand findHand(String robotsn);
    void updateHand(Hand hand);
}
