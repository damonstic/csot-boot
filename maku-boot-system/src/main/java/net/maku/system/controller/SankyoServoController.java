package net.maku.system.controller;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.SankyoServo;
import net.maku.system.service.SankyoServoService;
import net.maku.system.vo.SankyoServoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("csot/sankyo/servo")
@AllArgsConstructor
public class SankyoServoController {
    @Autowired
    private SankyoServoService sankyoServoService;

    @PostMapping("/dataAll")
    public Result<List<SankyoServo>> findAll(@RequestBody SankyoServoVO sankyoServoVO){
        List<SankyoServo> list = sankyoServoService.findAll(sankyoServoVO);
        if (list != null) {
            return Result.ok(list);
        } else {
            return Result.ok();
        }
    }
}
