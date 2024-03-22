package net.maku.system.controller;

import net.maku.framework.common.utils.Result;
import net.maku.system.entity.Align;
import net.maku.system.entity.Vacuum;
import net.maku.system.service.VacuumService;
import net.maku.system.vo.AlignVO;
import net.maku.system.vo.VacuumVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vacuum/threshold")
public class VacuumController {
    private final VacuumService vacuumService;

    public VacuumController(VacuumService vacuumService) {
        this.vacuumService = vacuumService;
    }

    @PostMapping("/maxmin")
    public Result<Vacuum> getVacuumByRobotsn(@RequestBody VacuumVO vacuumVO) {
        String robotsn = vacuumVO.getRobotsn();
        Vacuum vacuum = vacuumService.findVacuum(robotsn);
        System.out.println("发送"+ vacuum);
        if (vacuum != null) {
            return Result.ok(vacuum);
        } else {
            return Result.ok();
        }
    }

    @PostMapping("/change")
    public Result<Vacuum> ChangeVacuumByRobotsn(@RequestBody VacuumVO vacuumVO) {
        Vacuum vacuum = new Vacuum(
                vacuumVO.getRobotsn(),
                vacuumVO.getUpper_max(),
                vacuumVO.getUpper_min(),
                vacuumVO.getLower_max(),
                vacuumVO.getLower_min()
        );
        vacuum.setRobotsn(vacuumVO.getRobotsn());
        vacuum.setUpper_max(vacuumVO.getUpper_max());
        vacuum.setUpper_min(vacuumVO.getUpper_min());
        vacuum.setLower_max(vacuumVO.getLower_max());
        vacuum.setLower_min(vacuumVO.getLower_min());
        vacuumService.updateVacuum(vacuum);
        Vacuum vacuum1 = vacuumService.findVacuum(vacuumVO.getRobotsn());
        if (vacuum1 != null) {
            return Result.ok(vacuum1);
        } else {
            return Result.ok();
        }
    }
}
