package net.maku.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("san_hand_max_min")
public class Hand {
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

    @TableField("zpos_start_max")
    private Double zpos_start_max;
    @TableField("zpos_start_min")
    private Double zpos_start_min;
    @TableField("zpos1_on_max")
    private Double zpos1_on_max;
    @TableField("zpos1_on_min")
    private Double zpos1_on_min;
    @TableField("zpos1_diff_max")
    private Double zpos1_diff_max;
    @TableField("zpos1_diff_min")
    private Double zpos1_diff_min;
    @TableField("zpos2_on_max")
    private Double zpos2_on_max;
    @TableField("zpos2_on_min")
    private Double zpos2_on_min;
    @TableField("zpos2_diff_max")
    private Double zpos2_diff_max;
    @TableField("zpos2_diff_min")
    private Double zpos2_diff_min;

    public Hand(Integer id, String robotsn, String factory_end, String factory_type, String robotsn_type, Double zpos_start_max, Double zpos_start_min, Double zpos1_on_max, Double zpos1_on_min, Double zpos1_diff_max, Double zpos1_diff_min, Double zpos2_on_max, Double zpos2_on_min, Double zpos2_diff_max, Double zpos2_diff_min) {
        this.id = id;
        this.robotsn = robotsn;
        this.factory_end = factory_end;
        this.factory_type = factory_type;
        this.robotsn_type = robotsn_type;
        this.zpos_start_max = zpos_start_max;
        this.zpos_start_min = zpos_start_min;
        this.zpos1_on_max = zpos1_on_max;
        this.zpos1_on_min = zpos1_on_min;
        this.zpos1_diff_max = zpos1_diff_max;
        this.zpos1_diff_min = zpos1_diff_min;
        this.zpos2_on_max = zpos2_on_max;
        this.zpos2_on_min = zpos2_on_min;
        this.zpos2_diff_max = zpos2_diff_max;
        this.zpos2_diff_min = zpos2_diff_min;
    }

    public Hand(String robotsn, Double zpos_start_max, Double zpos_start_min, Double zpos1_on_max, Double zpos1_on_min, Double zpos1_diff_max, Double zpos1_diff_min, Double zpos2_on_max, Double zpos2_on_min, Double zpos2_diff_max, Double zpos2_diff_min) {
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

    public Double getZpos_start_max() {
        return zpos_start_max;
    }

    public void setZpos_start_max(Double zpos_start_max) {
        this.zpos_start_max = zpos_start_max;
    }

    public Double getZpos_start_min() {
        return zpos_start_min;
    }

    public void setZpos_start_min(Double zpos_start_min) {
        this.zpos_start_min = zpos_start_min;
    }

    public Double getZpos1_on_max() {
        return zpos1_on_max;
    }

    public void setZpos1_on_max(Double zpos1_on_max) {
        this.zpos1_on_max = zpos1_on_max;
    }

    public Double getZpos1_on_min() {
        return zpos1_on_min;
    }

    public void setZpos1_on_min(Double zpos1_on_min) {
        this.zpos1_on_min = zpos1_on_min;
    }

    public Double getZpos1_diff_max() {
        return zpos1_diff_max;
    }

    public void setZpos1_diff_max(Double zpos1_diff_max) {
        this.zpos1_diff_max = zpos1_diff_max;
    }

    public Double getZpos1_diff_min() {
        return zpos1_diff_min;
    }

    public void setZpos1_diff_min(Double zpos1_diff_min) {
        this.zpos1_diff_min = zpos1_diff_min;
    }

    public Double getZpos2_on_max() {
        return zpos2_on_max;
    }

    public void setZpos2_on_max(Double zpos2_on_max) {
        this.zpos2_on_max = zpos2_on_max;
    }

    public Double getZpos2_on_min() {
        return zpos2_on_min;
    }

    public void setZpos2_on_min(Double zpos2_on_min) {
        this.zpos2_on_min = zpos2_on_min;
    }

    public Double getZpos2_diff_max() {
        return zpos2_diff_max;
    }

    public void setZpos2_diff_max(Double zpos2_diff_max) {
        this.zpos2_diff_max = zpos2_diff_max;
    }

    public Double getZpos2_diff_min() {
        return zpos2_diff_min;
    }

    public void setZpos2_diff_min(Double zpos2_diff_min) {
        this.zpos2_diff_min = zpos2_diff_min;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "id=" + id +
                ", robotsn='" + robotsn + '\'' +
                ", factory_end='" + factory_end + '\'' +
                ", factory_type='" + factory_type + '\'' +
                ", robotsn_type='" + robotsn_type + '\'' +
                ", zpos_start_max=" + zpos_start_max +
                ", zpos_start_min=" + zpos_start_min +
                ", zpos1_on_max=" + zpos1_on_max +
                ", zpos1_on_min=" + zpos1_on_min +
                ", zpos1_diff_max=" + zpos1_diff_max +
                ", zpos1_diff_min=" + zpos1_diff_min +
                ", zpos2_on_max=" + zpos2_on_max +
                ", zpos2_on_min=" + zpos2_on_min +
                ", zpos2_diff_max=" + zpos2_diff_max +
                ", zpos2_diff_min=" + zpos2_diff_min +
                '}';
    }
}
