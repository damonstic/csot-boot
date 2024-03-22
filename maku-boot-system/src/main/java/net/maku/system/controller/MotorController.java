package net.maku.system.controller;

import net.maku.framework.common.utils.Result;
import net.maku.system.entity.Motor;
import net.maku.system.entity.Temp;
import net.maku.system.service.MotorService;
import net.maku.system.vo.MotorVO;
import net.maku.system.vo.TempVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("motor/threshold")
public class MotorController {
    private final MotorService motorService;

    public MotorController(MotorService motorService) {
        this.motorService = motorService;
    }

    @PostMapping("/maxmin")
    public Result<Motor> getMotorByRobotsn(@RequestBody MotorVO motorVO) {
        String robotsn = motorVO.getRobotsn();
        Motor motor = motorService.findMotor(robotsn);
        System.out.println("发送"+ motor);
        if (motor != null) {
            return Result.ok(motor);
        } else {
            return Result.ok();
        }
    }

//  这里需要转int类型还是直接变字段为double？
    @PostMapping("/change")
    public Result<Motor> ChangeMotorByRobotsn(@RequestBody MotorVO motorVO) {
        Motor motor = new Motor(
                motorVO.getRobotsn(),
                motorVO.getTemp1_max(),
                motorVO.getTemp1_min(),
                motorVO.getTemp2_max(),
                motorVO.getTemp2_min(),
                motorVO.getTemp3_max(),
                motorVO.getTemp3_min(),
                motorVO.getTemp4_max(),
                motorVO.getTemp4_min(),
                motorVO.getTemp5_max(),
                motorVO.getTemp5_min(),
                motorVO.getTemp6_max(),
                motorVO.getTemp6_min(),
                motorVO.getTemp7_max(),
                motorVO.getTemp7_min(),
                motorVO.getTemp8_max(),
                motorVO.getTemp8_min()
        );
        motor.setRobotsn(motorVO.getRobotsn());
        motor.setTemp1_max(motorVO.getTemp1_max());
        motor.setTemp1_min(motorVO.getTemp1_min());
        motor.setTemp2_max(motorVO.getTemp2_max());
        motor.setTemp2_min(motorVO.getTemp2_min());
        motor.setTemp3_max(motorVO.getTemp3_max());
        motor.setTemp3_min(motorVO.getTemp3_min());
        motor.setTemp4_max(motorVO.getTemp4_max());
        motor.setTemp4_min(motorVO.getTemp4_min());
        motor.setTemp5_max(motorVO.getTemp5_max());
        motor.setTemp5_min(motorVO.getTemp5_min());
        motor.setTemp6_max(motorVO.getTemp6_max());
        motor.setTemp6_min(motorVO.getTemp6_min());
        motor.setTemp7_max(motorVO.getTemp7_max());
        motor.setTemp7_min(motorVO.getTemp7_min());
        motor.setTemp8_max(motorVO.getTemp8_max());
        motor.setTemp8_min(motorVO.getTemp8_min());

        motorService.updateMotor(motor);
        Motor motor1 = motorService.findMotor(motorVO.getRobotsn());
        if (motor1 != null) {
            return Result.ok(motor1);
        } else {
            return Result.ok();
        }
    }
}
