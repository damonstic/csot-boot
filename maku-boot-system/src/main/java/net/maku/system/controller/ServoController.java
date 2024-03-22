package net.maku.system.controller;

import net.maku.framework.common.utils.Result;
import net.maku.system.entity.Servo;
import net.maku.system.service.ServoService;
import net.maku.system.vo.ServoVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("servo/threshold")
public class ServoController {
    private final ServoService servoService;

    public ServoController(ServoService servoService) {
        this.servoService = servoService;
    }

    @PostMapping("/maxmin")
    public Result<Servo> getServoByRobotsn(@RequestBody ServoVO servoVO) {
        String robotsn = servoVO.getRobotsn();
        Servo servo = servoService.findServo(robotsn);
        System.out.println("发送"+ servo);
        if (servo != null) {
            return Result.ok(servo);
        } else {
            return Result.ok();
        }
    }

    @PostMapping("/change")
    public Result<Servo> ChangeServoByRobotsn(@RequestBody ServoVO servoVO) {
        Servo servo = new Servo(
                servoVO.getRobotsn(),
                servoVO.getTorque1_max(),
                servoVO.getTorque1_min(),
                servoVO.getTorque2_max(),
                servoVO.getTorque2_min(),
                servoVO.getTorque3_max(),
                servoVO.getTorque3_min(),
                servoVO.getTorque4_max(),
                servoVO.getTorque4_min(),
                servoVO.getTorque5_max(),
                servoVO.getTorque5_min(),
                servoVO.getTorque6_max(),
                servoVO.getTorque6_min(),
                servoVO.getTorque7_max(),
                servoVO.getTorque7_min(),
                servoVO.getTorque8_max(),
                servoVO.getTorque8_min(),
                servoVO.getPulse1_max(),
                servoVO.getPulse1_min(),
                servoVO.getPulse2_max(),
                servoVO.getPulse2_min(),
                servoVO.getPulse3_max(),
                servoVO.getPulse3_min(),
                servoVO.getPulse4_max(),
                servoVO.getPulse4_min(),
                servoVO.getPulse5_max(),
                servoVO.getPulse5_min(),
                servoVO.getPulse6_max(),
                servoVO.getPulse6_min(),
                servoVO.getPulse7_max(),
                servoVO.getPulse7_min(),
                servoVO.getPulse8_max(),
                servoVO.getPulse8_min()
        );
        servo.setRobotsn(servoVO.getRobotsn());
        servo.setTorque1_max(servoVO.getTorque1_max());
        servo.setTorque1_min(servoVO.getTorque1_min());
        servo.setTorque2_max(servoVO.getTorque2_max());
        servo.setTorque2_min(servoVO.getTorque2_min());
        servo.setTorque3_max(servoVO.getTorque3_max());
        servo.setTorque3_min(servoVO.getTorque3_min());
        servo.setTorque4_max(servoVO.getTorque4_max());
        servo.setTorque4_min(servoVO.getTorque4_min());
        servo.setTorque5_max(servoVO.getTorque5_max());
        servo.setTorque5_min(servoVO.getTorque5_min());
        servo.setTorque6_max(servoVO.getTorque6_max());
        servo.setTorque6_min(servoVO.getTorque6_min());
        servo.setTorque7_max(servoVO.getTorque7_max());
        servo.setTorque7_min(servoVO.getTorque7_min());
        servo.setTorque8_max(servoVO.getTorque8_max());
        servo.setTorque8_min(servoVO.getTorque8_min());

        servo.setPulse1_max(servoVO.getPulse1_max());
        servo.setPulse1_min(servoVO.getPulse1_min());
        servo.setPulse2_max(servoVO.getPulse2_max());
        servo.setPulse2_min(servoVO.getPulse2_min());
        servo.setPulse3_max(servoVO.getPulse3_max());
        servo.setPulse3_min(servoVO.getPulse3_min());
        servo.setPulse4_max(servoVO.getPulse4_max());
        servo.setPulse4_min(servoVO.getPulse4_min());
        servo.setPulse5_max(servoVO.getPulse5_max());
        servo.setPulse5_min(servoVO.getPulse5_min());
        servo.setPulse6_max(servoVO.getPulse6_max());
        servo.setPulse6_min(servoVO.getPulse6_min());
        servo.setPulse7_max(servoVO.getPulse7_max());
        servo.setPulse7_min(servoVO.getPulse7_min());
        servo.setPulse8_max(servoVO.getPulse8_max());
        servo.setPulse8_min(servoVO.getPulse8_min());

        servoService.updateServo(servo);
        Servo servo1 = servoService.findServo(servoVO.getRobotsn());
        if (servo1 != null) {
            return Result.ok(servo1);
        } else {
            return Result.ok();
        }
       //return Result.ok();
    }

}
