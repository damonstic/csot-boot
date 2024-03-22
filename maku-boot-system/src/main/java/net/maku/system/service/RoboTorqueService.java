package net.maku.system.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import jakarta.annotation.Resource;
import net.maku.system.dao.RoboTorqueDao;
import net.maku.system.entity.RoboTorque;
import net.maku.system.vo.RoboTorqueVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.cql.QueryOptions;
import org.springframework.data.cassandra.core.query.Criteria;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static org.springframework.data.cassandra.core.query.Criteria.where;

@Service
public class RoboTorqueService {
    @Resource
    CassandraTemplate cassandraTemplate;
    private final RoboTorqueDao roboTorqueDao;

    public RoboTorqueService(RoboTorqueDao roboTorqueDao) {
        this.roboTorqueDao = roboTorqueDao;
    }
    public List<RoboTorque> findAll(RoboTorqueVO roboTorqueVO){
        Query query = Query.empty();
        Timestamp timestamp_start = Timestamp.valueOf(roboTorqueVO.getStartTime());
        Timestamp timestamp_end = Timestamp.valueOf(roboTorqueVO.getEndTime());
        String robotsn = roboTorqueVO.getRobotsn().trim();
        if(StringUtils.isNotBlank(robotsn)){
            query = query.and(where("motortorque_robotsn").is(robotsn));
        }
        if(StringUtils.isNotBlank(roboTorqueVO.getStartTime())){
            query = query.and(where("motortorque_datetime").gte(timestamp_start));
        }
        if(StringUtils.isNotBlank(roboTorqueVO.getEndTime())){
            query = query.and(where("motortorque_datetime").lte(timestamp_end));
        }
        Sort sort = Sort.by(Sort.Direction.ASC, "motortorque_datetime");
        query = query.sort(sort);
        List<RoboTorque> list = cassandraTemplate.select(query, RoboTorque.class);

        if (StringUtils.isNotBlank(roboTorqueVO.getStartTime()) && StringUtils.isNotBlank(roboTorqueVO.getEndTime())) {
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

    List<RoboTorque> getMaxValuesYear(List<RoboTorque> list) {
        Map<LocalDateTime, Map<Integer, RoboTorque>> maxValuesPerYear = new TreeMap<>();
        for (RoboTorque entity : list) {
            LocalDateTime dateTime = entity.getMotortorque_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.YEARS);
            Map<Integer, RoboTorque> maxValuesForYear = maxValuesPerYear.getOrDefault(roundedTime, new HashMap<>());
            for (int i = 1; i <= 120; i++) {
                RoboTorque existingEntity = maxValuesForYear.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForYear.put(i, entity);
                }
            }
            maxValuesPerYear.put(roundedTime, maxValuesForYear);
        }
        List<RoboTorque> result = new ArrayList<>();
        for (Map<Integer, RoboTorque> valuesForMinute : maxValuesPerYear.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotortorque_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboTorque> getMaxValuesMonth(List<RoboTorque> list) {
        Map<LocalDateTime, Map<Integer, RoboTorque>> maxValuesPerMonth = new TreeMap<>();
        for (RoboTorque entity : list) {
            LocalDateTime dateTime = entity.getMotortorque_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.DAYS);
            Map<Integer, RoboTorque> maxValuesForMonth = maxValuesPerMonth.getOrDefault(roundedTime, new HashMap<>());
            for (int i = 1; i <= 12; i++) {
                RoboTorque existingEntity = maxValuesForMonth.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForMonth.put(i, entity);
                }
            }
            maxValuesPerMonth.put(roundedTime, maxValuesForMonth);
        }
        List<RoboTorque> result = new ArrayList<>();
        for (Map<Integer, RoboTorque> valuesForMinute : maxValuesPerMonth.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotortorque_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboTorque> getMaxValuesWeek(List<RoboTorque> list) {
        Map<LocalDateTime, Map<Integer, RoboTorque>> maxValuesPerWeek = new TreeMap<>();
        for (RoboTorque entity : list) {
            LocalDateTime dateTime = entity.getMotortorque_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.HOURS); // 取整到小时
            Map<Integer, RoboTorque> maxValuesForWeek = maxValuesPerWeek.getOrDefault(dateTime, new HashMap<>());
            for (int i = 1; i <= 2; i++) {
                RoboTorque existingEntity = maxValuesForWeek.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForWeek.put(i, entity);
                }
            }
            maxValuesPerWeek.put(roundedTime, maxValuesForWeek);
        }
        List<RoboTorque> result = new ArrayList<>();
        for (Map<Integer, RoboTorque> valuesForMinute : maxValuesPerWeek.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotortorque_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboTorque> getMaxValueDay(List<RoboTorque> list) {
        Map<LocalDateTime, Map<Integer, RoboTorque>> maxValuesPerDay = new TreeMap<>();
        for (RoboTorque entity : list) {
            LocalDateTime dateTime = entity.getMotortorque_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.MINUTES); // 取整到分钟
            Map<Integer, RoboTorque> maxValuesForDay = maxValuesPerDay.getOrDefault(roundedTime, new HashMap<>()); //当Map集合中有roundedTime,使用value值，否则new HashMap
            for (int i = 1; i <= 1; i++) {
                RoboTorque existingEntity = maxValuesForDay.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForDay.put(i, entity);
                }
            }
            maxValuesPerDay.put(roundedTime, maxValuesForDay);
        }
        List<RoboTorque> result = new ArrayList<>();
        for (Map<Integer, RoboTorque> valuesForMinute : maxValuesPerDay.values()) {
            result.addAll(valuesForMinute.values());
        }
        // 对结果按 datatime 进行排序
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotortorque_datetime().toLocalDateTime()));
        return result;
    }


    boolean isBetter(double newValue, double existingValue) {
        // 这里根据你的业务逻辑来判断哪个值更好
        return newValue > existingValue;
    }

    private double getMaxAlignValue(RoboTorque entity, int coordinateIndex) {
        switch (coordinateIndex) {
            case 1:
                return getValueOrDefault(entity.getMotortorque_axis1_torque(), 0.0);
            case 2:
                return getValueOrDefault(entity.getMotortorque_axis2_torque(), 0.0);
            case 3:
                return getValueOrDefault(entity.getMotortorque_axis3_torque(), 0.0);
            case 4:
                return getValueOrDefault(entity.getMotortorque_axis4_torque(), 0.0);
            case 5:
                return getValueOrDefault(entity.getMotortorque_axis5_torque(), 0);
            case 6:
                return getValueOrDefault(entity.getMotortorque_axis6_torque(), 0);
            case 7:
                return getValueOrDefault(entity.getMotortorque_axis7_torque(), 0);
            case 8:
                return getValueOrDefault(entity.getMotortorque_axis8_torque(), 0);
            default:
                return 0.0;
        }
    }
    private double getValueOrDefault(Double value, double defaultValue) {
        return value != null ? value : defaultValue;
    }



//    public void updateAlign(SysAlign sysAlign) {
//        UpdateWrapper<SysAlign> updateWrapper = new UpdateWrapper<>();
//        updateWrapper.eq("robotsn",sysAlign.getRobotsn());
//        sysAlignDao.update(sysAlign,updateWrapper);
//    }
//
//    public AligndataEntity findLatestDataByRobotsn(String robotsn) {
//        Query query = Query.query(Criteria.where("robotsn").is(robotsn))
//                .queryOptions(QueryOptions.builder().build())
//                .sort(Sort.by(Sort.Direction.DESC, "datatime"))
//                .limit(1);
//        List<AligndataEntity> result = cassandraTemplate.select(query, AligndataEntity.class);
//
//        return result.isEmpty() ? null : result.get(0);
//    }
}
