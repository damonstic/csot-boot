package net.maku.system.controller;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.RoboMotorTemp;
import net.maku.system.service.RoboMotorSevice;
import net.maku.system.vo.RoboMotorVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("csot/robostar/temp")
@AllArgsConstructor
public class RoboMotorController {
    @Autowired
    private RoboMotorSevice roboMotorSevice;

    @PostMapping("/dataAll")
    public Result<List<RoboMotorTemp>> findAll(@RequestBody RoboMotorVO roboMotorVO){
        List<RoboMotorTemp> list = roboMotorSevice.findAll(roboMotorVO);
        if (list != null) {
            return Result.ok(list);
        } else {
            return Result.ok();
        }
    }
}
