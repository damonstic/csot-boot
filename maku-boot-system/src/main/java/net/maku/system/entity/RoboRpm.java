package net.maku.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.sql.Timestamp;

@Table("robotstar_motorrpm")
@JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)
public class RoboRpm implements Serializable {
    @Column
    private String motorrpm_savetime;
    @PrimaryKeyColumn(name = "motorrpm_datetime",type = PrimaryKeyType.CLUSTERED)
    private Timestamp motorrpm_datetime;
    @PrimaryKeyColumn(name = "motorrpm_robotsn",type = PrimaryKeyType.PARTITIONED)
    private String motorrpm_robotsn;
    @Column
    private Double motorrpm_axis1_speed;
    @Column
    private Double motorrpm_axis2_speed;
    @Column
    private Double motorrpm_axis3_speed;
    @Column
    private Double motorrpm_axis4_speed;
    @Column
    private Double motorrpm_axis5_speed;
    @Column
    private Double motorrpm_axis6_speed;
    @Column
    private Double motorrpm_axis7_speed;
    @Column
    private Double motorrpm_axis8_speed;

    public RoboRpm(String motorrpm_savetime, Timestamp motorrpm_datetime, String motorrpm_robotsn, Double motorrpm_axis1_speed, Double motorrpm_axis2_speed, Double motorrpm_axis3_speed, Double motorrpm_axis4_speed, Double motorrpm_axis5_speed, Double motorrpm_axis6_speed, Double motorrpm_axis7_speed, Double motorrpm_axis8_speed) {
        this.motorrpm_savetime = motorrpm_savetime;
        this.motorrpm_datetime = motorrpm_datetime;
        this.motorrpm_robotsn = motorrpm_robotsn;
        this.motorrpm_axis1_speed = motorrpm_axis1_speed;
        this.motorrpm_axis2_speed = motorrpm_axis2_speed;
        this.motorrpm_axis3_speed = motorrpm_axis3_speed;
        this.motorrpm_axis4_speed = motorrpm_axis4_speed;
        this.motorrpm_axis5_speed = motorrpm_axis5_speed;
        this.motorrpm_axis6_speed = motorrpm_axis6_speed;
        this.motorrpm_axis7_speed = motorrpm_axis7_speed;
        this.motorrpm_axis8_speed = motorrpm_axis8_speed;
    }

    public String getMotorrpm_savetime() {
        return motorrpm_savetime;
    }

    public void setMotorrpm_savetime(String motorrpm_savetime) {
        this.motorrpm_savetime = motorrpm_savetime;
    }

    public Timestamp getMotorrpm_datetime() {
        return motorrpm_datetime;
    }

    public void setMotorrpm_datetime(Timestamp motorrpm_datetime) {
        this.motorrpm_datetime = motorrpm_datetime;
    }

    public String getMotorrpm_robotsn() {
        return motorrpm_robotsn;
    }

    public void setMotorrpm_robotsn(String motorrpm_robotsn) {
        this.motorrpm_robotsn = motorrpm_robotsn;
    }

    public Double getMotorrpm_axis1_speed() {
        return motorrpm_axis1_speed;
    }

    public void setMotorrpm_axis1_speed(Double motorrpm_axis1_speed) {
        this.motorrpm_axis1_speed = motorrpm_axis1_speed;
    }

    public Double getMotorrpm_axis2_speed() {
        return motorrpm_axis2_speed;
    }

    public void setMotorrpm_axis2_speed(Double motorrpm_axis2_speed) {
        this.motorrpm_axis2_speed = motorrpm_axis2_speed;
    }

    public Double getMotorrpm_axis3_speed() {
        return motorrpm_axis3_speed;
    }

    public void setMotorrpm_axis3_speed(Double motorrpm_axis3_speed) {
        this.motorrpm_axis3_speed = motorrpm_axis3_speed;
    }

    public Double getMotorrpm_axis4_speed() {
        return motorrpm_axis4_speed;
    }

    public void setMotorrpm_axis4_speed(Double motorrpm_axis4_speed) {
        this.motorrpm_axis4_speed = motorrpm_axis4_speed;
    }

    public Double getMotorrpm_axis5_speed() {
        return motorrpm_axis5_speed;
    }

    public void setMotorrpm_axis5_speed(Double motorrpm_axis5_speed) {
        this.motorrpm_axis5_speed = motorrpm_axis5_speed;
    }

    public Double getMotorrpm_axis6_speed() {
        return motorrpm_axis6_speed;
    }

    public void setMotorrpm_axis6_speed(Double motorrpm_axis6_speed) {
        this.motorrpm_axis6_speed = motorrpm_axis6_speed;
    }

    public Double getMotorrpm_axis7_speed() {
        return motorrpm_axis7_speed;
    }

    public void setMotorrpm_axis7_speed(Double motorrpm_axis7_speed) {
        this.motorrpm_axis7_speed = motorrpm_axis7_speed;
    }

    public Double getMotorrpm_axis8_speed() {
        return motorrpm_axis8_speed;
    }

    public void setMotorrpm_axis8_speed(Double motorrpm_axis8_speed) {
        this.motorrpm_axis8_speed = motorrpm_axis8_speed;
    }

    @Override
    public String toString() {
        return "RoboRpm{" +
                "motorrpm_savetime='" + motorrpm_savetime + '\'' +
                ", motorrpm_datetime=" + motorrpm_datetime +
                ", motorrpm_robotsn='" + motorrpm_robotsn + '\'' +
                ", motorrpm_axis1_speed=" + motorrpm_axis1_speed +
                ", motorrpm_axis2_speed=" + motorrpm_axis2_speed +
                ", motorrpm_axis3_speed=" + motorrpm_axis3_speed +
                ", motorrpm_axis4_speed=" + motorrpm_axis4_speed +
                ", motorrpm_axis5_speed=" + motorrpm_axis5_speed +
                ", motorrpm_axis6_speed=" + motorrpm_axis6_speed +
                ", motorrpm_axis7_speed=" + motorrpm_axis7_speed +
                ", motorrpm_axis8_speed=" + motorrpm_axis8_speed +
                '}';
    }
}
