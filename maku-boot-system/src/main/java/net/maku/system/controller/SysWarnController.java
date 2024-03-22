package net.maku.system.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.framework.common.utils.Result;
import net.maku.system.entity.Email;
import net.maku.system.entity.SysWarn;
import net.maku.system.query.SysLogLoginQuery;
import net.maku.system.query.SysWarnQuery;
import net.maku.system.service.MailService;
import net.maku.system.service.SysWarnService;
import net.maku.system.vo.MailVO;
import net.maku.system.vo.SysLogLoginVO;
import net.maku.system.vo.SysWarnVO;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sys/warn")
@AllArgsConstructor
public class SysWarnController {
    @Autowired
    private SysWarnService sysWarnService;
    @Autowired
    private MailService mailService;


    //刷新时
    @PostMapping("/robotsn")
    public Result<List<SysWarn>> getListByRobotsn(){
        List<SysWarn> list = sysWarnService.selectAll();
        return Result.ok(list);
    }

    @PostMapping("/broad")
    public Result<List<SysWarn>> getBroadByRobotsn(@RequestBody SysWarnVO sysWarnVO){
        List<SysWarn> list = sysWarnService.selectToday(sysWarnVO);
        return Result.ok(list);
    }

    //条件筛选
    @PostMapping("/condition")
    public Result<List<SysWarn>> getConditionWarn(@RequestBody SysWarnVO sysWarnVO) {
        // 设置分页 当前页码PageNumber,每页显示条数pageSize
        //PageHelper.startPage(sysWarnVO.getPageNumber(), sysWarnVO.getPageSize());
        List<SysWarn> list = sysWarnService.selectByCondition(sysWarnVO);
       // long total = sysWarnService.countByCondition(sysWarnVO); // 这里假设有一个方法用来统计满足条件的数据总数
        return Result.ok(list);
    }

    @GetMapping("/page")
    @Operation(summary = "分页")
    public Result<PageResult<SysWarnVO>> page(@ParameterObject @Valid SysWarnQuery query) {
        PageResult<SysWarnVO> page = sysWarnService.page(query);

        return Result.ok(page);
    }

    @PostMapping("/update")
    public Result<List<SysWarn>> getUpdateWarn(@RequestBody SysWarnVO sysWarnVO){
        sysWarnService.update(sysWarnVO);
        List<SysWarn> list = sysWarnService.selectAll();
        return Result.ok(list);
    }

    @PostMapping("/insert")
    public Result<List<SysWarn>> getInsertWarn(@RequestBody SysWarnVO sysWarnVO){
        sysWarnService.updataContent(sysWarnVO);
        List<SysWarn> list = sysWarnService.selectAll();
        return Result.ok(list);
    }

    @PostMapping("/delete")
    public Result<List<SysWarn>> getDeleteWarn(@RequestBody SysWarnVO sysWarnVO){
        sysWarnService.deleteWarn(sysWarnVO);
        List<SysWarn> list = sysWarnService.selectAll();
        return Result.ok(list);
    }

    @PostMapping("/mail")
    public Result<List<Email>> getMailWarn(){
        List<Email> list = mailService.selectAll();
        return Result.ok(list);
    }
    @PostMapping("/mailAdd")
    public Result<List<Email>> getMailAddWarn(@RequestBody MailVO mailVO){
        mailService.addMail(mailVO);
        List<Email> list = mailService.selectAll();
        return Result.ok(list);
    }
    @PostMapping("/mailUpd")
    public Result<List<Email>> getMailUpdWarn(@RequestBody MailVO mailVO){
        mailService.updataMail(mailVO);
        List<Email> list = mailService.selectAll();
        return Result.ok(list);
    }
    @PostMapping("/mailDel")
    public Result<List<Email>> getMailDelWarn(@RequestBody MailVO mailVO){
        mailService.deleteMail(mailVO);
        List<Email> list = mailService.selectAll();
        return Result.ok(list);
    }
}
