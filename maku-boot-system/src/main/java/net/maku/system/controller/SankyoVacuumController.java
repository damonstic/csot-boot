package net.maku.system.controller;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.SankyoAlign;
import net.maku.system.entity.SankyoVacuum;
import net.maku.system.service.SankyoVacuumService;
import net.maku.system.vo.SankyoAlignVO;
import net.maku.system.vo.SankyoVacuumVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("csot/sankyo/vacuum")
@AllArgsConstructor
public class SankyoVacuumController {
    @Autowired
    private SankyoVacuumService sankyoVacuumService;

    @PostMapping("/dataAll")
    public Result<List<SankyoVacuum>> findAll(@RequestBody SankyoVacuumVO sankyoVacuumVO){
        List<SankyoVacuum> list = sankyoVacuumService.findAll(sankyoVacuumVO);
        if (list != null) {
            return Result.ok(list);
        } else {
            return Result.ok();
        }
    }
}
