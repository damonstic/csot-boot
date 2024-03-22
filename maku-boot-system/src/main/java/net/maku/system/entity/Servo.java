package net.maku.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("san_servo_max_min")
public class Servo {
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
    @TableField("pulse1_max")
    private Double pulse1_max;
    @TableField("pulse1_min")
    private Double pulse1_min;
    @TableField("pulse2_max")
    private Double pulse2_max;
    @TableField("pulse2_min")
    private Double pulse2_min;
    @TableField("pulse3_max")
    private Double pulse3_max;
    @TableField("pulse3_min")
    private Double pulse3_min;
    @TableField("pulse4_max")
    private Double pulse4_max;
    @TableField("pulse4_min")
    private Double pulse4_min;
    @TableField("pulse5_max")
    private Double pulse5_max;
    @TableField("pulse5_min")
    private Double pulse5_min;
    @TableField("pulse6_max")
    private Double pulse6_max;
    @TableField("pulse6_min")
    private Double pulse6_min;
    @TableField("pulse7_max")
    private Double pulse7_max;
    @TableField("pulse7_min")
    private Double pulse7_min;
    @TableField("pulse8_max")
    private Double pulse8_max;
    @TableField("pulse8_min")
    private Double pulse8_min;

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

    @TableField("errp1_max")
    private Double errp1_max;
    @TableField("errp1_min")
    private Double errp1_min;
    @TableField("errp2_max")
    private Double errp2_max;
    @TableField("errp2_min")
    private Double errp2_min;
    @TableField("errp3_max")
    private Double errp3_max;
    @TableField("errp3_min")
    private Double errp3_min;
    @TableField("errp4_max")
    private Double errp4_max;
    @TableField("errp4_min")
    private Double errp4_min;
    @TableField("errp5_max")
    private Double errp5_max;
    @TableField("errp5_min")
    private Double errp5_min;
    @TableField("errp6_max")
    private Double errp6_max;
    @TableField("errp6_min")
    private Double errp6_min;
    @TableField("errp7_max")
    private Double errp7_max;
    @TableField("errp7_min")
    private Double errp7_min;
    @TableField("errp8_max")
    private Double errp8_max;
    @TableField("errp8_min")
    private Double errp8_min;

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


    public Servo(Integer id, String robotsn, String factory_end, String factory_type, String robotsn_type, Double pulse1_max, Double pulse1_min, Double pulse2_max, Double pulse2_min, Double pulse3_max, Double pulse3_min, Double pulse4_max, Double pulse4_min, Double pulse5_max, Double pulse5_min, Double pulse6_max, Double pulse6_min, Double pulse7_max, Double pulse7_min, Double pulse8_max, Double pulse8_min, Double torque1_max, Double torque1_min, Double torque2_max, Double torque2_min, Double torque3_max, Double torque3_min, Double torque4_max, Double torque4_min, Double torque5_max, Double torque5_min, Double torque6_max, Double torque6_min, Double torque7_max, Double torque7_min, Double torque8_max, Double torque8_min, Double errp1_max, Double errp1_min, Double errp2_max, Double errp2_min, Double errp3_max, Double errp3_min, Double errp4_max, Double errp4_min, Double errp5_max, Double errp5_min, Double errp6_max, Double errp6_min, Double errp7_max, Double errp7_min, Double errp8_max, Double errp8_min, Double velp1_max, Double velp1_min, Double velp2_max, Double velp2_min, Double velp3_max, Double velp3_min, Double velp4_max, Double velp4_min, Double velp5_max, Double velp5_min, Double velp6_max, Double velp6_min, Double velp7_max, Double velp7_min, Double velp8_max, Double velp8_min) {
        this.id = id;
        this.robotsn = robotsn;
        this.factory_end = factory_end;
        this.factory_type = factory_type;
        this.robotsn_type = robotsn_type;
        this.pulse1_max = pulse1_max;
        this.pulse1_min = pulse1_min;
        this.pulse2_max = pulse2_max;
        this.pulse2_min = pulse2_min;
        this.pulse3_max = pulse3_max;
        this.pulse3_min = pulse3_min;
        this.pulse4_max = pulse4_max;
        this.pulse4_min = pulse4_min;
        this.pulse5_max = pulse5_max;
        this.pulse5_min = pulse5_min;
        this.pulse6_max = pulse6_max;
        this.pulse6_min = pulse6_min;
        this.pulse7_max = pulse7_max;
        this.pulse7_min = pulse7_min;
        this.pulse8_max = pulse8_max;
        this.pulse8_min = pulse8_min;
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
        this.errp1_max = errp1_max;
        this.errp1_min = errp1_min;
        this.errp2_max = errp2_max;
        this.errp2_min = errp2_min;
        this.errp3_max = errp3_max;
        this.errp3_min = errp3_min;
        this.errp4_max = errp4_max;
        this.errp4_min = errp4_min;
        this.errp5_max = errp5_max;
        this.errp5_min = errp5_min;
        this.errp6_max = errp6_max;
        this.errp6_min = errp6_min;
        this.errp7_max = errp7_max;
        this.errp7_min = errp7_min;
        this.errp8_max = errp8_max;
        this.errp8_min = errp8_min;
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

    public Servo(String robotsn, Double torque1_max, Double torque1_min, Double torque2_max, Double torque2_min, Double torque3_max, Double torque3_min, Double torque4_max, Double torque4_min, Double torque5_max, Double torque5_min, Double torque6_max, Double torque6_min, Double torque7_max, Double torque7_min, Double torque8_max, Double torque8_min, Double pulse1_max, Double pulse1_min, Double pulse2_max, Double pulse2_min, Double pulse3_max, Double pulse3_min, Double pulse4_max, Double pulse4_min, Double pulse5_max, Double pulse5_min, Double pulse6_max, Double pulse6_min, Double pulse7_max, Double pulse7_min, Double pulse8_max, Double pulse8_min) {
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

    public Double getPulse1_max() {
        return pulse1_max;
    }

    public void setPulse1_max(Double pulse1_max) {
        this.pulse1_max = pulse1_max;
    }

    public Double getPulse1_min() {
        return pulse1_min;
    }

    public void setPulse1_min(Double pulse1_min) {
        this.pulse1_min = pulse1_min;
    }

    public Double getPulse2_max() {
        return pulse2_max;
    }

    public void setPulse2_max(Double pulse2_max) {
        this.pulse2_max = pulse2_max;
    }

    public Double getPulse2_min() {
        return pulse2_min;
    }

    public void setPulse2_min(Double pulse2_min) {
        this.pulse2_min = pulse2_min;
    }

    public Double getPulse3_max() {
        return pulse3_max;
    }

    public void setPulse3_max(Double pulse3_max) {
        this.pulse3_max = pulse3_max;
    }

    public Double getPulse3_min() {
        return pulse3_min;
    }

    public void setPulse3_min(Double pulse3_min) {
        this.pulse3_min = pulse3_min;
    }

    public Double getPulse4_max() {
        return pulse4_max;
    }

    public void setPulse4_max(Double pulse4_max) {
        this.pulse4_max = pulse4_max;
    }

    public Double getPulse4_min() {
        return pulse4_min;
    }

    public void setPulse4_min(Double pulse4_min) {
        this.pulse4_min = pulse4_min;
    }

    public Double getPulse5_max() {
        return pulse5_max;
    }

    public void setPulse5_max(Double pulse5_max) {
        this.pulse5_max = pulse5_max;
    }

    public Double getPulse5_min() {
        return pulse5_min;
    }

    public void setPulse5_min(Double pulse5_min) {
        this.pulse5_min = pulse5_min;
    }

    public Double getPulse6_max() {
        return pulse6_max;
    }

    public void setPulse6_max(Double pulse6_max) {
        this.pulse6_max = pulse6_max;
    }

    public Double getPulse6_min() {
        return pulse6_min;
    }

    public void setPulse6_min(Double pulse6_min) {
        this.pulse6_min = pulse6_min;
    }

    public Double getPulse7_max() {
        return pulse7_max;
    }

    public void setPulse7_max(Double pulse7_max) {
        this.pulse7_max = pulse7_max;
    }

    public Double getPulse7_min() {
        return pulse7_min;
    }

    public void setPulse7_min(Double pulse7_min) {
        this.pulse7_min = pulse7_min;
    }

    public Double getPulse8_max() {
        return pulse8_max;
    }

    public void setPulse8_max(Double pulse8_max) {
        this.pulse8_max = pulse8_max;
    }

    public Double getPulse8_min() {
        return pulse8_min;
    }

    public void setPulse8_min(Double pulse8_min) {
        this.pulse8_min = pulse8_min;
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

    public Double getErrp1_max() {
        return errp1_max;
    }

    public void setErrp1_max(Double errp1_max) {
        this.errp1_max = errp1_max;
    }

    public Double getErrp1_min() {
        return errp1_min;
    }

    public void setErrp1_min(Double errp1_min) {
        this.errp1_min = errp1_min;
    }

    public Double getErrp2_max() {
        return errp2_max;
    }

    public void setErrp2_max(Double errp2_max) {
        this.errp2_max = errp2_max;
    }

    public Double getErrp2_min() {
        return errp2_min;
    }

    public void setErrp2_min(Double errp2_min) {
        this.errp2_min = errp2_min;
    }

    public Double getErrp3_max() {
        return errp3_max;
    }

    public void setErrp3_max(Double errp3_max) {
        this.errp3_max = errp3_max;
    }

    public Double getErrp3_min() {
        return errp3_min;
    }

    public void setErrp3_min(Double errp3_min) {
        this.errp3_min = errp3_min;
    }

    public Double getErrp4_max() {
        return errp4_max;
    }

    public void setErrp4_max(Double errp4_max) {
        this.errp4_max = errp4_max;
    }

    public Double getErrp4_min() {
        return errp4_min;
    }

    public void setErrp4_min(Double errp4_min) {
        this.errp4_min = errp4_min;
    }

    public Double getErrp5_max() {
        return errp5_max;
    }

    public void setErrp5_max(Double errp5_max) {
        this.errp5_max = errp5_max;
    }

    public Double getErrp5_min() {
        return errp5_min;
    }

    public void setErrp5_min(Double errp5_min) {
        this.errp5_min = errp5_min;
    }

    public Double getErrp6_max() {
        return errp6_max;
    }

    public void setErrp6_max(Double errp6_max) {
        this.errp6_max = errp6_max;
    }

    public Double getErrp6_min() {
        return errp6_min;
    }

    public void setErrp6_min(Double errp6_min) {
        this.errp6_min = errp6_min;
    }

    public Double getErrp7_max() {
        return errp7_max;
    }

    public void setErrp7_max(Double errp7_max) {
        this.errp7_max = errp7_max;
    }

    public Double getErrp7_min() {
        return errp7_min;
    }

    public void setErrp7_min(Double errp7_min) {
        this.errp7_min = errp7_min;
    }

    public Double getErrp8_max() {
        return errp8_max;
    }

    public void setErrp8_max(Double errp8_max) {
        this.errp8_max = errp8_max;
    }

    public Double getErrp8_min() {
        return errp8_min;
    }

    public void setErrp8_min(Double errp8_min) {
        this.errp8_min = errp8_min;
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
        return "Servo{" +
                "id=" + id +
                ", robotsn='" + robotsn + '\'' +
                ", factory_end='" + factory_end + '\'' +
                ", factory_type='" + factory_type + '\'' +
                ", robotsn_type='" + robotsn_type + '\'' +
                ", pulse1_max=" + pulse1_max +
                ", pulse1_min=" + pulse1_min +
                ", pulse2_max=" + pulse2_max +
                ", pulse2_min=" + pulse2_min +
                ", pulse3_max=" + pulse3_max +
                ", pulse3_min=" + pulse3_min +
                ", pulse4_max=" + pulse4_max +
                ", pulse4_min=" + pulse4_min +
                ", pulse5_max=" + pulse5_max +
                ", pulse5_min=" + pulse5_min +
                ", pulse6_max=" + pulse6_max +
                ", pulse6_min=" + pulse6_min +
                ", pulse7_max=" + pulse7_max +
                ", pulse7_min=" + pulse7_min +
                ", pulse8_max=" + pulse8_max +
                ", pulse8_min=" + pulse8_min +
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
                ", errp1_max=" + errp1_max +
                ", errp1_min=" + errp1_min +
                ", errp2_max=" + errp2_max +
                ", errp2_min=" + errp2_min +
                ", errp3_max=" + errp3_max +
                ", errp3_min=" + errp3_min +
                ", errp4_max=" + errp4_max +
                ", errp4_min=" + errp4_min +
                ", errp5_max=" + errp5_max +
                ", errp5_min=" + errp5_min +
                ", errp6_max=" + errp6_max +
                ", errp6_min=" + errp6_min +
                ", errp7_max=" + errp7_max +
                ", errp7_min=" + errp7_min +
                ", errp8_max=" + errp8_max +
                ", errp8_min=" + errp8_min +
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
