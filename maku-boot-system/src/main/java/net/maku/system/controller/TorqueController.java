package net.maku.system.controller;

import net.maku.framework.common.utils.Result;
import net.maku.system.entity.Motor;
import net.maku.system.entity.Torque;
import net.maku.system.service.TorqueService;
import net.maku.system.vo.MotorVO;
import net.maku.system.vo.TorqueVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("torque/threshold")
public class TorqueController {
    private final TorqueService torqueService;

    public TorqueController(TorqueService torqueService) {
        this.torqueService = torqueService;
    }

    @PostMapping("/maxmin")
    public Result<Torque> getTorqueByRobotsn(@RequestBody TorqueVO torqueVO) {
        String robotsn = torqueVO.getRobotsn();
        Torque torque = torqueService.findTorque(robotsn);
        if (torque != null) {
            return Result.ok(torque);
        } else {
            return Result.ok();
        }
    }

    //  这里需要转int类型还是直接变字段为double？
    @PostMapping("/change")
    public Result<Torque> ChangeTorqueByRobotsn(@RequestBody TorqueVO torqueVO) {
            Torque torque = new Torque(
                torqueVO.getRobotsn(),
                torqueVO.getTorque1_max(),
                torqueVO.getTorque1_min(),
                torqueVO.getTorque2_max(),
                torqueVO.getTorque2_min(),
                torqueVO.getTorque3_max(),
                torqueVO.getTorque3_min(),
                torqueVO.getTorque4_max(),
                torqueVO.getTorque4_min(),
                torqueVO.getTorque5_max(),
                torqueVO.getTorque5_min(),
                torqueVO.getTorque6_max(),
                torqueVO.getTorque6_min(),
                torqueVO.getTorque7_max(),
                torqueVO.getTorque7_min(),
                torqueVO.getTorque8_max(),
                torqueVO.getTorque8_min()
        );
        torque.setRobotsn(torqueVO.getRobotsn());
        torque.setTorque1_max(torqueVO.getTorque1_max());
        torque.setTorque1_min(torqueVO.getTorque1_min());
        torque.setTorque2_max(torqueVO.getTorque2_max());
        torque.setTorque2_min(torqueVO.getTorque2_min());
        torque.setTorque3_max(torqueVO.getTorque3_max());
        torque.setTorque3_min(torqueVO.getTorque3_min());
        torque.setTorque4_max(torqueVO.getTorque4_max());
        torque.setTorque4_min(torqueVO.getTorque4_min());
        torque.setTorque5_max(torqueVO.getTorque5_max());
        torque.setTorque5_min(torqueVO.getTorque5_min());
        torque.setTorque6_max(torqueVO.getTorque6_max());
        torque.setTorque6_min(torqueVO.getTorque6_min());
        torque.setTorque7_max(torqueVO.getTorque7_max());
        torque.setTorque7_min(torqueVO.getTorque7_min());
        torque.setTorque8_max(torqueVO.getTorque8_max());
        torque.setTorque8_min(torqueVO.getTorque8_min());

        torqueService.updateTorque(torque);
        Torque torque1 = torqueService.findTorque(torqueVO.getRobotsn());
        if (torque1 != null) {
            return Result.ok(torque1);
        } else {
            return Result.ok();
        }
    }
}
