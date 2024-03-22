package net.maku.system.controller;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.RoboJointVel;
import net.maku.system.service.RoboJointVelService;
import net.maku.system.vo.RoboJointVelVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("csot/robostar/jointVel")
@AllArgsConstructor
public class RoboJointVelController {
    @Autowired
    private RoboJointVelService roboJointVelService;

    @PostMapping("/dataAll")
    public Result<List<RoboJointVel>> findAll(@RequestBody RoboJointVelVO roboJointVelVO){
        List<RoboJointVel> list = roboJointVelService.findAll(roboJointVelVO);
        if (list != null) {
            return Result.ok(list);
        } else {
            return Result.ok();
        }
    }

}
