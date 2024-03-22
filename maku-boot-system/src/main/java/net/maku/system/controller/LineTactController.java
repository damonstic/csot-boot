package net.maku.system.controller;

import net.maku.framework.common.utils.Result;
import net.maku.system.entity.LineTact;
import net.maku.system.service.LineTactService;
import net.maku.system.vo.LineTactVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("linetact/threshold")
public class LineTactController {
    private final LineTactService lineTactService;

    public LineTactController(LineTactService lineTactService) {
        this.lineTactService = lineTactService;
    }

    @PostMapping("/maxmin")
    public Result<LineTact> getLineTactByRobotsn(@RequestBody LineTactVO lineTactVO) {
        String robotsn = lineTactVO.getRobotsn();
        LineTact lineTact = lineTactService.findLineTact(robotsn);
        if (lineTact != null) {
            return Result.ok(lineTact);
        } else {
            return Result.ok();
        }
    }

    @PostMapping("/change")
    public Result<LineTact> ChangeLineTactByRobotsn(@RequestBody LineTactVO lineTactVO){
        LineTact lineTact = new LineTact(
                lineTactVO.getRobotsn(),
                lineTactVO.getVelp1_max(),
                lineTactVO.getVelp1_min(),
                lineTactVO.getVelp2_max(),
                lineTactVO.getVelp2_min(),
                lineTactVO.getVelp3_max(),
                lineTactVO.getVelp3_min(),
                lineTactVO.getVelp4_max(),
                lineTactVO.getVelp4_min(),
                lineTactVO.getVelp5_max(),
                lineTactVO.getVelp5_min(),
                lineTactVO.getVelp6_max(),
                lineTactVO.getVelp6_min()
        );
        lineTact.setRobotsn(lineTactVO.getRobotsn());
        lineTact.setVelp1_max(lineTactVO.getVelp1_max());
        lineTact.setVelp1_min(lineTactVO.getVelp1_min());
        lineTact.setVelp2_max(lineTactVO.getVelp2_max());
        lineTact.setVelp2_min(lineTactVO.getVelp2_min());
        lineTact.setVelp3_max(lineTactVO.getVelp3_max());
        lineTact.setVelp3_min(lineTactVO.getVelp3_min());
        lineTact.setVelp4_max(lineTactVO.getVelp4_max());
        lineTact.setVelp4_min(lineTactVO.getVelp4_min());
        lineTact.setVelp5_max(lineTactVO.getVelp5_max());
        lineTact.setVelp5_min(lineTactVO.getVelp5_min());
        lineTact.setVelp6_max(lineTactVO.getVelp6_max());
        lineTact.setVelp6_min(lineTactVO.getVelp6_min());
        lineTact.setVelp7_max(lineTactVO.getVelp7_max());
        lineTact.setVelp7_min(lineTactVO.getVelp7_min());
        lineTact.setVelp8_max(lineTactVO.getVelp8_max());
        lineTact.setVelp8_min(lineTactVO.getVelp8_min());

        lineTactService.updateLineTact(lineTact);
        LineTact lineTact1 = lineTactService.findLineTact(lineTactVO.getRobotsn());
        if (lineTact1 != null) {
            return Result.ok(lineTact1);
        } else {
            return Result.ok();
        }
    }
}
