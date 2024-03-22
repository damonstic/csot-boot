package net.maku.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("robo_motor_max_min")
public class Motor {
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

    @TableField("temp1_max")
    private Double temp1_max;
    @TableField("temp1_min")
    private Double temp1_min;
    @TableField("temp2_max")
    private Double temp2_max;
    @TableField("temp2_min")
    private Double temp2_min;
    @TableField("temp3_max")
    private Double temp3_max;
    @TableField("temp3_min")
    private Double temp3_min;
    @TableField("temp4_max")
    private Double temp4_max;
    @TableField("temp4_min")
    private Double temp4_min;
    @TableField("temp5_max")
    private Double temp5_max;
    @TableField("temp5_min")
    private Double temp5_min;
    @TableField("temp6_max")
    private Double temp6_max;
    @TableField("temp6_min")
    private Double temp6_min;
    @TableField("temp7_max")
    private Double temp7_max;
    @TableField("temp7_min")
    private Double temp7_min;
    @TableField("temp8_max")
    private Double temp8_max;
    @TableField("temp8_min")
    private Double temp8_min;

    public Motor(Integer id, String robotsn, String factory_end, String factory_type, String robotsn_type, Double temp1_max, Double temp1_min, Double temp2_max, Double temp2_min, Double temp3_max, Double temp3_min, Double temp4_max, Double temp4_min, Double temp5_max, Double temp5_min, Double temp6_max, Double temp6_min, Double temp7_max, Double temp7_min, Double temp8_max, Double temp8_min) {
        this.id = id;
        this.robotsn = robotsn;
        this.factory_end = factory_end;
        this.factory_type = factory_type;
        this.robotsn_type = robotsn_type;
        this.temp1_max = temp1_max;
        this.temp1_min = temp1_min;
        this.temp2_max = temp2_max;
        this.temp2_min = temp2_min;
        this.temp3_max = temp3_max;
        this.temp3_min = temp3_min;
        this.temp4_max = temp4_max;
        this.temp4_min = temp4_min;
        this.temp5_max = temp5_max;
        this.temp5_min = temp5_min;
        this.temp6_max = temp6_max;
        this.temp6_min = temp6_min;
        this.temp7_max = temp7_max;
        this.temp7_min = temp7_min;
        this.temp8_max = temp8_max;
        this.temp8_min = temp8_min;
    }

    public Motor(String robotsn, Double temp1_max, Double temp1_min, Double temp2_max, Double temp2_min, Double temp3_max, Double temp3_min, Double temp4_max, Double temp4_min, Double temp5_max, Double temp5_min, Double temp6_max, Double temp6_min, Double temp7_max, Double temp7_min, Double temp8_max, Double temp8_min) {
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

    public Double getTemp1_max() {
        return temp1_max;
    }

    public void setTemp1_max(Double temp1_max) {
        this.temp1_max = temp1_max;
    }

    public Double getTemp1_min() {
        return temp1_min;
    }

    public void setTemp1_min(Double temp1_min) {
        this.temp1_min = temp1_min;
    }

    public Double getTemp2_max() {
        return temp2_max;
    }

    public void setTemp2_max(Double temp2_max) {
        this.temp2_max = temp2_max;
    }

    public Double getTemp2_min() {
        return temp2_min;
    }

    public void setTemp2_min(Double temp2_min) {
        this.temp2_min = temp2_min;
    }

    public Double getTemp3_max() {
        return temp3_max;
    }

    public void setTemp3_max(Double temp3_max) {
        this.temp3_max = temp3_max;
    }

    public Double getTemp3_min() {
        return temp3_min;
    }

    public void setTemp3_min(Double temp3_min) {
        this.temp3_min = temp3_min;
    }

    public Double getTemp4_max() {
        return temp4_max;
    }

    public void setTemp4_max(Double temp4_max) {
        this.temp4_max = temp4_max;
    }

    public Double getTemp4_min() {
        return temp4_min;
    }

    public void setTemp4_min(Double temp4_min) {
        this.temp4_min = temp4_min;
    }

    public Double getTemp5_max() {
        return temp5_max;
    }

    public void setTemp5_max(Double temp5_max) {
        this.temp5_max = temp5_max;
    }

    public Double getTemp5_min() {
        return temp5_min;
    }

    public void setTemp5_min(Double temp5_min) {
        this.temp5_min = temp5_min;
    }

    public Double getTemp6_max() {
        return temp6_max;
    }

    public void setTemp6_max(Double temp6_max) {
        this.temp6_max = temp6_max;
    }

    public Double getTemp6_min() {
        return temp6_min;
    }

    public void setTemp6_min(Double temp6_min) {
        this.temp6_min = temp6_min;
    }

    public Double getTemp7_max() {
        return temp7_max;
    }

    public void setTemp7_max(Double temp7_max) {
        this.temp7_max = temp7_max;
    }

    public Double getTemp7_min() {
        return temp7_min;
    }

    public void setTemp7_min(Double temp7_min) {
        this.temp7_min = temp7_min;
    }

    public Double getTemp8_max() {
        return temp8_max;
    }

    public void setTemp8_max(Double temp8_max) {
        this.temp8_max = temp8_max;
    }

    public Double getTemp8_min() {
        return temp8_min;
    }

    public void setTemp8_min(Double temp8_min) {
        this.temp8_min = temp8_min;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "id=" + id +
                ", robotsn='" + robotsn + '\'' +
                ", factory_end='" + factory_end + '\'' +
                ", factory_type='" + factory_type + '\'' +
                ", robotsn_type='" + robotsn_type + '\'' +
                ", temp1_max=" + temp1_max +
                ", temp1_min=" + temp1_min +
                ", temp2_max=" + temp2_max +
                ", temp2_min=" + temp2_min +
                ", temp3_max=" + temp3_max +
                ", temp3_min=" + temp3_min +
                ", temp4_max=" + temp4_max +
                ", temp4_min=" + temp4_min +
                ", temp5_max=" + temp5_max +
                ", temp5_min=" + temp5_min +
                ", temp6_max=" + temp6_max +
                ", temp6_min=" + temp6_min +
                ", temp7_max=" + temp7_max +
                ", temp7_min=" + temp7_min +
                ", temp8_max=" + temp8_max +
                ", temp8_min=" + temp8_min +
                '}';
    }
}
