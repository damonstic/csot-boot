package net.maku.system.config;

import net.maku.system.dao.RobotSerialDao;
import net.maku.system.entity.RoboMotorTemp;
import net.maku.system.entity.RobotSerial;
import net.maku.system.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class timeTask {
    @Autowired
    private RobotSerialService robotSerialService;
    @Autowired
    private RobotSerialDao robotSerialDao;
    @Autowired
    private RoboJointVelService roboJointVelService;
    @Autowired
    private RoboMotorSevice roboMotorSevice;
    @Autowired
    private RoboRpmSevice roboRpmSevice;
    @Autowired
    private RoboTorqueService  roboTorqueService;


    @Scheduled(fixedRate = 180000)
    public void run() {
        // 获取所有robotsn
        List<String> robotsnList = getAllRobotsn();
        // 获取当前时间
        LocalDateTime currentTime = LocalDateTime.now();
        for (String robotsn : robotsnList) {
            RoboMotorTemp latestData = roboMotorSevice.findLatestDataByRobotsn(robotsn);
            if(latestData!= null){
                Timestamp timestamp = latestData.getMotortemp_datetime();
                LocalDateTime dataTime = timestamp.toLocalDateTime();
                // 计算时间差
                long hoursDiff = Duration.between(dataTime, currentTime).toHours();
                // 更新Robotserialy数据表中的connection_status
                if (hoursDiff > 6) {
                    robotSerialService.updateConnectionStatus(robotsn, "OFF");
                } else if(hoursDiff>=3 && hoursDiff <= 6) {
                    robotSerialService.updateConnectionStatus(robotsn, "IN");
                }else{
                    robotSerialService.updateConnectionStatus(robotsn, "ON");
                }
                // 将datetime转成字符串并存到upload_time字段中
                Timestamp uploadTime = latestData.getMotortemp_datetime();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                String uploadTimeString = formatter.format(uploadTime);
                robotSerialService.updateUploadTime(robotsn, uploadTimeString);

            }
        }

    }

    private List<String> getAllRobotsn() {
        List<String> robotsnList = new ArrayList<>();
        Iterable<RobotSerial> robotEntities = robotSerialDao.findAll();
        for (RobotSerial robotEntity : robotEntities) {
            robotsnList.add(robotEntity.getRobotsn());
        }
        return robotsnList;
    }
}
