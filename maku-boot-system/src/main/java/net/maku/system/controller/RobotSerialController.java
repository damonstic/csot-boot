package net.maku.system.controller;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.RobotSerial;
import net.maku.system.entity.SankyoServo;
import net.maku.system.service.RobotSerialService;
import net.maku.system.vo.RobotSerialVO;
import net.maku.system.vo.SankyoServoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("csot/robot")
@AllArgsConstructor
public class RobotSerialController {
    @Autowired
    private RobotSerialService robotSerialService;

    @PostMapping("/dataRobot")
    public Result<List<RobotSerial>> findAll(){
        List<RobotSerial> list = robotSerialService.findAll();
        return Result.ok(list);
    }
    @PostMapping("/dataType")
    public Result<List<RobotSerial>> findType(@RequestBody RobotSerialVO robotSerialVO){
        List<RobotSerial> list = robotSerialService.findType(robotSerialVO);
        return Result.ok(list);
    }
}
