package net.maku.system.controller;

import net.maku.framework.common.utils.Result;
import net.maku.system.entity.Align;
import net.maku.system.entity.Hand;
import net.maku.system.service.HandService;
import net.maku.system.vo.AlignVO;
import net.maku.system.vo.HandVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hand/threshold")
public class HandController {
    private final HandService handService;

    public HandController(HandService handService) {
        this.handService = handService;
    }

    @PostMapping("/maxmin")
    public Result<Hand> getHandByRobotsn(@RequestBody HandVO handVO) {
        String robotsn = handVO.getRobotsn();
        Hand hand = handService.findHand(robotsn);
        System.out.println("发送"+ hand);
        if (hand != null) {
            return Result.ok(hand);
        } else {
            return Result.ok();
        }
    }

    @PostMapping("/change")
    public Result<Hand> ChangeHandByRobotsn(@RequestBody HandVO handVO) {
        Hand hand = new Hand(
                handVO.getRobotsn(),
                handVO.getZpos_start_max(),
                handVO.getZpos_start_min(),
                handVO.getZpos1_on_max(),
                handVO.getZpos1_on_min(),
                handVO.getZpos1_diff_max(),
                handVO.getZpos1_diff_min(),
                handVO.getZpos2_on_max(),
                handVO.getZpos2_on_min(),
                handVO.getZpos2_diff_max(),
                handVO.getZpos2_diff_min()
        );
        hand.setRobotsn(handVO.getRobotsn());
        hand.setZpos_start_max(handVO.getZpos_start_max());
        hand.setZpos_start_min(handVO.getZpos_start_min());
        hand.setZpos1_on_max(handVO.getZpos1_on_max());
        hand.setZpos1_on_min(handVO.getZpos1_on_min());
        hand.setZpos1_diff_max(handVO.getZpos1_diff_max());
        hand.setZpos1_diff_min(handVO.getZpos1_diff_min());
        hand.setZpos2_on_max(handVO.getZpos2_on_max());
        hand.setZpos2_on_min(handVO.getZpos2_on_min());
        hand.setZpos2_diff_max(handVO.getZpos2_diff_max());
        hand.setZpos2_diff_min(handVO.getZpos2_diff_min());

        handService.updateHand(hand);
        Hand hand1 = handService.findHand(handVO.getRobotsn());
        if (hand1 != null) {
            return Result.ok(hand1);
        } else {
            return Result.ok();
        }
    }
}
