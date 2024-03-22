package net.maku.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jnr.ffi.annotations.In;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.sql.Timestamp;

@Table("robotstar_motortemp")
@JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)
public class RoboMotorTemp implements Serializable {
    @Column
    private String motortemp_savetime;
    @PrimaryKeyColumn(name = "motortemp_datetime",type = PrimaryKeyType.CLUSTERED)
    private Timestamp motortemp_datetime;
    @PrimaryKeyColumn(name = "motortemp_robotsn",type = PrimaryKeyType.PARTITIONED)
    private String motortemp_robotsn;
    @Column
    private Double motortemp_axis1_temp;
    @Column
    private Double motortemp_axis2_temp;
    @Column
    private Double motortemp_axis3_temp;
    @Column
    private Double motortemp_axis4_temp;
    @Column
    private Double motortemp_axis5_temp;
    @Column
    private Double motortemp_axis6_temp;
    @Column
    private Double motortemp_axis7_temp;
    @Column
    private Double motortemp_axis8_temp;

    public RoboMotorTemp(String motortemp_savetime, Timestamp motortemp_datetime, String motortemp_robotsn, Double motortemp_axis1_temp, Double motortemp_axis2_temp, Double motortemp_axis3_temp, Double motortemp_axis4_temp, Double motortemp_axis5_temp, Double motortemp_axis6_temp, Double motortemp_axis7_temp, Double motortemp_axis8_temp) {
        this.motortemp_savetime = motortemp_savetime;
        this.motortemp_datetime = motortemp_datetime;
        this.motortemp_robotsn = motortemp_robotsn;
        this.motortemp_axis1_temp = motortemp_axis1_temp;
        this.motortemp_axis2_temp = motortemp_axis2_temp;
        this.motortemp_axis3_temp = motortemp_axis3_temp;
        this.motortemp_axis4_temp = motortemp_axis4_temp;
        this.motortemp_axis5_temp = motortemp_axis5_temp;
        this.motortemp_axis6_temp = motortemp_axis6_temp;
        this.motortemp_axis7_temp = motortemp_axis7_temp;
        this.motortemp_axis8_temp = motortemp_axis8_temp;
    }

    public String getMotortemp_savetime() {
        return motortemp_savetime;
    }

    public void setMotortemp_savetime(String motortemp_savetime) {
        this.motortemp_savetime = motortemp_savetime;
    }

    public Timestamp getMotortemp_datetime() {
        return motortemp_datetime;
    }

    public void setMotortemp_datetime(Timestamp motortemp_datetime) {
        this.motortemp_datetime = motortemp_datetime;
    }

    public String getMotortemp_robotsn() {
        return motortemp_robotsn;
    }

    public void setMotortemp_robotsn(String motortemp_robotsn) {
        this.motortemp_robotsn = motortemp_robotsn;
    }

    public Double getMotortemp_axis1_temp() {
        return motortemp_axis1_temp;
    }

    public void setMotortemp_axis1_temp(Double motortemp_axis1_temp) {
        this.motortemp_axis1_temp = motortemp_axis1_temp;
    }

    public Double getMotortemp_axis2_temp() {
        return motortemp_axis2_temp;
    }

    public void setMotortemp_axis2_temp(Double motortemp_axis2_temp) {
        this.motortemp_axis2_temp = motortemp_axis2_temp;
    }

    public Double getMotortemp_axis3_temp() {
        return motortemp_axis3_temp;
    }

    public void setMotortemp_axis3_temp(Double motortemp_axis3_temp) {
        this.motortemp_axis3_temp = motortemp_axis3_temp;
    }

    public Double getMotortemp_axis4_temp() {
        return motortemp_axis4_temp;
    }

    public void setMotortemp_axis4_temp(Double motortemp_axis4_temp) {
        this.motortemp_axis4_temp = motortemp_axis4_temp;
    }

    public Double getMotortemp_axis5_temp() {
        return motortemp_axis5_temp;
    }

    public void setMotortemp_axis5_temp(Double motortemp_axis5_temp) {
        this.motortemp_axis5_temp = motortemp_axis5_temp;
    }

    public Double getMotortemp_axis6_temp() {
        return motortemp_axis6_temp;
    }

    public void setMotortemp_axis6_temp(Double motortemp_axis6_temp) {
        this.motortemp_axis6_temp = motortemp_axis6_temp;
    }

    public Double getMotortemp_axis7_temp() {
        return motortemp_axis7_temp;
    }

    public void setMotortemp_axis7_temp(Double motortemp_axis7_temp) {
        this.motortemp_axis7_temp = motortemp_axis7_temp;
    }

    public Double getMotortemp_axis8_temp() {
        return motortemp_axis8_temp;
    }

    public void setMotortemp_axis8_temp(Double motortemp_axis8_temp) {
        this.motortemp_axis8_temp = motortemp_axis8_temp;
    }

    @Override
    public String toString() {
        return "RoboMotorTemp{" +
                "motortemp_savetime='" + motortemp_savetime + '\'' +
                ", motortemp_datetime=" + motortemp_datetime +
                ", motortemp_robotsn='" + motortemp_robotsn + '\'' +
                ", motortemp_axis1_temp=" + motortemp_axis1_temp +
                ", motortemp_axis2_temp=" + motortemp_axis2_temp +
                ", motortemp_axis3_temp=" + motortemp_axis3_temp +
                ", motortemp_axis4_temp=" + motortemp_axis4_temp +
                ", motortemp_axis5_temp=" + motortemp_axis5_temp +
                ", motortemp_axis6_temp=" + motortemp_axis6_temp +
                ", motortemp_axis7_temp=" + motortemp_axis7_temp +
                ", motortemp_axis8_temp=" + motortemp_axis8_temp +
                '}';
    }
}
