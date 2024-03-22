package net.maku.system.service;

import jakarta.annotation.Resource;
import net.maku.system.dao.RoboRpmDao;
import net.maku.system.entity.RoboJointVel;
import net.maku.system.entity.RoboMotorTemp;
import net.maku.system.entity.RoboRpm;
import net.maku.system.vo.RoboJointVelVO;
import net.maku.system.vo.RoboRpmVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static org.springframework.data.cassandra.core.query.Criteria.where;

@Service
public class RoboRpmSevice {
    @Resource
    CassandraTemplate cassandraTemplate;
    private final RoboRpmDao roboRpmDao;

    public RoboRpmSevice(RoboRpmDao roboRpmDao) {
        this.roboRpmDao = roboRpmDao;
    }
    public List<RoboRpm> findAll(RoboRpmVO roboRpmVO){
        Query query = Query.empty();
        Timestamp timestamp_start = Timestamp.valueOf(roboRpmVO.getStartTime());
        Timestamp timestamp_end = Timestamp.valueOf(roboRpmVO.getEndTime());
        String robotsn = roboRpmVO.getRobotsn().trim();
        if(StringUtils.isNotBlank(robotsn)){
            query = query.and(where("motorrpm_robotsn").is(robotsn));
        }
        if(StringUtils.isNotBlank(roboRpmVO.getStartTime())){
            query = query.and(where("motorrpm_datetime").gte(timestamp_start));
        }
        if(StringUtils.isNotBlank(roboRpmVO.getEndTime())){
            query = query.and(where("motorrpm_datetime").lte(timestamp_end));
        }
        Sort sort = Sort.by(Sort.Direction.ASC, "motorrpm_datetime");
        query = query.sort(sort);
        List<RoboRpm> list = cassandraTemplate.select(query, RoboRpm.class);
        if (StringUtils.isNotBlank(roboRpmVO.getStartTime()) && StringUtils.isNotBlank(roboRpmVO.getEndTime())) {
            // 计算时间范围
            long diffInDays = ChronoUnit.DAYS.between(timestamp_start.toLocalDateTime().toLocalDate(), timestamp_end.toLocalDateTime().toLocalDate());

            if (diffInDays > 1 && diffInDays <= 7) {
                // 筛选每小时2条，7天满足336条
                return getMaxValuesWeek(list);
            } else if (diffInDays > 7 && diffInDays <= 31) {
                // 筛选每天12条，30天满足360条
                return getMaxValuesMonth(list);
            }
            else if (diffInDays > 31 && diffInDays <= 366) {
                // 筛选每年120条，满足1年120条
                return getMaxValuesYear(list);
            }else if (diffInDays <= 1){
                //每分钟120条，筛选为1分钟1条，24h满足1440条
                return getMaxValueDay(list);
            }
        }
        return list;
    }

    List<RoboRpm> getMaxValuesYear(List<RoboRpm> list) {
        Map<LocalDateTime, Map<Integer, RoboRpm>> maxValuesPerYear = new TreeMap<>();
        for (RoboRpm entity : list) {
            LocalDateTime dateTime = entity.getMotorrpm_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.YEARS);
            Map<Integer, RoboRpm> maxValuesForYear = maxValuesPerYear.getOrDefault(roundedTime, new HashMap<>());
            for (int i = 1; i <= 120; i++) {
                RoboRpm existingEntity = maxValuesForYear.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForYear.put(i, entity);
                }
            }
            maxValuesPerYear.put(roundedTime, maxValuesForYear);
        }
        List<RoboRpm> result = new ArrayList<>();
        for (Map<Integer, RoboRpm> valuesForMinute : maxValuesPerYear.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotorrpm_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboRpm> getMaxValuesMonth(List<RoboRpm> list) {
        Map<LocalDateTime, Map<Integer, RoboRpm>> maxValuesPerMonth = new TreeMap<>();
        for (RoboRpm entity : list) {
            LocalDateTime dateTime = entity.getMotorrpm_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.DAYS);
            Map<Integer, RoboRpm> maxValuesForMonth = maxValuesPerMonth.getOrDefault(roundedTime, new HashMap<>());
            for (int i = 1; i <= 12; i++) {
                RoboRpm existingEntity = maxValuesForMonth.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForMonth.put(i, entity);
                }
            }
            maxValuesPerMonth.put(roundedTime, maxValuesForMonth);
        }
        List<RoboRpm> result = new ArrayList<>();
        for (Map<Integer, RoboRpm> valuesForMinute : maxValuesPerMonth.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotorrpm_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboRpm> getMaxValuesWeek(List<RoboRpm> list) {
        Map<LocalDateTime, Map<Integer, RoboRpm>> maxValuesPerWeek = new TreeMap<>();
        for (RoboRpm entity : list) {
            LocalDateTime dateTime = entity.getMotorrpm_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.HOURS); // 取整到小时
            Map<Integer, RoboRpm> maxValuesForWeek = maxValuesPerWeek.getOrDefault(dateTime, new HashMap<>());
            for (int i = 1; i <= 2; i++) {
                RoboRpm existingEntity = maxValuesForWeek.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForWeek.put(i, entity);
                }
            }
            maxValuesPerWeek.put(roundedTime, maxValuesForWeek);
        }
        List<RoboRpm> result = new ArrayList<>();
        for (Map<Integer, RoboRpm> valuesForMinute : maxValuesPerWeek.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotorrpm_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboRpm> getMaxValueDay(List<RoboRpm> list) {
        Map<LocalDateTime, Map<Integer, RoboRpm>> maxValuesPerDay = new TreeMap<>();
        for (RoboRpm entity : list) {
            LocalDateTime dateTime = entity.getMotorrpm_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.MINUTES); // 取整到分钟
            Map<Integer, RoboRpm> maxValuesForDay = maxValuesPerDay.getOrDefault(roundedTime, new HashMap<>()); //当Map集合中有roundedTime,使用value值，否则new HashMap
            for (int i = 1; i <= 1; i++) {
                RoboRpm existingEntity = maxValuesForDay.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForDay.put(i, entity);
                }
            }
            maxValuesPerDay.put(roundedTime, maxValuesForDay);
        }
        List<RoboRpm> result = new ArrayList<>();
        for (Map<Integer, RoboRpm> valuesForMinute : maxValuesPerDay.values()) {
            result.addAll(valuesForMinute.values());
        }
        // 对结果按 datatime 进行排序
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotorrpm_datetime().toLocalDateTime()));
        return result;
    }


    boolean isBetter(double newValue, double existingValue) {
        // 这里根据你的业务逻辑来判断哪个值更好
        return newValue > existingValue;
    }

    private double getMaxAlignValue(RoboRpm entity, int coordinateIndex) {
        switch (coordinateIndex) {
            case 1:
                return getValueOrDefault(entity.getMotorrpm_axis1_speed(), 0.0);
            case 2:
                return getValueOrDefault(entity.getMotorrpm_axis2_speed(), 0.0);
            case 3:
                return getValueOrDefault(entity.getMotorrpm_axis3_speed(), 0.0);
            case 4:
                return getValueOrDefault(entity.getMotorrpm_axis4_speed(), 0.0);
            case 5:
                return getValueOrDefault(entity.getMotorrpm_axis5_speed(), 0);
            case 6:
                return getValueOrDefault(entity.getMotorrpm_axis6_speed(), 0);
            case 7:
                return getValueOrDefault(entity.getMotorrpm_axis7_speed(), 0);
            case 8:
                return getValueOrDefault(entity.getMotorrpm_axis8_speed(), 0);
            default:
                return 0.0;
        }
    }
    private double getValueOrDefault(Double value, double defaultValue) {
        return value != null ? value : defaultValue;
    }
}
