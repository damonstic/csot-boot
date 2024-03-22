package net.maku.system.controller;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.RoboJointVel;
import net.maku.system.entity.RoboRpm;
import net.maku.system.service.RoboRpmSevice;
import net.maku.system.vo.RoboJointVelVO;
import net.maku.system.vo.RoboRpmVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("csot/robostar/rpm")
@AllArgsConstructor
public class RoboRpmController {
    @Autowired
    private RoboRpmSevice roboRpmSevice;

    @PostMapping("/dataAll")
    public Result<List<RoboRpm>> findAll(@RequestBody RoboRpmVO roboRpmVO){
        List<RoboRpm> list = roboRpmSevice.findAll(roboRpmVO);
        if (list != null) {
            return Result.ok(list);
        } else {
            return Result.ok();
        }
    }
}
