package net.maku.system.controller;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.SankyoLineTact;
import net.maku.system.entity.SankyoServo;
import net.maku.system.service.SankyoLineTactService;
import net.maku.system.vo.SankyoLineTactVO;
import net.maku.system.vo.SankyoServoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("csot/sankyo/linetact")
@AllArgsConstructor
public class SankyoLineTactController {
    @Autowired
    private SankyoLineTactService sankyoLineTactService;

    @PostMapping("/dataAll")
    public Result<List<SankyoLineTact>> findAll(@RequestBody SankyoLineTactVO sankyoLineTactVO){
        List<SankyoLineTact> list = sankyoLineTactService.findAll(sankyoLineTactVO);
        if (list != null) {
            return Result.ok(list);
        } else {
            return Result.ok();
        }
    }
}
