package net.maku.system.controller;

import net.maku.framework.common.utils.Result;
import net.maku.system.entity.JointVel;
import net.maku.system.entity.Rpm;
import net.maku.system.service.RpmSerice;
import net.maku.system.vo.JointVelVO;
import net.maku.system.vo.RpmVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rpm/threshold")
public class RpmController {
    private final RpmSerice rpmSerice;

    public RpmController(RpmSerice rpmSerice) {
        this.rpmSerice = rpmSerice;
    }

    @PostMapping("/maxmin")
    public Result<Rpm> getRpmByRobotsn(@RequestBody RpmVO rpmVO) {
        String robotsn = rpmVO.getRobotsn();
        Rpm rpm = rpmSerice.findRpm(robotsn);
        if (rpm != null) {
            return Result.ok(rpm);
        } else {
            return Result.ok();
        }
    }

    //  这里需要转int类型还是直接变字段为double？
    @PostMapping("/change")
    public Result<Rpm> ChangeRpmByRobotsn(@RequestBody RpmVO rpmVO) {
        Rpm rpm = new Rpm(
                rpmVO.getRobotsn(),
                rpmVO.getSpeed1_max(),
                rpmVO.getSpeed1_min(),
                rpmVO.getSpeed2_max(),
                rpmVO.getSpeed2_min(),
                rpmVO.getSpeed3_max(),
                rpmVO.getSpeed3_min(),
                rpmVO.getSpeed4_max(),
                rpmVO.getSpeed4_min(),
                rpmVO.getSpeed5_max(),
                rpmVO.getSpeed5_min(),
                rpmVO.getSpeed6_max(),
                rpmVO.getSpeed6_min(),
                rpmVO.getSpeed7_max(),
                rpmVO.getSpeed7_min(),
                rpmVO.getSpeed8_max(),
                rpmVO.getSpeed8_min()

        );
        rpm.setRobotsn(rpmVO.getRobotsn());
        rpm.setSpeed1_max(rpmVO.getSpeed1_max());
        rpm.setSpeed1_min(rpmVO.getSpeed1_min());
        rpm.setSpeed2_max(rpmVO.getSpeed2_max());
        rpm.setSpeed2_min(rpmVO.getSpeed2_min());
        rpm.setSpeed3_max(rpmVO.getSpeed3_max());
        rpm.setSpeed3_min(rpmVO.getSpeed3_min());
        rpm.setSpeed4_max(rpmVO.getSpeed4_max());
        rpm.setSpeed4_min(rpmVO.getSpeed4_min());
        rpm.setSpeed5_max(rpmVO.getSpeed5_max());
        rpm.setSpeed5_min(rpmVO.getSpeed5_min());
        rpm.setSpeed6_max(rpmVO.getSpeed6_max());
        rpm.setSpeed6_min(rpmVO.getSpeed6_min());
        rpm.setSpeed7_max(rpmVO.getSpeed7_max());
        rpm.setSpeed7_min(rpmVO.getSpeed7_min());
        rpm.setSpeed8_max(rpmVO.getSpeed8_max());
        rpm.setSpeed8_min(rpmVO.getSpeed8_min());
        rpmSerice.updateRpm(rpm);
        Rpm rpm1 = rpmSerice.findRpm(rpm.getRobotsn());
        if (rpm1 != null) {
            return Result.ok(rpm1);
        } else {
            return Result.ok();
        }

    }
}
