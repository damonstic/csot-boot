package net.maku.system.controller;

import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.SankyoTemp;
import net.maku.system.service.SankyoTempService;
import net.maku.system.vo.SankyoTempVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("csot/sankyo/temp")
@AllArgsConstructor
public class SankyoTempController {
    @Autowired
    private SankyoTempService sankyoTempService;

    @PostMapping("/dataAll")
    public Result<List<SankyoTemp>> findAll(@RequestBody SankyoTempVO sankyoTempVO){
        List<SankyoTemp> list = sankyoTempService.findAll(sankyoTempVO);
        //极值
        if (list != null) {
            return Result.ok(list);
        } else {
            return Result.ok();
        }
    }
}
