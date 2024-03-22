package net.maku.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@TableName("robo_torque_max_min")
public class Torque {
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

    @TableField("torque1_max")
    private Double torque1_max;
    @TableField("torque1_min")
    private Double torque1_min;
    @TableField("torque2_max")
    private Double torque2_max;
    @TableField("torque2_min")
    private Double torque2_min;
    @TableField("torque3_max")
    private Double torque3_max;
    @TableField("torque3_min")
    private Double torque3_min;
    @TableField("torque4_max")
    private Double torque4_max;
    @TableField("torque4_min")
    private Double torque4_min;
    @TableField("torque5_max")
    private Double torque5_max;
    @TableField("torque5_min")
    private Double torque5_min;
    @TableField("torque6_max")
    private Double torque6_max;
    @TableField("torque6_min")
    private Double torque6_min;
    @TableField("torque7_max")
    private Double torque7_max;
    @TableField("torque7_min")
    private Double torque7_min;
    @TableField("torque8_max")
    private Double torque8_max;
    @TableField("torque8_min")
    private Double torque8_min;

    public Torque(Integer id, String robotsn, String factory_end, String factory_type, String robotsn_type, Double torque1_max, Double torque1_min, Double torque2_max, Double torque2_min, Double torque3_max, Double torque3_min, Double torque4_max, Double torque4_min, Double torque5_max, Double torque5_min, Double torque6_max, Double torque6_min, Double torque7_max, Double torque7_min, Double torque8_max, Double torque8_min) {
        this.id = id;
        this.robotsn = robotsn;
        this.factory_end = factory_end;
        this.factory_type = factory_type;
        this.robotsn_type = robotsn_type;
        this.torque1_max = torque1_max;
        this.torque1_min = torque1_min;
        this.torque2_max = torque2_max;
        this.torque2_min = torque2_min;
        this.torque3_max = torque3_max;
        this.torque3_min = torque3_min;
        this.torque4_max = torque4_max;
        this.torque4_min = torque4_min;
        this.torque5_max = torque5_max;
        this.torque5_min = torque5_min;
        this.torque6_max = torque6_max;
        this.torque6_min = torque6_min;
        this.torque7_max = torque7_max;
        this.torque7_min = torque7_min;
        this.torque8_max = torque8_max;
        this.torque8_min = torque8_min;
    }

    public Torque(String robotsn, Double torque1_max, Double torque1_min, Double torque2_max, Double torque2_min, Double torque3_max, Double torque3_min, Double torque4_max, Double torque4_min, Double torque5_max, Double torque5_min, Double torque6_max, Double torque6_min, Double torque7_max, Double torque7_min, Double torque8_max, Double torque8_min) {
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

    public Double getTorque1_max() {
        return torque1_max;
    }

    public void setTorque1_max(Double torque1_max) {
        this.torque1_max = torque1_max;
    }

    public Double getTorque1_min() {
        return torque1_min;
    }

    public void setTorque1_min(Double torque1_min) {
        this.torque1_min = torque1_min;
    }

    public Double getTorque2_max() {
        return torque2_max;
    }

    public void setTorque2_max(Double torque2_max) {
        this.torque2_max = torque2_max;
    }

    public Double getTorque2_min() {
        return torque2_min;
    }

    public void setTorque2_min(Double torque2_min) {
        this.torque2_min = torque2_min;
    }

    public Double getTorque3_max() {
        return torque3_max;
    }

    public void setTorque3_max(Double torque3_max) {
        this.torque3_max = torque3_max;
    }

    public Double getTorque3_min() {
        return torque3_min;
    }

    public void setTorque3_min(Double torque3_min) {
        this.torque3_min = torque3_min;
    }

    public Double getTorque4_max() {
        return torque4_max;
    }

    public void setTorque4_max(Double torque4_max) {
        this.torque4_max = torque4_max;
    }

    public Double getTorque4_min() {
        return torque4_min;
    }

    public void setTorque4_min(Double torque4_min) {
        this.torque4_min = torque4_min;
    }

    public Double getTorque5_max() {
        return torque5_max;
    }

    public void setTorque5_max(Double torque5_max) {
        this.torque5_max = torque5_max;
    }

    public Double getTorque5_min() {
        return torque5_min;
    }

    public void setTorque5_min(Double torque5_min) {
        this.torque5_min = torque5_min;
    }

    public Double getTorque6_max() {
        return torque6_max;
    }

    public void setTorque6_max(Double torque6_max) {
        this.torque6_max = torque6_max;
    }

    public Double getTorque6_min() {
        return torque6_min;
    }

    public void setTorque6_min(Double torque6_min) {
        this.torque6_min = torque6_min;
    }

    public Double getTorque7_max() {
        return torque7_max;
    }

    public void setTorque7_max(Double torque7_max) {
        this.torque7_max = torque7_max;
    }

    public Double getTorque7_min() {
        return torque7_min;
    }

    public void setTorque7_min(Double torque7_min) {
        this.torque7_min = torque7_min;
    }

    public Double getTorque8_max() {
        return torque8_max;
    }

    public void setTorque8_max(Double torque8_max) {
        this.torque8_max = torque8_max;
    }

    public Double getTorque8_min() {
        return torque8_min;
    }

    public void setTorque8_min(Double torque8_min) {
        this.torque8_min = torque8_min;
    }

    @Override
    public String toString() {
        return "Torque{" +
                "id=" + id +
                ", robotsn='" + robotsn + '\'' +
                ", factory_end='" + factory_end + '\'' +
                ", factory_type='" + factory_type + '\'' +
                ", robotsn_type='" + robotsn_type + '\'' +
                ", torque1_max=" + torque1_max +
                ", torque1_min=" + torque1_min +
                ", torque2_max=" + torque2_max +
                ", torque2_min=" + torque2_min +
                ", torque3_max=" + torque3_max +
                ", torque3_min=" + torque3_min +
                ", torque4_max=" + torque4_max +
                ", torque4_min=" + torque4_min +
                ", torque5_max=" + torque5_max +
                ", torque5_min=" + torque5_min +
                ", torque6_max=" + torque6_max +
                ", torque6_min=" + torque6_min +
                ", torque7_max=" + torque7_max +
                ", torque7_min=" + torque7_min +
                ", torque8_max=" + torque8_max +
                ", torque8_min=" + torque8_min +
                '}';
    }
}
