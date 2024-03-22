package net.maku.system.controller;

import net.maku.framework.common.utils.Result;
import net.maku.system.entity.JointVel;
import net.maku.system.entity.Motor;
import net.maku.system.service.JointVelService;
import net.maku.system.vo.JointVelVO;
import net.maku.system.vo.MotorVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jointVel/threshold")
public class JointVelController {
    private final JointVelService jointVelService;

    public JointVelController(JointVelService jointVelService) {
        this.jointVelService = jointVelService;
    }

    @PostMapping("/maxmin")
    public Result<JointVel> getJointVelByRobotsn(@RequestBody JointVelVO jointVelVO) {
        String robotsn = jointVelVO.getRobotsn();
        JointVel jointVel = jointVelService.findJointVel(robotsn);
        if (jointVel != null) {
            return Result.ok(jointVel);
        } else {
            return Result.ok();
        }
    }

    //  这里需要转int类型还是直接变字段为double？
    @PostMapping("/change")
    public Result<JointVel> ChangeJointVelByRobotsn(@RequestBody JointVelVO jointVelVO) {
        JointVel jointVel = new JointVel(
                jointVelVO.getRobotsn(),
                jointVelVO.getSpeed1_max(),
                jointVelVO.getSpeed1_min(),
                jointVelVO.getSpeed2_max(),
                jointVelVO.getSpeed2_min(),
                jointVelVO.getSpeed3_max(),
                jointVelVO.getSpeed3_min(),
                jointVelVO.getSpeed4_max(),
                jointVelVO.getSpeed4_min(),
                jointVelVO.getSpeed5_max(),
                jointVelVO.getSpeed5_min(),
                jointVelVO.getSpeed6_max(),
                jointVelVO.getSpeed6_min(),
                jointVelVO.getSpeed7_max(),
                jointVelVO.getSpeed7_min(),
                jointVelVO.getSpeed8_max(),
                jointVelVO.getSpeed8_min()
        );
        jointVel.setRobotsn(jointVelVO.getRobotsn());
        jointVel.setSpeed1_max(jointVelVO.getSpeed1_max());
        jointVel.setSpeed1_min(jointVelVO.getSpeed1_min());
        jointVel.setSpeed2_max(jointVelVO.getSpeed2_max());
        jointVel.setSpeed2_min(jointVelVO.getSpeed2_min());
        jointVel.setSpeed3_max(jointVelVO.getSpeed3_max());
        jointVel.setSpeed3_min(jointVelVO.getSpeed3_min());
        jointVel.setSpeed4_max(jointVelVO.getSpeed4_max());
        jointVel.setSpeed4_min(jointVelVO.getSpeed4_min());
        jointVel.setSpeed5_max(jointVelVO.getSpeed5_max());
        jointVel.setSpeed5_min(jointVelVO.getSpeed5_min());
        jointVel.setSpeed6_max(jointVelVO.getSpeed6_max());
        jointVel.setSpeed6_min(jointVelVO.getSpeed6_min());
        jointVel.setSpeed7_max(jointVelVO.getSpeed7_max());
        jointVel.setSpeed7_min(jointVelVO.getSpeed7_min());
        jointVel.setSpeed8_max(jointVelVO.getSpeed8_max());
        jointVel.setSpeed8_min(jointVelVO.getSpeed8_min());
        jointVelService.updateJointVel(jointVel);
        JointVel jointVel1 = jointVelService.findJointVel(jointVel.getRobotsn());
        if (jointVel1 != null) {
            return Result.ok(jointVel1);
        } else {
            return Result.ok();
        }

    }
}
