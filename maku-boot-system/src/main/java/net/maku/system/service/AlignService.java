package net.maku.system.service;

import net.maku.system.entity.Align;

public interface AlignService {
    Align findAlign(String robotsn);
    void updateAlign(Align align);
}
