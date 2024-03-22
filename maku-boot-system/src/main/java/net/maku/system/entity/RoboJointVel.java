package net.maku.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.sql.Timestamp;

@Table("robotstar_jointvel")
@JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)
public class RoboJointVel implements Serializable { @Column
private String jointvel_savetime;
    @PrimaryKeyColumn(name = "jointvel_datetime",type = PrimaryKeyType.CLUSTERED)
    private Timestamp jointvel_datetime;
    @PrimaryKeyColumn(name = "jointvel_robotsn",type = PrimaryKeyType.PARTITIONED)
    private String jointvel_robotsn;
    @Column
    private Double jointvel_axis1_err_speed;
    @Column
    private Double jointvel_axis2_err_speed;
    @Column
    private Double jointvel_axis3_err_speed;
    @Column
    private Double jointvel_axis4_err_speed;
    @Column
    private Double jointvel_axis5_err_speed;
    @Column
    private Double jointvel_axis6_err_speed;
    @Column
    private Double jointvel_axis7_err_speed;
    @Column
    private Double jointvel_axis8_err_speed;

    public RoboJointVel(String jointvel_savetime, Timestamp jointvel_datetime, String jointvel_robotsn, Double jointvel_axis1_err_speed, Double jointvel_axis2_err_speed, Double jointvel_axis3_err_speed, Double jointvel_axis4_err_speed, Double jointvel_axis5_err_speed, Double jointvel_axis6_err_speed, Double jointvel_axis7_err_speed, Double jointvel_axis8_err_speed) {
        this.jointvel_savetime = jointvel_savetime;
        this.jointvel_datetime = jointvel_datetime;
        this.jointvel_robotsn = jointvel_robotsn;
        this.jointvel_axis1_err_speed = jointvel_axis1_err_speed;
        this.jointvel_axis2_err_speed = jointvel_axis2_err_speed;
        this.jointvel_axis3_err_speed = jointvel_axis3_err_speed;
        this.jointvel_axis4_err_speed = jointvel_axis4_err_speed;
        this.jointvel_axis5_err_speed = jointvel_axis5_err_speed;
        this.jointvel_axis6_err_speed = jointvel_axis6_err_speed;
        this.jointvel_axis7_err_speed = jointvel_axis7_err_speed;
        this.jointvel_axis8_err_speed = jointvel_axis8_err_speed;
    }

    public String getJointvel_savetime() {
        return jointvel_savetime;
    }

    public void setJointvel_savetime(String jointvel_savetime) {
        this.jointvel_savetime = jointvel_savetime;
    }

    public Timestamp getJointvel_datetime() {
        return jointvel_datetime;
    }

    public void setJointvel_datetime(Timestamp jointvel_datetime) {
        this.jointvel_datetime = jointvel_datetime;
    }

    public String getJointvel_robotsn() {
        return jointvel_robotsn;
    }

    public void setJointvel_robotsn(String jointvel_robotsn) {
        this.jointvel_robotsn = jointvel_robotsn;
    }

    public Double getJointvel_axis1_err_speed() {
        return jointvel_axis1_err_speed;
    }

    public void setJointvel_axis1_err_speed(Double jointvel_axis1_err_speed) {
        this.jointvel_axis1_err_speed = jointvel_axis1_err_speed;
    }

    public Double getJointvel_axis2_err_speed() {
        return jointvel_axis2_err_speed;
    }

    public void setJointvel_axis2_err_speed(Double jointvel_axis2_err_speed) {
        this.jointvel_axis2_err_speed = jointvel_axis2_err_speed;
    }

    public Double getJointvel_axis3_err_speed() {
        return jointvel_axis3_err_speed;
    }

    public void setJointvel_axis3_err_speed(Double jointvel_axis3_err_speed) {
        this.jointvel_axis3_err_speed = jointvel_axis3_err_speed;
    }

    public Double getJointvel_axis4_err_speed() {
        return jointvel_axis4_err_speed;
    }

    public void setJointvel_axis4_err_speed(Double jointvel_axis4_err_speed) {
        this.jointvel_axis4_err_speed = jointvel_axis4_err_speed;
    }

    public Double getJointvel_axis5_err_speed() {
        return jointvel_axis5_err_speed;
    }

    public void setJointvel_axis5_err_speed(Double jointvel_axis5_err_speed) {
        this.jointvel_axis5_err_speed = jointvel_axis5_err_speed;
    }

    public Double getJointvel_axis6_err_speed() {
        return jointvel_axis6_err_speed;
    }

    public void setJointvel_axis6_err_speed(Double jointvel_axis6_err_speed) {
        this.jointvel_axis6_err_speed = jointvel_axis6_err_speed;
    }

    public Double getJointvel_axis7_err_speed() {
        return jointvel_axis7_err_speed;
    }

    public void setJointvel_axis7_err_speed(Double jointvel_axis7_err_speed) {
        this.jointvel_axis7_err_speed = jointvel_axis7_err_speed;
    }

    public Double getJointvel_axis8_err_speed() {
        return jointvel_axis8_err_speed;
    }

    public void setJointvel_axis8_err_speed(Double jointvel_axis8_err_speed) {
        this.jointvel_axis8_err_speed = jointvel_axis8_err_speed;
    }

    @Override
    public String toString() {
        return "RoboJointVel{" +
                "jointvel_savetime='" + jointvel_savetime + '\'' +
                ", jointvel_datetime=" + jointvel_datetime +
                ", jointvel_robotsn='" + jointvel_robotsn + '\'' +
                ", jointvel_axis1_err_speed=" + jointvel_axis1_err_speed +
                ", jointvel_axis2_err_speed=" + jointvel_axis2_err_speed +
                ", jointvel_axis3_err_speed=" + jointvel_axis3_err_speed +
                ", jointvel_axis4_err_speed=" + jointvel_axis4_err_speed +
                ", jointvel_axis5_err_speed=" + jointvel_axis5_err_speed +
                ", jointvel_axis6_err_speed=" + jointvel_axis6_err_speed +
                ", jointvel_axis7_err_speed=" + jointvel_axis7_err_speed +
                ", jointvel_axis8_err_speed=" + jointvel_axis8_err_speed +
                '}';
    }
}
