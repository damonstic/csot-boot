package net.maku.system.service;

import com.datastax.oss.driver.api.core.PagingIterable;
import com.datastax.oss.driver.api.core.cql.*;
import jakarta.annotation.Resource;
import net.maku.system.dao.RoboJointVelDao;
import net.maku.system.entity.RoboJointVel;
import net.maku.system.entity.RoboTorque;
import net.maku.system.vo.RoboJointVelVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static org.springframework.data.cassandra.core.query.Criteria.where;

@Service
public class RoboJointVelService {
    @Resource
    CassandraTemplate cassandraTemplate;
    private final RoboJointVelDao roboJointVelDao;

    public RoboJointVelService(RoboJointVelDao roboJointVelDao) {
        this.roboJointVelDao = roboJointVelDao;
    }

    public List<RoboJointVel> findAll(RoboJointVelVO roboJointVelVO){
        Query query = Query.empty();
        Timestamp timestamp_start = Timestamp.valueOf(roboJointVelVO.getStartTime());
        Timestamp timestamp_end = Timestamp.valueOf(roboJointVelVO.getEndTime());
        String robotsn = roboJointVelVO.getRobotsn().trim();
        if(StringUtils.isNotBlank(robotsn)){
            query = query.and(where("jointvel_robotsn").is(robotsn));
        }
        if(StringUtils.isNotBlank(roboJointVelVO.getStartTime())){
            query = query.and(where("jointvel_datetime").gte(timestamp_start));
        }
        if(StringUtils.isNotBlank(roboJointVelVO.getEndTime())){
            query = query.and(where("jointvel_datetime").lte(timestamp_end));
        }
        Sort sort = Sort.by(Sort.Direction.ASC, "jointvel_datetime");
        query = query.sort(sort);
        //分页查询

        List<RoboJointVel> list = cassandraTemplate.select(query, RoboJointVel.class);


        if (StringUtils.isNotBlank(roboJointVelVO.getStartTime()) && StringUtils.isNotBlank(roboJointVelVO.getEndTime())) {
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

    List<RoboJointVel> getMaxValuesYear(List<RoboJointVel> list) {
        Map<LocalDateTime, Map<Integer, RoboJointVel>> maxValuesPerYear = new TreeMap<>();
        for (RoboJointVel entity : list) {
            LocalDateTime dateTime = entity.getJointvel_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.YEARS);
            Map<Integer, RoboJointVel> maxValuesForYear = maxValuesPerYear.getOrDefault(roundedTime, new HashMap<>());
            for (int i = 1; i <= 120; i++) {
                RoboJointVel existingEntity = maxValuesForYear.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForYear.put(i, entity);
                }
            }
            maxValuesPerYear.put(roundedTime, maxValuesForYear);
        }
        List<RoboJointVel> result = new ArrayList<>();
        for (Map<Integer, RoboJointVel> valuesForMinute : maxValuesPerYear.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getJointvel_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboJointVel> getMaxValuesMonth(List<RoboJointVel> list) {
        Map<LocalDateTime, Map<Integer, RoboJointVel>> maxValuesPerMonth = new TreeMap<>();
        for (RoboJointVel entity : list) {
            LocalDateTime dateTime = entity.getJointvel_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.DAYS);
            Map<Integer, RoboJointVel> maxValuesForMonth = maxValuesPerMonth.getOrDefault(roundedTime, new HashMap<>());
            for (int i = 1; i <= 12; i++) {
                RoboJointVel existingEntity = maxValuesForMonth.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForMonth.put(i, entity);
                }
            }
            maxValuesPerMonth.put(roundedTime, maxValuesForMonth);
        }
        List<RoboJointVel> result = new ArrayList<>();
        for (Map<Integer, RoboJointVel> valuesForMinute : maxValuesPerMonth.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getJointvel_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboJointVel> getMaxValuesWeek(List<RoboJointVel> list) {
        Map<LocalDateTime, Map<Integer, RoboJointVel>> maxValuesPerWeek = new TreeMap<>();
        for (RoboJointVel entity : list) {
            LocalDateTime dateTime = entity.getJointvel_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.HOURS); // 取整到小时
            Map<Integer, RoboJointVel> maxValuesForWeek = maxValuesPerWeek.getOrDefault(dateTime, new HashMap<>());
            for (int i = 1; i <= 2; i++) {
                RoboJointVel existingEntity = maxValuesForWeek.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForWeek.put(i, entity);
                }
            }
            maxValuesPerWeek.put(roundedTime, maxValuesForWeek);
        }
        List<RoboJointVel> result = new ArrayList<>();
        for (Map<Integer, RoboJointVel> valuesForMinute : maxValuesPerWeek.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getJointvel_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboJointVel> getMaxValueDay(List<RoboJointVel> list) {
        Map<LocalDateTime, Map<Integer, RoboJointVel>> maxValuesPerDay = new TreeMap<>();
        for (RoboJointVel entity : list) {
            LocalDateTime dateTime = entity.getJointvel_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.MINUTES); // 取整到分钟
            Map<Integer, RoboJointVel> maxValuesForDay = maxValuesPerDay.getOrDefault(roundedTime, new HashMap<>()); //当Map集合中有roundedTime,使用value值，否则new HashMap
            for (int i = 1; i <= 1; i++) {
                RoboJointVel existingEntity = maxValuesForDay.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForDay.put(i, entity);
                }
            }
            maxValuesPerDay.put(roundedTime, maxValuesForDay);
        }
        List<RoboJointVel> result = new ArrayList<>();
        for (Map<Integer, RoboJointVel> valuesForMinute : maxValuesPerDay.values()) {
            result.addAll(valuesForMinute.values());
        }
        // 对结果按 datatime 进行排序
        Collections.sort(result, Comparator.comparing(entity -> entity.getJointvel_datetime().toLocalDateTime()));
        return result;
    }


    boolean isBetter(double newValue, double existingValue) {
        // 这里根据你的业务逻辑来判断哪个值更好
        return newValue > existingValue;
    }

    private double getMaxAlignValue(RoboJointVel entity, int coordinateIndex) {
        switch (coordinateIndex) {
            case 1:
                return getValueOrDefault(entity.getJointvel_axis1_err_speed(), 0.0);
            case 2:
                return getValueOrDefault(entity.getJointvel_axis2_err_speed(), 0.0);
            case 3:
                return getValueOrDefault(entity.getJointvel_axis3_err_speed(), 0.0);
            case 4:
                return getValueOrDefault(entity.getJointvel_axis4_err_speed(), 0.0);
            case 5:
                return getValueOrDefault(entity.getJointvel_axis5_err_speed(), 0);
            case 6:
                return getValueOrDefault(entity.getJointvel_axis6_err_speed(), 0);
            case 7:
                return getValueOrDefault(entity.getJointvel_axis7_err_speed(), 0);
            case 8:
                return getValueOrDefault(entity.getJointvel_axis8_err_speed(), 0);
            default:
                return 0.0;
        }
    }
    private double getValueOrDefault(Double value, double defaultValue) {
        return value != null ? value : defaultValue;
    }


}
