package net.maku.system.service;

import jakarta.annotation.Resource;
import net.maku.system.dao.RoboMotorDao;
import net.maku.system.entity.RoboJointVel;
import net.maku.system.entity.RoboMotorTemp;
import net.maku.system.vo.RoboMotorVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.cql.QueryOptions;
import org.springframework.data.cassandra.core.query.Criteria;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static org.springframework.data.cassandra.core.query.Criteria.where;

@Service
public class RoboMotorSevice {
    @Resource
    CassandraTemplate cassandraTemplate;
    private final RoboMotorDao roboMotorDao;

    public RoboMotorSevice(RoboMotorDao roboMotorDao) {
        this.roboMotorDao = roboMotorDao;
    }

    public List<RoboMotorTemp> findAll(RoboMotorVO roboMotorVO){
        Query query = Query.empty();
        Timestamp timestamp_start = Timestamp.valueOf(roboMotorVO.getStartTime());
        Timestamp timestamp_end = Timestamp.valueOf(roboMotorVO.getEndTime());
        String robotsn = roboMotorVO.getRobotsn().trim();
        if(StringUtils.isNotBlank(robotsn)){
            query = query.and(where("motortemp_robotsn").is(robotsn));
        }
        if(StringUtils.isNotBlank(roboMotorVO.getStartTime())){
            query = query.and(where("motortemp_datetime").gte(timestamp_start));
        }
        if(StringUtils.isNotBlank(roboMotorVO.getEndTime())){
            query = query.and(where("motortemp_datetime").lte(timestamp_end));
        }
        Sort sort = Sort.by(Sort.Direction.ASC, "motortemp_datetime");
        query = query.sort(sort);
        List<RoboMotorTemp> list = cassandraTemplate.select(query, RoboMotorTemp.class);
        if (StringUtils.isNotBlank(roboMotorVO.getStartTime()) && StringUtils.isNotBlank(roboMotorVO.getEndTime())) {
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

    List<RoboMotorTemp> getMaxValuesYear(List<RoboMotorTemp> list) {
        Map<LocalDateTime, Map<Integer, RoboMotorTemp>> maxValuesPerYear = new TreeMap<>();
        for (RoboMotorTemp entity : list) {
            LocalDateTime dateTime = entity.getMotortemp_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.YEARS);
            Map<Integer, RoboMotorTemp> maxValuesForYear = maxValuesPerYear.getOrDefault(roundedTime, new HashMap<>());
            for (int i = 1; i <= 120; i++) {
                RoboMotorTemp existingEntity = maxValuesForYear.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForYear.put(i, entity);
                }
            }
            maxValuesPerYear.put(roundedTime, maxValuesForYear);
        }
        List<RoboMotorTemp> result = new ArrayList<>();
        for (Map<Integer, RoboMotorTemp> valuesForMinute : maxValuesPerYear.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotortemp_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboMotorTemp> getMaxValuesMonth(List<RoboMotorTemp> list) {
        Map<LocalDateTime, Map<Integer, RoboMotorTemp>> maxValuesPerMonth = new TreeMap<>();
        for (RoboMotorTemp entity : list) {
            LocalDateTime dateTime = entity.getMotortemp_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.DAYS);
            Map<Integer, RoboMotorTemp> maxValuesForMonth = maxValuesPerMonth.getOrDefault(roundedTime, new HashMap<>());
            for (int i = 1; i <= 12; i++) {
                RoboMotorTemp existingEntity = maxValuesForMonth.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForMonth.put(i, entity);
                }
            }
            maxValuesPerMonth.put(roundedTime, maxValuesForMonth);
        }
        List<RoboMotorTemp> result = new ArrayList<>();
        for (Map<Integer, RoboMotorTemp> valuesForMinute : maxValuesPerMonth.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotortemp_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboMotorTemp> getMaxValuesWeek(List<RoboMotorTemp> list) {
        Map<LocalDateTime, Map<Integer, RoboMotorTemp>> maxValuesPerWeek = new TreeMap<>();
        for (RoboMotorTemp entity : list) {
            LocalDateTime dateTime = entity.getMotortemp_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.HOURS); // 取整到小时
            Map<Integer, RoboMotorTemp> maxValuesForWeek = maxValuesPerWeek.getOrDefault(dateTime, new HashMap<>());
            for (int i = 1; i <= 2; i++) {
                RoboMotorTemp existingEntity = maxValuesForWeek.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForWeek.put(i, entity);
                }
            }
            maxValuesPerWeek.put(roundedTime, maxValuesForWeek);
        }
        List<RoboMotorTemp> result = new ArrayList<>();
        for (Map<Integer, RoboMotorTemp> valuesForMinute : maxValuesPerWeek.values()) {
            result.addAll(valuesForMinute.values());
        }
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotortemp_datetime().toLocalDateTime()));
        return result;
    }

    List<RoboMotorTemp> getMaxValueDay(List<RoboMotorTemp> list) {
        Map<LocalDateTime, Map<Integer, RoboMotorTemp>> maxValuesPerDay = new TreeMap<>();
        for (RoboMotorTemp entity : list) {
            LocalDateTime dateTime = entity.getMotortemp_datetime().toLocalDateTime();
            LocalDateTime roundedTime = dateTime.truncatedTo(ChronoUnit.MINUTES); // 取整到分钟
            Map<Integer, RoboMotorTemp> maxValuesForDay = maxValuesPerDay.getOrDefault(roundedTime, new HashMap<>()); //当Map集合中有roundedTime,使用value值，否则new HashMap
            for (int i = 1; i <= 1; i++) {
                RoboMotorTemp existingEntity = maxValuesForDay.getOrDefault(i, null);
                double coordinateValue = getMaxAlignValue(entity, i);
                if (existingEntity == null || isBetter(coordinateValue, getMaxAlignValue(existingEntity, i))) {
                    maxValuesForDay.put(i, entity);
                }
            }
            maxValuesPerDay.put(roundedTime, maxValuesForDay);
        }
        List<RoboMotorTemp> result = new ArrayList<>();
        for (Map<Integer, RoboMotorTemp> valuesForMinute : maxValuesPerDay.values()) {
            result.addAll(valuesForMinute.values());
        }
        // 对结果按 datatime 进行排序
        Collections.sort(result, Comparator.comparing(entity -> entity.getMotortemp_datetime().toLocalDateTime()));
        return result;
    }


    boolean isBetter(double newValue, double existingValue) {
        // 这里根据你的业务逻辑来判断哪个值更好
        return newValue > existingValue;
    }

    private double getMaxAlignValue(RoboMotorTemp entity, int coordinateIndex) {
        switch (coordinateIndex) {
            case 1:
                return getValueOrDefault(entity.getMotortemp_axis1_temp(), 0.0);
            case 2:
                return getValueOrDefault(entity.getMotortemp_axis2_temp(), 0.0);
            case 3:
                return getValueOrDefault(entity.getMotortemp_axis3_temp(), 0.0);
            case 4:
                return getValueOrDefault(entity.getMotortemp_axis4_temp(), 0.0);
            case 5:
                return getValueOrDefault(entity.getMotortemp_axis5_temp(), 0);
            case 6:
                return getValueOrDefault(entity.getMotortemp_axis6_temp(), 0);
            case 7:
                return getValueOrDefault(entity.getMotortemp_axis7_temp(), 0);
            case 8:
                return getValueOrDefault(entity.getMotortemp_axis8_temp(), 0);
            default:
                return 0.0;
        }
    }
    private double getValueOrDefault(Double value, double defaultValue) {
        return value != null ? value : defaultValue;
    }

    //获取最新数据
    public RoboMotorTemp findLatestDataByRobotsn(String robotsn) {
        //使用分页限制.queryOptions(QueryOptions.builder().pageSize(1000).build())
        Query query = Query.query(Criteria.where("motortemp_robotsn").is(robotsn))
                .queryOptions(QueryOptions.builder().build())
                .sort(Sort.by(Sort.Direction.DESC, "motortemp_datetime"))
                .limit(1);
        List<RoboMotorTemp> result = cassandraTemplate.select(query, RoboMotorTemp.class);

        return result.isEmpty() ? null : result.get(0);
    }
}
