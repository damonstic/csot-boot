package net.maku.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("san_linetact_max_min")
public class LineTact {
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

    @TableField("velp1_max")
    private Double velp1_max;
    @TableField("velp1_min")
    private Double velp1_min;
    @TableField("velp2_max")
    private Double velp2_max;
    @TableField("velp2_min")
    private Double velp2_min;
    @TableField("velp3_max")
    private Double velp3_max;
    @TableField("velp3_min")
    private Double velp3_min;
    @TableField("velp4_max")
    private Double velp4_max;
    @TableField("velp4_min")
    private Double velp4_min;
    @TableField("velp5_max")
    private Double velp5_max;
    @TableField("velp5_min")
    private Double velp5_min;
    @TableField("velp6_max")
    private Double velp6_max;
    @TableField("velp6_min")
    private Double velp6_min;
    @TableField("velp7_max")
    private Double velp7_max;
    @TableField("velp7_min")
    private Double velp7_min;
    @TableField("velp8_max")
    private Double velp8_max;
    @TableField("velp8_min")
    private Double velp8_min;

    public LineTact(Integer id, String robotsn, String factory_end, String factory_type, String robotsn_type, Double velp1_max, Double velp1_min, Double velp2_max, Double velp2_min, Double velp3_max, Double velp3_min, Double velp4_max, Double velp4_min, Double velp5_max, Double velp5_min, Double velp6_max, Double velp6_min, Double velp7_max, Double velp7_min, Double velp8_max, Double velp8_min) {
        this.id = id;
        this.robotsn = robotsn;
        this.factory_end = factory_end;
        this.factory_type = factory_type;
        this.robotsn_type = robotsn_type;
        this.velp1_max = velp1_max;
        this.velp1_min = velp1_min;
        this.velp2_max = velp2_max;
        this.velp2_min = velp2_min;
        this.velp3_max = velp3_max;
        this.velp3_min = velp3_min;
        this.velp4_max = velp4_max;
        this.velp4_min = velp4_min;
        this.velp5_max = velp5_max;
        this.velp5_min = velp5_min;
        this.velp6_max = velp6_max;
        this.velp6_min = velp6_min;
        this.velp7_max = velp7_max;
        this.velp7_min = velp7_min;
        this.velp8_max = velp8_max;
        this.velp8_min = velp8_min;
    }

    public LineTact(String robotsn, Double velp1_max, Double velp1_min, Double velp2_max, Double velp2_min, Double velp3_max, Double velp3_min, Double velp4_max, Double velp4_min, Double velp5_max, Double velp5_min, Double velp6_max, Double velp6_min) {
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

    public Double getVelp1_max() {
        return velp1_max;
    }

    public void setVelp1_max(Double velp1_max) {
        this.velp1_max = velp1_max;
    }

    public Double getVelp1_min() {
        return velp1_min;
    }

    public void setVelp1_min(Double velp1_min) {
        this.velp1_min = velp1_min;
    }

    public Double getVelp2_max() {
        return velp2_max;
    }

    public void setVelp2_max(Double velp2_max) {
        this.velp2_max = velp2_max;
    }

    public Double getVelp2_min() {
        return velp2_min;
    }

    public void setVelp2_min(Double velp2_min) {
        this.velp2_min = velp2_min;
    }

    public Double getVelp3_max() {
        return velp3_max;
    }

    public void setVelp3_max(Double velp3_max) {
        this.velp3_max = velp3_max;
    }

    public Double getVelp3_min() {
        return velp3_min;
    }

    public void setVelp3_min(Double velp3_min) {
        this.velp3_min = velp3_min;
    }

    public Double getVelp4_max() {
        return velp4_max;
    }

    public void setVelp4_max(Double velp4_max) {
        this.velp4_max = velp4_max;
    }

    public Double getVelp4_min() {
        return velp4_min;
    }

    public void setVelp4_min(Double velp4_min) {
        this.velp4_min = velp4_min;
    }

    public Double getVelp5_max() {
        return velp5_max;
    }

    public void setVelp5_max(Double velp5_max) {
        this.velp5_max = velp5_max;
    }

    public Double getVelp5_min() {
        return velp5_min;
    }

    public void setVelp5_min(Double velp5_min) {
        this.velp5_min = velp5_min;
    }

    public Double getVelp6_max() {
        return velp6_max;
    }

    public void setVelp6_max(Double velp6_max) {
        this.velp6_max = velp6_max;
    }

    public Double getVelp6_min() {
        return velp6_min;
    }

    public void setVelp6_min(Double velp6_min) {
        this.velp6_min = velp6_min;
    }

    public Double getVelp7_max() {
        return velp7_max;
    }

    public void setVelp7_max(Double velp7_max) {
        this.velp7_max = velp7_max;
    }

    public Double getVelp7_min() {
        return velp7_min;
    }

    public void setVelp7_min(Double velp7_min) {
        this.velp7_min = velp7_min;
    }

    public Double getVelp8_max() {
        return velp8_max;
    }

    public void setVelp8_max(Double velp8_max) {
        this.velp8_max = velp8_max;
    }

    public Double getVelp8_min() {
        return velp8_min;
    }

    public void setVelp8_min(Double velp8_min) {
        this.velp8_min = velp8_min;
    }

    @Override
    public String toString() {
        return "LineTact{" +
                "id=" + id +
                ", robotsn='" + robotsn + '\'' +
                ", factory_end='" + factory_end + '\'' +
                ", factory_type='" + factory_type + '\'' +
                ", robotsn_type='" + robotsn_type + '\'' +
                ", velp1_max=" + velp1_max +
                ", velp1_min=" + velp1_min +
                ", velp2_max=" + velp2_max +
                ", velp2_min=" + velp2_min +
                ", velp3_max=" + velp3_max +
                ", velp3_min=" + velp3_min +
                ", velp4_max=" + velp4_max +
                ", velp4_min=" + velp4_min +
                ", velp5_max=" + velp5_max +
                ", velp5_min=" + velp5_min +
                ", velp6_max=" + velp6_max +
                ", velp6_min=" + velp6_min +
                ", velp7_max=" + velp7_max +
                ", velp7_min=" + velp7_min +
                ", velp8_max=" + velp8_max +
                ", velp8_min=" + velp8_min +
                '}';
    }
}
