package net.maku.system.controller;

import net.maku.framework.common.utils.Result;
import net.maku.system.entity.Align;
import net.maku.system.entity.Temp;
import net.maku.system.service.TempService;
import net.maku.system.vo.AlignVO;
import net.maku.system.vo.TempVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("temp/threshold")
public class TempController {
    private final TempService tempService;

    public TempController(TempService tempService) {
        this.tempService = tempService;
    }

    @PostMapping("/maxmin")
    public Result<Temp> getTempByRobotsn(@RequestBody TempVO tempVO) {
        String robotsn = tempVO.getRobotsn();
        Temp temp = tempService.findTemp(robotsn);
        System.out.println("发送"+ temp);
        if (temp != null) {
            return Result.ok(temp);
        } else {
            return Result.ok();
        }
    }

    @PostMapping("/change")
    public Result<Temp> ChangeTempByRobotsn(@RequestBody TempVO tempVO) {
        Temp temp = new Temp(
                tempVO.getTemp1_max(),
                tempVO.getTemp1_min(),
                tempVO.getTemp2_max(),
                tempVO.getTemp2_min(),
                tempVO.getTemp3_max(),
                tempVO.getTemp3_min(),
                tempVO.getTemp4_max(),
                tempVO.getTemp4_min(),
                tempVO.getTemp5_max(),
                tempVO.getTemp5_min(),
                tempVO.getTemp6_max(),
                tempVO.getTemp6_min(),
                tempVO.getTemp7_max(),
                tempVO.getTemp7_min(),
                tempVO.getTemp8_max(),
                tempVO.getTemp8_min()
        );
        temp.setRobotsn(tempVO.getRobotsn());
        temp.setTemp1_max(tempVO.getTemp1_max());
        temp.setTemp1_min(tempVO.getTemp1_min());
        temp.setTemp2_max(tempVO.getTemp2_max());
        temp.setTemp2_min(tempVO.getTemp2_min());
        temp.setTemp3_max(tempVO.getTemp3_max());
        temp.setTemp3_min(tempVO.getTemp3_min());
        temp.setTemp4_max(tempVO.getTemp4_max());
        temp.setTemp4_min(tempVO.getTemp4_min());
        temp.setTemp5_max(tempVO.getTemp5_max());
        temp.setTemp5_min(tempVO.getTemp5_min());
        temp.setTemp6_max(tempVO.getTemp6_max());
        temp.setTemp6_min(tempVO.getTemp6_min());
        temp.setTemp7_max(tempVO.getTemp7_max());
        temp.setTemp7_min(tempVO.getTemp7_min());
        temp.setTemp8_max(tempVO.getTemp8_max());
        temp.setTemp8_min(tempVO.getTemp8_min());
        tempService.updateTemp(temp);
        Temp temp1 = tempService.findTemp(tempVO.getRobotsn());
        if (temp1 != null) {
            return Result.ok(temp1);
        } else {
            return Result.ok();
        }
    }

}
