package net.maku.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;

@Table("robotstar_motortorque")
@JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)
public class RoboTorque {
    @Column
    private String motortorque_savetime;
    @PrimaryKeyColumn(name = "motortorque_datetime",type = PrimaryKeyType.CLUSTERED)
    private Timestamp motortorque_datetime;
    @PrimaryKeyColumn(name = "motortorque_robotsn",type = PrimaryKeyType.PARTITIONED)
    private String motortorque_robotsn;
    @Column
    private Double motortorque_axis1_torque;
    @Column
    private Double motortorque_axis2_torque;
    @Column
    private Double motortorque_axis3_torque;
    @Column
    private Double motortorque_axis4_torque;
    @Column
    private Double motortorque_axis5_torque;
    @Column
    private Double motortorque_axis6_torque;
    @Column
    private Double motortorque_axis7_torque;
    @Column
    private Double motortorque_axis8_torque;

    public RoboTorque(String motortorque_savetime, Timestamp motortorque_datetime, String motortorque_robotsn, Double motortorque_axis1_torque, Double motortorque_axis2_torque, Double motortorque_axis3_torque, Double motortorque_axis4_torque, Double motortorque_axis5_torque, Double motortorque_axis6_torque, Double motortorque_axis7_torque, Double motortorque_axis8_torque) {
        this.motortorque_savetime = motortorque_savetime;
        this.motortorque_datetime = motortorque_datetime;
        this.motortorque_robotsn = motortorque_robotsn;
        this.motortorque_axis1_torque = motortorque_axis1_torque;
        this.motortorque_axis2_torque = motortorque_axis2_torque;
        this.motortorque_axis3_torque = motortorque_axis3_torque;
        this.motortorque_axis4_torque = motortorque_axis4_torque;
        this.motortorque_axis5_torque = motortorque_axis5_torque;
        this.motortorque_axis6_torque = motortorque_axis6_torque;
        this.motortorque_axis7_torque = motortorque_axis7_torque;
        this.motortorque_axis8_torque = motortorque_axis8_torque;
    }

    public String getMotortorque_savetime() {
        return motortorque_savetime;
    }

    public void setMotortorque_savetime(String motortorque_savetime) {
        this.motortorque_savetime = motortorque_savetime;
    }

    public Timestamp getMotortorque_datetime() {
        return motortorque_datetime;
    }

    public void setMotortorque_datetime(Timestamp motortorque_datetime) {
        this.motortorque_datetime = motortorque_datetime;
    }

    public String getMotortorque_robotsn() {
        return motortorque_robotsn;
    }

    public void setMotortorque_robotsn(String motortorque_robotsn) {
        this.motortorque_robotsn = motortorque_robotsn;
    }

    public Double getMotortorque_axis1_torque() {
        return motortorque_axis1_torque;
    }

    public void setMotortorque_axis1_torque(Double motortorque_axis1_torque) {
        this.motortorque_axis1_torque = motortorque_axis1_torque;
    }

    public Double getMotortorque_axis2_torque() {
        return motortorque_axis2_torque;
    }

    public void setMotortorque_axis2_torque(Double motortorque_axis2_torque) {
        this.motortorque_axis2_torque = motortorque_axis2_torque;
    }

    public Double getMotortorque_axis3_torque() {
        return motortorque_axis3_torque;
    }

    public void setMotortorque_axis3_torque(Double motortorque_axis3_torque) {
        this.motortorque_axis3_torque = motortorque_axis3_torque;
    }

    public Double getMotortorque_axis4_torque() {
        return motortorque_axis4_torque;
    }

    public void setMotortorque_axis4_torque(Double motortorque_axis4_torque) {
        this.motortorque_axis4_torque = motortorque_axis4_torque;
    }

    public Double getMotortorque_axis5_torque() {
        return motortorque_axis5_torque;
    }

    public void setMotortorque_axis5_torque(Double motortorque_axis5_torque) {
        this.motortorque_axis5_torque = motortorque_axis5_torque;
    }

    public Double getMotortorque_axis6_torque() {
        return motortorque_axis6_torque;
    }

    public void setMotortorque_axis6_torque(Double motortorque_axis6_torque) {
        this.motortorque_axis6_torque = motortorque_axis6_torque;
    }

    public Double getMotortorque_axis7_torque() {
        return motortorque_axis7_torque;
    }

    public void setMotortorque_axis7_torque(Double motortorque_axis7_torque) {
        this.motortorque_axis7_torque = motortorque_axis7_torque;
    }

    public Double getMotortorque_axis8_torque() {
        return motortorque_axis8_torque;
    }

    public void setMotortorque_axis8_torque(Double motortorque_axis8_torque) {
        this.motortorque_axis8_torque = motortorque_axis8_torque;
    }

    @Override
    public String toString() {
        return "RoboTorque{" +
                "motortorque_savetime='" + motortorque_savetime + '\'' +
                ", motortorque_datetime=" + motortorque_datetime +
                ", motortorque_robotsn='" + motortorque_robotsn + '\'' +
                ", motortorque_axis1_torque=" + motortorque_axis1_torque +
                ", motortorque_axis2_torque=" + motortorque_axis2_torque +
                ", motortorque_axis3_torque=" + motortorque_axis3_torque +
                ", motortorque_axis4_torque=" + motortorque_axis4_torque +
                ", motortorque_axis5_torque=" + motortorque_axis5_torque +
                ", motortorque_axis6_torque=" + motortorque_axis6_torque +
                ", motortorque_axis7_torque=" + motortorque_axis7_torque +
                ", motortorque_axis8_torque=" + motortorque_axis8_torque +
                '}';
    }
}
