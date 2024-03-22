package net.maku.system.controller;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.SankyoAlign;
import net.maku.system.entity.SankyoHand;
import net.maku.system.service.SankyoHandService;
import net.maku.system.vo.SankyoAlignVO;
import net.maku.system.vo.SankyoHandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("csot/sankyo/hand")
@AllArgsConstructor
public class SankyoHandController {
    @Autowired
    private SankyoHandService sankyoHandService;

    @PostMapping("/dataAll")
    public Result<List<SankyoHand>> findAll(@RequestBody SankyoHandVO sankyoHandVO){
        List<SankyoHand> list = sankyoHandService.findAll(sankyoHandVO);
        if (list != null) {
            return Result.ok(list);
        } else {
            return Result.ok();
        }
    }
}
