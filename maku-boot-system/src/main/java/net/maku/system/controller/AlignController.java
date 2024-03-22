package net.maku.system.controller;

import net.maku.framework.common.utils.Result;
import net.maku.system.entity.Align;
import net.maku.system.entity.Servo;
import net.maku.system.service.AlignService;
import net.maku.system.vo.AlignVO;
import net.maku.system.vo.ServoVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("align/threshold")
public class AlignController {
    private final AlignService alignService;

    public AlignController(AlignService alignService) {
        this.alignService = alignService;
    }

    @PostMapping("/maxmin")
    public Result<Align> getAlignByRobotsn(@RequestBody AlignVO alignVO) {
        String robotsn = alignVO.getRobotsn();
        Align align = alignService.findAlign(robotsn);
        System.out.println("发送"+ align);
        if (align != null) {
            return Result.ok(align);
        } else {
            return Result.ok();
        }
    }

    @PostMapping("/change")
    public Result<Align> ChangeAlignByRobotsn(@RequestBody AlignVO alignVO) {
        Align align = new Align(
                alignVO.getRobotsn(),
                alignVO.getAxis1_r_max(),
                alignVO.getAxis1_r_min(),
                alignVO.getAxis2_r_max(),
                alignVO.getAxis2_r_min(),
                alignVO.getAxis3_r_max(),
                alignVO.getAxis3_r_min(),
                alignVO.getAxis4_r_max(),
                alignVO.getAxis4_r_min(),
                alignVO.getAxis5_r_max(),
                alignVO.getAxis5_r_min(),
                alignVO.getAxis6_r_max(),
                alignVO.getAxis6_r_min(),
                alignVO.getAxis7_r_max(),
                alignVO.getAxis7_r_min(),
                alignVO.getAxis8_r_max(),
                alignVO.getAxis8_r_min(),
                alignVO.getAxis1_x_max(),
                alignVO.getAxis1_x_min(),
                alignVO.getAxis2_x_max(),
                alignVO.getAxis2_x_min(),
                alignVO.getAxis3_x_max(),
                alignVO.getAxis3_x_min(),
                alignVO.getAxis4_x_max(),
                alignVO.getAxis4_x_min(),
                alignVO.getAxis5_x_max(),
                alignVO.getAxis5_x_min(),
                alignVO.getAxis6_x_max(),
                alignVO.getAxis6_x_min(),
                alignVO.getAxis7_x_max(),
                alignVO.getAxis7_x_min(),
                alignVO.getAxis8_x_max(),
                alignVO.getAxis8_x_min()
        );
        align.setRobotsn(alignVO.getRobotsn());
        align.setAxis1_r_max(alignVO.getAxis1_r_max());
        align.setAxis1_r_min(alignVO.getAxis1_r_min());
        align.setAxis2_r_max(alignVO.getAxis2_r_max());
        align.setAxis2_r_min(alignVO.getAxis2_r_min());
        align.setAxis3_r_max(alignVO.getAxis3_r_max());
        align.setAxis3_r_min(alignVO.getAxis3_r_min());
        align.setAxis4_r_max(alignVO.getAxis4_r_max());
        align.setAxis4_r_min(alignVO.getAxis4_r_min());
        align.setAxis5_r_max(alignVO.getAxis5_r_max());
        align.setAxis5_r_min(alignVO.getAxis5_r_min());
        align.setAxis6_r_max(alignVO.getAxis6_r_max());
        align.setAxis6_r_min(alignVO.getAxis6_r_min());
        align.setAxis7_r_max(alignVO.getAxis7_r_max());
        align.setAxis7_r_min(alignVO.getAxis7_r_min());
        align.setAxis8_r_max(alignVO.getAxis8_r_max());
        align.setAxis8_r_min(alignVO.getAxis8_r_min());

        align.setAxis1_x_max(alignVO.getAxis1_x_max());
        align.setAxis1_x_min(alignVO.getAxis1_x_min());
        align.setAxis2_x_max(alignVO.getAxis2_x_max());
        align.setAxis2_x_min(alignVO.getAxis2_x_min());
        align.setAxis3_x_max(alignVO.getAxis3_x_max());
        align.setAxis3_x_min(alignVO.getAxis3_x_min());
        align.setAxis4_x_max(alignVO.getAxis4_x_max());
        align.setAxis4_x_min(alignVO.getAxis4_x_min());
        align.setAxis5_x_max(alignVO.getAxis5_x_max());
        align.setAxis5_x_min(alignVO.getAxis5_x_min());
        align.setAxis6_x_max(alignVO.getAxis6_x_max());
        align.setAxis6_x_min(alignVO.getAxis6_x_min());
        align.setAxis7_x_max(alignVO.getAxis7_x_max());
        align.setAxis7_x_min(alignVO.getAxis7_x_min());
        align.setAxis8_x_max(alignVO.getAxis8_x_max());
        align.setAxis8_x_min(alignVO.getAxis8_x_min());

        alignService.updateAlign(align);
        Align align1 = alignService.findAlign(alignVO.getRobotsn());
        if (align1 != null) {
            return Result.ok(align1);
        } else {
            return Result.ok();
        }
    }
}
