package net.maku.system.controller;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.RoboTorque;
import net.maku.system.service.RoboTorqueService;
import net.maku.system.vo.RoboTorqueVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("csot/robostar/torque")
@AllArgsConstructor
public class RoboTorqueController {
    @Autowired
    private RoboTorqueService roboTorqueService;

    @PostMapping("/dataAll")
    public Result<List<RoboTorque>> findAll(@RequestBody RoboTorqueVO roboTorqueVO){
        List<RoboTorque> list = roboTorqueService.findAll(roboTorqueVO);
        if (list != null) {
            return Result.ok(list);
        } else {
            return Result.ok();
        }
    }
}
