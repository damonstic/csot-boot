package net.maku.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("robo_jointvel_max_min")
public class JointVel {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("robotsn")
    private String robotsn;
    @TableField("factory_end")
    private String factory_end;
    @TableField("factory_type")
    private String factory_type;
    @TableField("robotsn_type")
    private String robotsn_type;

    @TableField("speed1_max")
    private Double speed1_max;
    @TableField("speed1_min")
    private Double speed1_min;
    @TableField("speed2_max")
    private Double speed2_max;
    @TableField("speed2_min")
    private Double speed2_min;
    @TableField("speed3_max")
    private Double speed3_max;
    @TableField("speed3_min")
    private Double speed3_min;
    @TableField("speed4_max")
    private Double speed4_max;
    @TableField("speed4_min")
    private Double speed4_min;
    @TableField("speed5_max")
    private Double speed5_max;
    @TableField("speed5_min")
    private Double speed5_min;
    @TableField("speed6_max")
    private Double speed6_max;
    @TableField("speed6_min")
    private Double speed6_min;
    @TableField("speed7_max")
    private Double speed7_max;
    @TableField("speed7_min")
    private Double speed7_min;
    @TableField("speed8_max")
    private Double speed8_max;
    @TableField("speed8_min")
    private Double speed8_min;

    public JointVel(Integer id, String robotsn, String factory_end, String factory_type, String robotsn_type, Double speed1_max, Double speed1_min, Double speed2_max, Double speed2_min, Double speed3_max, Double speed3_min, Double speed4_max, Double speed4_min, Double speed5_max, Double speed5_min, Double speed6_max, Double speed6_min, Double speed7_max, Double speed7_min, Double speed8_max, Double speed8_min) {
        this.id = id;
        this.robotsn = robotsn;
        this.factory_end = factory_end;
        this.factory_type = factory_type;
        this.robotsn_type = robotsn_type;
        this.speed1_max = speed1_max;
        this.speed1_min = speed1_min;
        this.speed2_max = speed2_max;
        this.speed2_min = speed2_min;
        this.speed3_max = speed3_max;
        this.speed3_min = speed3_min;
        this.speed4_max = speed4_max;
        this.speed4_min = speed4_min;
        this.speed5_max = speed5_max;
        this.speed5_min = speed5_min;
        this.speed6_max = speed6_max;
        this.speed6_min = speed6_min;
        this.speed7_max = speed7_max;
        this.speed7_min = speed7_min;
        this.speed8_max = speed8_max;
        this.speed8_min = speed8_min;
    }

    public JointVel(String robotsn, Double speed1_max, Double speed1_min, Double speed2_max, Double speed2_min, Double speed3_max, Double speed3_min, Double speed4_max, Double speed4_min, Double speed5_max, Double speed5_min, Double speed6_max, Double speed6_min, Double speed7_max, Double speed7_min, Double speed8_max, Double speed8_min) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRobotsn() {
        return robotsn;
    }

    public void setRobotsn(String robotsn) {
        this.robotsn = robotsn;
    }

    public String getFactory_end() {
        return factory_end;
    }

    public void setFactory_end(String factory_end) {
        this.factory_end = factory_end;
    }

    public String getFactory_type() {
        return factory_type;
    }

    public void setFactory_type(String factory_type) {
        this.factory_type = factory_type;
    }

    public String getRobotsn_type() {
        return robotsn_type;
    }

    public void setRobotsn_type(String robotsn_type) {
        this.robotsn_type = robotsn_type;
    }

    public Double getSpeed1_max() {
        return speed1_max;
    }

    public void setSpeed1_max(Double speed1_max) {
        this.speed1_max = speed1_max;
    }

    public Double getSpeed1_min() {
        return speed1_min;
    }

    public void setSpeed1_min(Double speed1_min) {
        this.speed1_min = speed1_min;
    }

    public Double getSpeed2_max() {
        return speed2_max;
    }

    public void setSpeed2_max(Double speed2_max) {
        this.speed2_max = speed2_max;
    }

    public Double getSpeed2_min() {
        return speed2_min;
    }

    public void setSpeed2_min(Double speed2_min) {
        this.speed2_min = speed2_min;
    }

    public Double getSpeed3_max() {
        return speed3_max;
    }

    public void setSpeed3_max(Double speed3_max) {
        this.speed3_max = speed3_max;
    }

    public Double getSpeed3_min() {
        return speed3_min;
    }

    public void setSpeed3_min(Double speed3_min) {
        this.speed3_min = speed3_min;
    }

    public Double getSpeed4_max() {
        return speed4_max;
    }

    public void setSpeed4_max(Double speed4_max) {
        this.speed4_max = speed4_max;
    }

    public Double getSpeed4_min() {
        return speed4_min;
    }

    public void setSpeed4_min(Double speed4_min) {
        this.speed4_min = speed4_min;
    }

    public Double getSpeed5_max() {
        return speed5_max;
    }

    public void setSpeed5_max(Double speed5_max) {
        this.speed5_max = speed5_max;
    }

    public Double getSpeed5_min() {
        return speed5_min;
    }

    public void setSpeed5_min(Double speed5_min) {
        this.speed5_min = speed5_min;
    }

    public Double getSpeed6_max() {
        return speed6_max;
    }

    public void setSpeed6_max(Double speed6_max) {
        this.speed6_max = speed6_max;
    }

    public Double getSpeed6_min() {
        return speed6_min;
    }

    public void setSpeed6_min(Double speed6_min) {
        this.speed6_min = speed6_min;
    }

    public Double getSpeed7_max() {
        return speed7_max;
    }

    public void setSpeed7_max(Double speed7_max) {
        this.speed7_max = speed7_max;
    }

    public Double getSpeed7_min() {
        return speed7_min;
    }

    public void setSpeed7_min(Double speed7_min) {
        this.speed7_min = speed7_min;
    }

    public Double getSpeed8_max() {
        return speed8_max;
    }

    public void setSpeed8_max(Double speed8_max) {
        this.speed8_max = speed8_max;
    }

    public Double getSpeed8_min() {
        return speed8_min;
    }

    public void setSpeed8_min(Double speed8_min) {
        this.speed8_min = speed8_min;
    }

    @Override
    public String toString() {
        return "JointVel{" +
                "id=" + id +
                ", robotsn='" + robotsn + '\'' +
                ", factory_end='" + factory_end + '\'' +
                ", factory_type='" + factory_type + '\'' +
                ", robotsn_type='" + robotsn_type + '\'' +
                ", speed1_max=" + speed1_max +
                ", speed1_min=" + speed1_min +
                ", speed2_max=" + speed2_max +
                ", speed2_min=" + speed2_min +
                ", speed3_max=" + speed3_max +
                ", speed3_min=" + speed3_min +
                ", speed4_max=" + speed4_max +
                ", speed4_min=" + speed4_min +
                ", speed5_max=" + speed5_max +
                ", speed5_min=" + speed5_min +
                ", speed6_max=" + speed6_max +
                ", speed6_min=" + speed6_min +
                ", speed7_max=" + speed7_max +
                ", speed7_min=" + speed7_min +
                ", speed8_max=" + speed8_max +
                ", speed8_min=" + speed8_min +
                '}';
    }
}
