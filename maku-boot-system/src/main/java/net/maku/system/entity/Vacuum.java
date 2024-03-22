package net.maku.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("san_vacuum_max_min")
public class Vacuum {
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

    @TableField("upper_max")
    private Double upper_max;
    @TableField("upper_min")
    private Double upper_min;
    @TableField("lower_max")
    private Double lower_max;
    @TableField("lower_min")
    private Double lower_min;

    public Vacuum(Integer id, String robotsn, String factory_end, String factory_type, String robotsn_type, Double upper_max, Double upper_min, Double lower_max, Double lower_min) {
        this.id = id;
        this.robotsn = robotsn;
        this.factory_end = factory_end;
        this.factory_type = factory_type;
        this.robotsn_type = robotsn_type;
        this.upper_max = upper_max;
        this.upper_min = upper_min;
        this.lower_max = lower_max;
        this.lower_min = lower_min;
    }

    public Vacuum(String robotsn, Double upper_max, Double upper_min, Double lower_max, Double lower_min) {
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

    public Double getUpper_max() {
        return upper_max;
    }

    public void setUpper_max(Double upper_max) {
        this.upper_max = upper_max;
    }

    public Double getUpper_min() {
        return upper_min;
    }

    public void setUpper_min(Double upper_min) {
        this.upper_min = upper_min;
    }

    public Double getLower_max() {
        return lower_max;
    }

    public void setLower_max(Double lower_max) {
        this.lower_max = lower_max;
    }

    public Double getLower_min() {
        return lower_min;
    }

    public void setLower_min(Double lower_min) {
        this.lower_min = lower_min;
    }

    @Override
    public String toString() {
        return "Vacuum{" +
                "id=" + id +
                ", robotsn='" + robotsn + '\'' +
                ", factory_end='" + factory_end + '\'' +
                ", factory_type='" + factory_type + '\'' +
                ", robotsn_type='" + robotsn_type + '\'' +
                ", upper_max=" + upper_max +
                ", upper_min=" + upper_min +
                ", lower_max=" + lower_max +
                ", lower_min=" + lower_min +
                '}';
    }
}
