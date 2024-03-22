package net.maku.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("san_align_max_min")
public class Align {
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

    @TableField("axis1_r_max")
    private Double axis1_r_max;
    @TableField("axis1_r_min")
    private Double axis1_r_min;
    @TableField("axis2_r_max")
    private Double axis2_r_max;
    @TableField("axis2_r_min")
    private Double axis2_r_min;
    @TableField("axis3_r_max")
    private Double axis3_r_max;
    @TableField("axis3_r_min")
    private Double axis3_r_min;
    @TableField("axis4_r_max")
    private Double axis4_r_max;
    @TableField("axis4_r_min")
    private Double axis4_r_min;
    @TableField("axis5_r_max")
    private Double axis5_r_max;
    @TableField("axis5_r_min")
    private Double axis5_r_min;
    @TableField("axis6_r_max")
    private Double axis6_r_max;
    @TableField("axis6_r_min")
    private Double axis6_r_min;
    @TableField("axis7_r_max")
    private Double axis7_r_max;
    @TableField("axis7_r_min")
    private Double axis7_r_min;
    @TableField("axis8_r_max")
    private Double axis8_r_max;
    @TableField("axis8_r_min")
    private Double axis8_r_min;

    @TableField("axis1_x_max")
    private Double axis1_x_max;
    @TableField("axis1_x_min")
    private Double axis1_x_min;
    @TableField("axis2_x_max")
    private Double axis2_x_max;
    @TableField("axis2_x_min")
    private Double axis2_x_min;
    @TableField("axis3_x_max")
    private Double axis3_x_max;
    @TableField("axis3_x_min")
    private Double axis3_x_min;
    @TableField("axis4_x_max")
    private Double axis4_x_max;
    @TableField("axis4_x_min")
    private Double axis4_x_min;
    @TableField("axis5_x_max")
    private Double axis5_x_max;
    @TableField("axis5_x_min")
    private Double axis5_x_min;
    @TableField("axis6_x_max")
    private Double axis6_x_max;
    @TableField("axis6_x_min")
    private Double axis6_x_min;
    @TableField("axis7_x_max")
    private Double axis7_x_max;
    @TableField("axis7_x_min")
    private Double axis7_x_min;
    @TableField("axis8_x_max")
    private Double axis8_x_max;
    @TableField("axis8_x_min")
    private Double axis8_x_min;

    public Align(Integer id, String robotsn, String factory_end, String factory_type, String robotsn_type, Double axis1_r_max, Double axis1_r_min, Double axis2_r_max, Double axis2_r_min, Double axis3_r_max, Double axis3_r_min, Double axis4_r_max, Double axis4_r_min, Double axis5_r_max, Double axis5_r_min, Double axis6_r_max, Double axis6_r_min, Double axis7_r_max, Double axis7_r_min, Double axis8_r_max, Double axis8_r_min, Double axis1_x_max, Double axis1_x_min, Double axis2_x_max, Double axis2_x_min, Double axis3_x_max, Double axis3_x_min, Double axis4_x_max, Double axis4_x_min, Double axis5_x_max, Double axis5_x_min, Double axis6_x_max, Double axis6_x_min, Double axis7_x_max, Double axis7_x_min, Double axis8_x_max, Double axis8_x_min) {
        this.id = id;
        this.robotsn = robotsn;
        this.factory_end = factory_end;
        this.factory_type = factory_type;
        this.robotsn_type = robotsn_type;
        this.axis1_r_max = axis1_r_max;
        this.axis1_r_min = axis1_r_min;
        this.axis2_r_max = axis2_r_max;
        this.axis2_r_min = axis2_r_min;
        this.axis3_r_max = axis3_r_max;
        this.axis3_r_min = axis3_r_min;
        this.axis4_r_max = axis4_r_max;
        this.axis4_r_min = axis4_r_min;
        this.axis5_r_max = axis5_r_max;
        this.axis5_r_min = axis5_r_min;
        this.axis6_r_max = axis6_r_max;
        this.axis6_r_min = axis6_r_min;
        this.axis7_r_max = axis7_r_max;
        this.axis7_r_min = axis7_r_min;
        this.axis8_r_max = axis8_r_max;
        this.axis8_r_min = axis8_r_min;
        this.axis1_x_max = axis1_x_max;
        this.axis1_x_min = axis1_x_min;
        this.axis2_x_max = axis2_x_max;
        this.axis2_x_min = axis2_x_min;
        this.axis3_x_max = axis3_x_max;
        this.axis3_x_min = axis3_x_min;
        this.axis4_x_max = axis4_x_max;
        this.axis4_x_min = axis4_x_min;
        this.axis5_x_max = axis5_x_max;
        this.axis5_x_min = axis5_x_min;
        this.axis6_x_max = axis6_x_max;
        this.axis6_x_min = axis6_x_min;
        this.axis7_x_max = axis7_x_max;
        this.axis7_x_min = axis7_x_min;
        this.axis8_x_max = axis8_x_max;
        this.axis8_x_min = axis8_x_min;
    }

    public Align(Double axis1_r_max, Double axis1_r_min, Double axis2_r_max, Double axis2_r_min, Double axis3_r_max, Double axis3_r_min, Double axis4_r_max, Double axis4_r_min, Double axis5_r_max, Double axis5_r_min, Double axis6_r_max, Double axis6_r_min, Double axis7_r_max, Double axis7_r_min, Double axis8_r_max, Double axis8_r_min, Double axis1_x_max, Double axis1_x_min, Double axis2_x_max, Double axis2_x_min, Double axis3_x_max, Double axis3_x_min, Double axis4_x_max, Double axis4_x_min, Double axis5_x_max, Double axis5_x_min, Double axis6_x_max, Double axis6_x_min, Double axis7_x_max, Double axis7_x_min, Double axis8_x_max, Double axis8_x_min) {
    }

    public Align(String robotsn, Double axis1_r_max, Double axis1_r_min, Double axis2_r_max, Double axis2_r_min, Double axis3_r_max, Double axis3_r_min, Double axis4_r_max, Double axis4_r_min, Double axis5_r_max, Double axis5_r_min, Double axis6_r_max, Double axis6_r_min, Double axis7_r_max, Double axis7_r_min, Double axis8_r_max, Double axis8_r_min, Double axis1_x_max, Double axis1_x_min, Double axis2_x_max, Double axis2_x_min, Double axis3_x_max, Double axis3_x_min, Double axis4_x_max, Double axis4_x_min, Double axis5_x_max, Double axis5_x_min, Double axis6_x_max, Double axis6_x_min, Double axis7_x_max, Double axis7_x_min, Double axis8_x_max, Double axis8_x_min) {
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

    public Double getAxis1_r_max() {
        return axis1_r_max;
    }

    public void setAxis1_r_max(Double axis1_r_max) {
        this.axis1_r_max = axis1_r_max;
    }

    public Double getAxis1_r_min() {
        return axis1_r_min;
    }

    public void setAxis1_r_min(Double axis1_r_min) {
        this.axis1_r_min = axis1_r_min;
    }

    public Double getAxis2_r_max() {
        return axis2_r_max;
    }

    public void setAxis2_r_max(Double axis2_r_max) {
        this.axis2_r_max = axis2_r_max;
    }

    public Double getAxis2_r_min() {
        return axis2_r_min;
    }

    public void setAxis2_r_min(Double axis2_r_min) {
        this.axis2_r_min = axis2_r_min;
    }

    public Double getAxis3_r_max() {
        return axis3_r_max;
    }

    public void setAxis3_r_max(Double axis3_r_max) {
        this.axis3_r_max = axis3_r_max;
    }

    public Double getAxis3_r_min() {
        return axis3_r_min;
    }

    public void setAxis3_r_min(Double axis3_r_min) {
        this.axis3_r_min = axis3_r_min;
    }

    public Double getAxis4_r_max() {
        return axis4_r_max;
    }

    public void setAxis4_r_max(Double axis4_r_max) {
        this.axis4_r_max = axis4_r_max;
    }

    public Double getAxis4_r_min() {
        return axis4_r_min;
    }

    public void setAxis4_r_min(Double axis4_r_min) {
        this.axis4_r_min = axis4_r_min;
    }

    public Double getAxis5_r_max() {
        return axis5_r_max;
    }

    public void setAxis5_r_max(Double axis5_r_max) {
        this.axis5_r_max = axis5_r_max;
    }

    public Double getAxis5_r_min() {
        return axis5_r_min;
    }

    public void setAxis5_r_min(Double axis5_r_min) {
        this.axis5_r_min = axis5_r_min;
    }

    public Double getAxis6_r_max() {
        return axis6_r_max;
    }

    public void setAxis6_r_max(Double axis6_r_max) {
        this.axis6_r_max = axis6_r_max;
    }

    public Double getAxis6_r_min() {
        return axis6_r_min;
    }

    public void setAxis6_r_min(Double axis6_r_min) {
        this.axis6_r_min = axis6_r_min;
    }

    public Double getAxis7_r_max() {
        return axis7_r_max;
    }

    public void setAxis7_r_max(Double axis7_r_max) {
        this.axis7_r_max = axis7_r_max;
    }

    public Double getAxis7_r_min() {
        return axis7_r_min;
    }

    public void setAxis7_r_min(Double axis7_r_min) {
        this.axis7_r_min = axis7_r_min;
    }

    public Double getAxis8_r_max() {
        return axis8_r_max;
    }

    public void setAxis8_r_max(Double axis8_r_max) {
        this.axis8_r_max = axis8_r_max;
    }

    public Double getAxis8_r_min() {
        return axis8_r_min;
    }

    public void setAxis8_r_min(Double axis8_r_min) {
        this.axis8_r_min = axis8_r_min;
    }

    public Double getAxis1_x_max() {
        return axis1_x_max;
    }

    public void setAxis1_x_max(Double axis1_x_max) {
        this.axis1_x_max = axis1_x_max;
    }

    public Double getAxis1_x_min() {
        return axis1_x_min;
    }

    public void setAxis1_x_min(Double axis1_x_min) {
        this.axis1_x_min = axis1_x_min;
    }

    public Double getAxis2_x_max() {
        return axis2_x_max;
    }

    public void setAxis2_x_max(Double axis2_x_max) {
        this.axis2_x_max = axis2_x_max;
    }

    public Double getAxis2_x_min() {
        return axis2_x_min;
    }

    public void setAxis2_x_min(Double axis2_x_min) {
        this.axis2_x_min = axis2_x_min;
    }

    public Double getAxis3_x_max() {
        return axis3_x_max;
    }

    public void setAxis3_x_max(Double axis3_x_max) {
        this.axis3_x_max = axis3_x_max;
    }

    public Double getAxis3_x_min() {
        return axis3_x_min;
    }

    public void setAxis3_x_min(Double axis3_x_min) {
        this.axis3_x_min = axis3_x_min;
    }

    public Double getAxis4_x_max() {
        return axis4_x_max;
    }

    public void setAxis4_x_max(Double axis4_x_max) {
        this.axis4_x_max = axis4_x_max;
    }

    public Double getAxis4_x_min() {
        return axis4_x_min;
    }

    public void setAxis4_x_min(Double axis4_x_min) {
        this.axis4_x_min = axis4_x_min;
    }

    public Double getAxis5_x_max() {
        return axis5_x_max;
    }

    public void setAxis5_x_max(Double axis5_x_max) {
        this.axis5_x_max = axis5_x_max;
    }

    public Double getAxis5_x_min() {
        return axis5_x_min;
    }

    public void setAxis5_x_min(Double axis5_x_min) {
        this.axis5_x_min = axis5_x_min;
    }

    public Double getAxis6_x_max() {
        return axis6_x_max;
    }

    public void setAxis6_x_max(Double axis6_x_max) {
        this.axis6_x_max = axis6_x_max;
    }

    public Double getAxis6_x_min() {
        return axis6_x_min;
    }

    public void setAxis6_x_min(Double axis6_x_min) {
        this.axis6_x_min = axis6_x_min;
    }

    public Double getAxis7_x_max() {
        return axis7_x_max;
    }

    public void setAxis7_x_max(Double axis7_x_max) {
        this.axis7_x_max = axis7_x_max;
    }

    public Double getAxis7_x_min() {
        return axis7_x_min;
    }

    public void setAxis7_x_min(Double axis7_x_min) {
        this.axis7_x_min = axis7_x_min;
    }

    public Double getAxis8_x_max() {
        return axis8_x_max;
    }

    public void setAxis8_x_max(Double axis8_x_max) {
        this.axis8_x_max = axis8_x_max;
    }

    public Double getAxis8_x_min() {
        return axis8_x_min;
    }

    public void setAxis8_x_min(Double axis8_x_min) {
        this.axis8_x_min = axis8_x_min;
    }

    @Override
    public String toString() {
        return "Align{" +
                "id=" + id +
                ", robotsn='" + robotsn + '\'' +
                ", factory_end='" + factory_end + '\'' +
                ", factory_type='" + factory_type + '\'' +
                ", robotsn_type='" + robotsn_type + '\'' +
                ", axis1_r_max=" + axis1_r_max +
                ", axis1_r_min=" + axis1_r_min +
                ", axis2_r_max=" + axis2_r_max +
                ", axis2_r_min=" + axis2_r_min +
                ", axis3_r_max=" + axis3_r_max +
                ", axis3_r_min=" + axis3_r_min +
                ", axis4_r_max=" + axis4_r_max +
                ", axis4_r_min=" + axis4_r_min +
                ", axis5_r_max=" + axis5_r_max +
                ", axis5_r_min=" + axis5_r_min +
                ", axis6_r_max=" + axis6_r_max +
                ", axis6_r_min=" + axis6_r_min +
                ", axis7_r_max=" + axis7_r_max +
                ", axis7_r_min=" + axis7_r_min +
                ", axis8_r_max=" + axis8_r_max +
                ", axis8_r_min=" + axis8_r_min +
                ", axis1_x_max=" + axis1_x_max +
                ", axis1_x_min=" + axis1_x_min +
                ", axis2_x_max=" + axis2_x_max +
                ", axis2_x_min=" + axis2_x_min +
                ", axis3_x_max=" + axis3_x_max +
                ", axis3_x_min=" + axis3_x_min +
                ", axis4_x_max=" + axis4_x_max +
                ", axis4_x_min=" + axis4_x_min +
                ", axis5_x_max=" + axis5_x_max +
                ", axis5_x_min=" + axis5_x_min +
                ", axis6_x_max=" + axis6_x_max +
                ", axis6_x_min=" + axis6_x_min +
                ", axis7_x_max=" + axis7_x_max +
                ", axis7_x_min=" + axis7_x_min +
                ", axis8_x_max=" + axis8_x_max +
                ", axis8_x_min=" + axis8_x_min +
                '}';
    }
}
