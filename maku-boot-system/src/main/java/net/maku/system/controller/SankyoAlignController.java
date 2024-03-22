package net.maku.system.controller;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.SankyoAlign;
import net.maku.system.entity.SankyoLineTact;
import net.maku.system.service.SankyoAlignService;
import net.maku.system.vo.SankyoAlignVO;
import net.maku.system.vo.SankyoLineTactVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("csot/sankyo/align")
@AllArgsConstructor
public class SankyoAlignController {
    @Autowired
    private SankyoAlignService sankyoAlignService;

    @PostMapping("/dataAll")
    public Result<List<SankyoAlign>> findAll(@RequestBody SankyoAlignVO sankyoAlignVO){
        List<SankyoAlign> list = sankyoAlignService.findAll(sankyoAlignVO);
        if (list != null) {
            return Result.ok(list);
        } else {
            return Result.ok();
        }
    }

}
