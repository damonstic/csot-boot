package net.maku.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.sql.Timestamp;

@Table("sankyo_servodata")
@JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)
public class SankyoServo implements Serializable {
    @Column
    private String servodata_savetime;
    @PrimaryKeyColumn(name = "servodata_datetime",type = PrimaryKeyType.CLUSTERED)
    private Timestamp servodata_datetime;
    @PrimaryKeyColumn(name = "servodata_robotsn",type = PrimaryKeyType.PARTITIONED)
    private String servodata_robotsn;
    @Column
    private Integer servodata_axis1_posp;
    @Column
    private Integer servodata_axis1_err;
    @Column
    private Integer servodata_axis1_velp;
    @Column
    private Integer servodata_axis2_posp;
    @Column
    private Integer servodata_axis2_err;
    @Column
    private Integer servodata_axis2_velp;
    @Column
    private Integer servodata_axis3_posp;
    @Column
    private Integer servodata_axis3_err;
    @Column
    private Integer servodata_axis3_velp;
    @Column
    private Integer servodata_axis4_posp;
    @Column
    private Integer servodata_axis4_err;
    @Column
    private Integer servodata_axis4_velp;
    @Column
    private Integer servodata_axis5_posp;
    @Column
    private Integer servodata_axis5_err;
    @Column
    private Integer servodata_axis5_velp;
    @Column
    private Integer servodata_axis6_posp;
    @Column
    private Integer servodata_axis6_err;
    @Column
    private Integer servodata_axis6_velp;
    @Column
    private Integer servodata_axis7_posp;
    @Column
    private Integer servodata_axis7_err;
    @Column
    private Integer servodata_axis7_velp;
    @Column
    private Integer servodata_axis8_posp;
    @Column
    private Integer servodata_axis8_err;
    @Column
    private Integer servodata_axis8_velp;
    @Column
    private Double servodata_axis1_torque;
    @Column
    private Double servodata_axis1_space;
    @Column
    private Double servodata_axis2_torque;
    @Column
    private Double servodata_axis2_space;
    @Column
    private Double servodata_axis3_torque;
    @Column
    private Double servodata_axis3_space;
    @Column
    private Double servodata_axis4_torque;
    @Column
    private Double servodata_axis4_space;
    @Column
    private Double servodata_axis5_torque;
    @Column
    private Double servodata_axis5_space;
    @Column
    private Double servodata_axis6_torque;
    @Column
    private Double servodata_axis6_space;
    @Column
    private Double servodata_axis7_torque;
    @Column
    private Double servodata_axis7_space;
    @Column
    private Double servodata_axis8_torque;
    @Column
    private Double servodata_axis8_space;
    @Column
    private Integer servoData_axis1_address;
    @Column
    private Double servoData_axis1_data;
    @Column
    private Integer servoData_axis2_address;
    @Column
    private Double servoData_axis2_data;
    @Column
    private Integer servoData_axis3_address;
    @Column
    private Double servoData_axis3_data;
    @Column
    private Integer servoData_axis4_address;
    @Column
    private Double servoData_axis4_data;
    @Column
    private Integer servoData_axis5_address;
    @Column
    private Double servoData_axis5_data;
    @Column
    private Integer servoData_axis6_address;
    @Column
    private Double servoData_axis6_data;
    @Column
    private Integer servoData_axis7_address;
    @Column
    private Double servoData_axis7_data;
    @Column
    private Integer servoData_axis8_address;
    @Column
    private Double servoData_axis8_data;
    @Column
    private String servoData_token;

    public SankyoServo(String servodata_savetime, Timestamp servodata_datetime, String servodata_robotsn, Integer servodata_axis1_posp, Integer servodata_axis1_err, Integer servodata_axis1_velp, Integer servodata_axis2_posp, Integer servodata_axis2_err, Integer servodata_axis2_velp, Integer servodata_axis3_posp, Integer servodata_axis3_err, Integer servodata_axis3_velp, Integer servodata_axis4_posp, Integer servodata_axis4_err, Integer servodata_axis4_velp, Integer servodata_axis5_posp, Integer servodata_axis5_err, Integer servodata_axis5_velp, Integer servodata_axis6_posp, Integer servodata_axis6_err, Integer servodata_axis6_velp, Integer servodata_axis7_posp, Integer servodata_axis7_err, Integer servodata_axis7_velp, Integer servodata_axis8_posp, Integer servodata_axis8_err, Integer servodata_axis8_velp, Double servodata_axis1_torque, Double servodata_axis1_space, Double servodata_axis2_torque, Double servodata_axis2_space, Double servodata_axis3_torque, Double servodata_axis3_space, Double servodata_axis4_torque, Double servodata_axis4_space, Double servodata_axis5_torque, Double servodata_axis5_space, Double servodata_axis6_torque, Double servodata_axis6_space, Double servodata_axis7_torque, Double servodata_axis7_space, Double servodata_axis8_torque, Double servodata_axis8_space, Integer servoData_axis1_address, Double servoData_axis1_data, Integer servoData_axis2_address, Double servoData_axis2_data, Integer servoData_axis3_address, Double servoData_axis3_data, Integer servoData_axis4_address, Double servoData_axis4_data, Integer servoData_axis5_address, Double servoData_axis5_data, Integer servoData_axis6_address, Double servoData_axis6_data, Integer servoData_axis7_address, Double servoData_axis7_data, Integer servoData_axis8_address, Double servoData_axis8_data, String servoData_token) {
        this.servodata_savetime = servodata_savetime;
        this.servodata_datetime = servodata_datetime;
        this.servodata_robotsn = servodata_robotsn;
        this.servodata_axis1_posp = servodata_axis1_posp;
        this.servodata_axis1_err = servodata_axis1_err;
        this.servodata_axis1_velp = servodata_axis1_velp;
        this.servodata_axis2_posp = servodata_axis2_posp;
        this.servodata_axis2_err = servodata_axis2_err;
        this.servodata_axis2_velp = servodata_axis2_velp;
        this.servodata_axis3_posp = servodata_axis3_posp;
        this.servodata_axis3_err = servodata_axis3_err;
        this.servodata_axis3_velp = servodata_axis3_velp;
        this.servodata_axis4_posp = servodata_axis4_posp;
        this.servodata_axis4_err = servodata_axis4_err;
        this.servodata_axis4_velp = servodata_axis4_velp;
        this.servodata_axis5_posp = servodata_axis5_posp;
        this.servodata_axis5_err = servodata_axis5_err;
        this.servodata_axis5_velp = servodata_axis5_velp;
        this.servodata_axis6_posp = servodata_axis6_posp;
        this.servodata_axis6_err = servodata_axis6_err;
        this.servodata_axis6_velp = servodata_axis6_velp;
        this.servodata_axis7_posp = servodata_axis7_posp;
        this.servodata_axis7_err = servodata_axis7_err;
        this.servodata_axis7_velp = servodata_axis7_velp;
        this.servodata_axis8_posp = servodata_axis8_posp;
        this.servodata_axis8_err = servodata_axis8_err;
        this.servodata_axis8_velp = servodata_axis8_velp;
        this.servodata_axis1_torque = servodata_axis1_torque;
        this.servodata_axis1_space = servodata_axis1_space;
        this.servodata_axis2_torque = servodata_axis2_torque;
        this.servodata_axis2_space = servodata_axis2_space;
        this.servodata_axis3_torque = servodata_axis3_torque;
        this.servodata_axis3_space = servodata_axis3_space;
        this.servodata_axis4_torque = servodata_axis4_torque;
        this.servodata_axis4_space = servodata_axis4_space;
        this.servodata_axis5_torque = servodata_axis5_torque;
        this.servodata_axis5_space = servodata_axis5_space;
        this.servodata_axis6_torque = servodata_axis6_torque;
        this.servodata_axis6_space = servodata_axis6_space;
        this.servodata_axis7_torque = servodata_axis7_torque;
        this.servodata_axis7_space = servodata_axis7_space;
        this.servodata_axis8_torque = servodata_axis8_torque;
        this.servodata_axis8_space = servodata_axis8_space;
        this.servoData_axis1_address = servoData_axis1_address;
        this.servoData_axis1_data = servoData_axis1_data;
        this.servoData_axis2_address = servoData_axis2_address;
        this.servoData_axis2_data = servoData_axis2_data;
        this.servoData_axis3_address = servoData_axis3_address;
        this.servoData_axis3_data = servoData_axis3_data;
        this.servoData_axis4_address = servoData_axis4_address;
        this.servoData_axis4_data = servoData_axis4_data;
        this.servoData_axis5_address = servoData_axis5_address;
        this.servoData_axis5_data = servoData_axis5_data;
        this.servoData_axis6_address = servoData_axis6_address;
        this.servoData_axis6_data = servoData_axis6_data;
        this.servoData_axis7_address = servoData_axis7_address;
        this.servoData_axis7_data = servoData_axis7_data;
        this.servoData_axis8_address = servoData_axis8_address;
        this.servoData_axis8_data = servoData_axis8_data;
        this.servoData_token = servoData_token;
    }

    public String getServodata_savetime() {
        return servodata_savetime;
    }

    public void setServodata_savetime(String servodata_savetime) {
        this.servodata_savetime = servodata_savetime;
    }

    public Timestamp getServodata_datetime() {
        return servodata_datetime;
    }

    public void setServodata_datetime(Timestamp servodata_datetime) {
        this.servodata_datetime = servodata_datetime;
    }

    public String getServodata_robotsn() {
        return servodata_robotsn;
    }

    public void setServodata_robotsn(String servodata_robotsn) {
        this.servodata_robotsn = servodata_robotsn;
    }

    public Integer getServodata_axis1_posp() {
        return servodata_axis1_posp;
    }

    public void setServodata_axis1_posp(Integer servodata_axis1_posp) {
        this.servodata_axis1_posp = servodata_axis1_posp;
    }

    public Integer getServodata_axis1_err() {
        return servodata_axis1_err;
    }

    public void setServodata_axis1_err(Integer servodata_axis1_err) {
        this.servodata_axis1_err = servodata_axis1_err;
    }

    public Integer getServodata_axis1_velp() {
        return servodata_axis1_velp;
    }

    public void setServodata_axis1_velp(Integer servodata_axis1_velp) {
        this.servodata_axis1_velp = servodata_axis1_velp;
    }

    public Integer getServodata_axis2_posp() {
        return servodata_axis2_posp;
    }

    public void setServodata_axis2_posp(Integer servodata_axis2_posp) {
        this.servodata_axis2_posp = servodata_axis2_posp;
    }

    public Integer getServodata_axis2_err() {
        return servodata_axis2_err;
    }

    public void setServodata_axis2_err(Integer servodata_axis2_err) {
        this.servodata_axis2_err = servodata_axis2_err;
    }

    public Integer getServodata_axis2_velp() {
        return servodata_axis2_velp;
    }

    public void setServodata_axis2_velp(Integer servodata_axis2_velp) {
        this.servodata_axis2_velp = servodata_axis2_velp;
    }

    public Integer getServodata_axis3_posp() {
        return servodata_axis3_posp;
    }

    public void setServodata_axis3_posp(Integer servodata_axis3_posp) {
        this.servodata_axis3_posp = servodata_axis3_posp;
    }

    public Integer getServodata_axis3_err() {
        return servodata_axis3_err;
    }

    public void setServodata_axis3_err(Integer servodata_axis3_err) {
        this.servodata_axis3_err = servodata_axis3_err;
    }

    public Integer getServodata_axis3_velp() {
        return servodata_axis3_velp;
    }

    public void setServodata_axis3_velp(Integer servodata_axis3_velp) {
        this.servodata_axis3_velp = servodata_axis3_velp;
    }

    public Integer getServodata_axis4_posp() {
        return servodata_axis4_posp;
    }

    public void setServodata_axis4_posp(Integer servodata_axis4_posp) {
        this.servodata_axis4_posp = servodata_axis4_posp;
    }

    public Integer getServodata_axis4_err() {
        return servodata_axis4_err;
    }

    public void setServodata_axis4_err(Integer servodata_axis4_err) {
        this.servodata_axis4_err = servodata_axis4_err;
    }

    public Integer getServodata_axis4_velp() {
        return servodata_axis4_velp;
    }

    public void setServodata_axis4_velp(Integer servodata_axis4_velp) {
        this.servodata_axis4_velp = servodata_axis4_velp;
    }

    public Integer getServodata_axis5_posp() {
        return servodata_axis5_posp;
    }

    public void setServodata_axis5_posp(Integer servodata_axis5_posp) {
        this.servodata_axis5_posp = servodata_axis5_posp;
    }

    public Integer getServodata_axis5_err() {
        return servodata_axis5_err;
    }

    public void setServodata_axis5_err(Integer servodata_axis5_err) {
        this.servodata_axis5_err = servodata_axis5_err;
    }

    public Integer getServodata_axis5_velp() {
        return servodata_axis5_velp;
    }

    public void setServodata_axis5_velp(Integer servodata_axis5_velp) {
        this.servodata_axis5_velp = servodata_axis5_velp;
    }

    public Integer getServodata_axis6_posp() {
        return servodata_axis6_posp;
    }

    public void setServodata_axis6_posp(Integer servodata_axis6_posp) {
        this.servodata_axis6_posp = servodata_axis6_posp;
    }

    public Integer getServodata_axis6_err() {
        return servodata_axis6_err;
    }

    public void setServodata_axis6_err(Integer servodata_axis6_err) {
        this.servodata_axis6_err = servodata_axis6_err;
    }

    public Integer getServodata_axis6_velp() {
        return servodata_axis6_velp;
    }

    public void setServodata_axis6_velp(Integer servodata_axis6_velp) {
        this.servodata_axis6_velp = servodata_axis6_velp;
    }

    public Integer getServodata_axis7_posp() {
        return servodata_axis7_posp;
    }

    public void setServodata_axis7_posp(Integer servodata_axis7_posp) {
        this.servodata_axis7_posp = servodata_axis7_posp;
    }

    public Integer getServodata_axis7_err() {
        return servodata_axis7_err;
    }

    public void setServodata_axis7_err(Integer servodata_axis7_err) {
        this.servodata_axis7_err = servodata_axis7_err;
    }

    public Integer getServodata_axis7_velp() {
        return servodata_axis7_velp;
    }

    public void setServodata_axis7_velp(Integer servodata_axis7_velp) {
        this.servodata_axis7_velp = servodata_axis7_velp;
    }

    public Integer getServodata_axis8_posp() {
        return servodata_axis8_posp;
    }

    public void setServodata_axis8_posp(Integer servodata_axis8_posp) {
        this.servodata_axis8_posp = servodata_axis8_posp;
    }

    public Integer getServodata_axis8_err() {
        return servodata_axis8_err;
    }

    public void setServodata_axis8_err(Integer servodata_axis8_err) {
        this.servodata_axis8_err = servodata_axis8_err;
    }

    public Integer getServodata_axis8_velp() {
        return servodata_axis8_velp;
    }

    public void setServodata_axis8_velp(Integer servodata_axis8_velp) {
        this.servodata_axis8_velp = servodata_axis8_velp;
    }

    public Double getServodata_axis1_torque() {
        return servodata_axis1_torque;
    }

    public void setServodata_axis1_torque(Double servodata_axis1_torque) {
        this.servodata_axis1_torque = servodata_axis1_torque;
    }

    public Double getServodata_axis1_space() {
        return servodata_axis1_space;
    }

    public void setServodata_axis1_space(Double servodata_axis1_space) {
        this.servodata_axis1_space = servodata_axis1_space;
    }

    public Double getServodata_axis2_torque() {
        return servodata_axis2_torque;
    }

    public void setServodata_axis2_torque(Double servodata_axis2_torque) {
        this.servodata_axis2_torque = servodata_axis2_torque;
    }

    public Double getServodata_axis2_space() {
        return servodata_axis2_space;
    }

    public void setServodata_axis2_space(Double servodata_axis2_space) {
        this.servodata_axis2_space = servodata_axis2_space;
    }

    public Double getServodata_axis3_torque() {
        return servodata_axis3_torque;
    }

    public void setServodata_axis3_torque(Double servodata_axis3_torque) {
        this.servodata_axis3_torque = servodata_axis3_torque;
    }

    public Double getServodata_axis3_space() {
        return servodata_axis3_space;
    }

    public void setServodata_axis3_space(Double servodata_axis3_space) {
        this.servodata_axis3_space = servodata_axis3_space;
    }

    public Double getServodata_axis4_torque() {
        return servodata_axis4_torque;
    }

    public void setServodata_axis4_torque(Double servodata_axis4_torque) {
        this.servodata_axis4_torque = servodata_axis4_torque;
    }

    public Double getServodata_axis4_space() {
        return servodata_axis4_space;
    }

    public void setServodata_axis4_space(Double servodata_axis4_space) {
        this.servodata_axis4_space = servodata_axis4_space;
    }

    public Double getServodata_axis5_torque() {
        return servodata_axis5_torque;
    }

    public void setServodata_axis5_torque(Double servodata_axis5_torque) {
        this.servodata_axis5_torque = servodata_axis5_torque;
    }

    public Double getServodata_axis5_space() {
        return servodata_axis5_space;
    }

    public void setServodata_axis5_space(Double servodata_axis5_space) {
        this.servodata_axis5_space = servodata_axis5_space;
    }

    public Double getServodata_axis6_torque() {
        return servodata_axis6_torque;
    }

    public void setServodata_axis6_torque(Double servodata_axis6_torque) {
        this.servodata_axis6_torque = servodata_axis6_torque;
    }

    public Double getServodata_axis6_space() {
        return servodata_axis6_space;
    }

    public void setServodata_axis6_space(Double servodata_axis6_space) {
        this.servodata_axis6_space = servodata_axis6_space;
    }

    public Double getServodata_axis7_torque() {
        return servodata_axis7_torque;
    }

    public void setServodata_axis7_torque(Double servodata_axis7_torque) {
        this.servodata_axis7_torque = servodata_axis7_torque;
    }

    public Double getServodata_axis7_space() {
        return servodata_axis7_space;
    }

    public void setServodata_axis7_space(Double servodata_axis7_space) {
        this.servodata_axis7_space = servodata_axis7_space;
    }

    public Double getServodata_axis8_torque() {
        return servodata_axis8_torque;
    }

    public void setServodata_axis8_torque(Double servodata_axis8_torque) {
        this.servodata_axis8_torque = servodata_axis8_torque;
    }

    public Double getServodata_axis8_space() {
        return servodata_axis8_space;
    }

    public void setServodata_axis8_space(Double servodata_axis8_space) {
        this.servodata_axis8_space = servodata_axis8_space;
    }

    public Integer getServoData_axis1_address() {
        return servoData_axis1_address;
    }

    public void setServoData_axis1_address(Integer servoData_axis1_address) {
        this.servoData_axis1_address = servoData_axis1_address;
    }

    public Double getServoData_axis1_data() {
        return servoData_axis1_data;
    }

    public void setServoData_axis1_data(Double servoData_axis1_data) {
        this.servoData_axis1_data = servoData_axis1_data;
    }

    public Integer getServoData_axis2_address() {
        return servoData_axis2_address;
    }

    public void setServoData_axis2_address(Integer servoData_axis2_address) {
        this.servoData_axis2_address = servoData_axis2_address;
    }

    public Double getServoData_axis2_data() {
        return servoData_axis2_data;
    }

    public void setServoData_axis2_data(Double servoData_axis2_data) {
        this.servoData_axis2_data = servoData_axis2_data;
    }

    public Integer getServoData_axis3_address() {
        return servoData_axis3_address;
    }

    public void setServoData_axis3_address(Integer servoData_axis3_address) {
        this.servoData_axis3_address = servoData_axis3_address;
    }

    public Double getServoData_axis3_data() {
        return servoData_axis3_data;
    }

    public void setServoData_axis3_data(Double servoData_axis3_data) {
        this.servoData_axis3_data = servoData_axis3_data;
    }

    public Integer getServoData_axis4_address() {
        return servoData_axis4_address;
    }

    public void setServoData_axis4_address(Integer servoData_axis4_address) {
        this.servoData_axis4_address = servoData_axis4_address;
    }

    public Double getServoData_axis4_data() {
        return servoData_axis4_data;
    }

    public void setServoData_axis4_data(Double servoData_axis4_data) {
        this.servoData_axis4_data = servoData_axis4_data;
    }

    public Integer getServoData_axis5_address() {
        return servoData_axis5_address;
    }

    public void setServoData_axis5_address(Integer servoData_axis5_address) {
        this.servoData_axis5_address = servoData_axis5_address;
    }

    public Double getServoData_axis5_data() {
        return servoData_axis5_data;
    }

    public void setServoData_axis5_data(Double servoData_axis5_data) {
        this.servoData_axis5_data = servoData_axis5_data;
    }

    public Integer getServoData_axis6_address() {
        return servoData_axis6_address;
    }

    public void setServoData_axis6_address(Integer servoData_axis6_address) {
        this.servoData_axis6_address = servoData_axis6_address;
    }

    public Double getServoData_axis6_data() {
        return servoData_axis6_data;
    }

    public void setServoData_axis6_data(Double servoData_axis6_data) {
        this.servoData_axis6_data = servoData_axis6_data;
    }

    public Integer getServoData_axis7_address() {
        return servoData_axis7_address;
    }

    public void setServoData_axis7_address(Integer servoData_axis7_address) {
        this.servoData_axis7_address = servoData_axis7_address;
    }

    public Double getServoData_axis7_data() {
        return servoData_axis7_data;
    }

    public void setServoData_axis7_data(Double servoData_axis7_data) {
        this.servoData_axis7_data = servoData_axis7_data;
    }

    public Integer getServoData_axis8_address() {
        return servoData_axis8_address;
    }

    public void setServoData_axis8_address(Integer servoData_axis8_address) {
        this.servoData_axis8_address = servoData_axis8_address;
    }

    public Double getServoData_axis8_data() {
        return servoData_axis8_data;
    }

    public void setServoData_axis8_data(Double servoData_axis8_data) {
        this.servoData_axis8_data = servoData_axis8_data;
    }

    public String getServoData_token() {
        return servoData_token;
    }

    public void setServoData_token(String servoData_token) {
        this.servoData_token = servoData_token;
    }

    @Override
    public String toString() {
        return "SankyoServo{" +
                "servodata_savetime='" + servodata_savetime + '\'' +
                ", servodata_datetime=" + servodata_datetime +
                ", servodata_robotsn='" + servodata_robotsn + '\'' +
                ", servodata_axis1_posp=" + servodata_axis1_posp +
                ", servodata_axis1_err=" + servodata_axis1_err +
                ", servodata_axis1_velp=" + servodata_axis1_velp +
                ", servodata_axis2_posp=" + servodata_axis2_posp +
                ", servodata_axis2_err=" + servodata_axis2_err +
                ", servodata_axis2_velp=" + servodata_axis2_velp +
                ", servodata_axis3_posp=" + servodata_axis3_posp +
                ", servodata_axis3_err=" + servodata_axis3_err +
                ", servodata_axis3_velp=" + servodata_axis3_velp +
                ", servodata_axis4_posp=" + servodata_axis4_posp +
                ", servodata_axis4_err=" + servodata_axis4_err +
                ", servodata_axis4_velp=" + servodata_axis4_velp +
                ", servodata_axis5_posp=" + servodata_axis5_posp +
                ", servodata_axis5_err=" + servodata_axis5_err +
                ", servodata_axis5_velp=" + servodata_axis5_velp +
                ", servodata_axis6_posp=" + servodata_axis6_posp +
                ", servodata_axis6_err=" + servodata_axis6_err +
                ", servodata_axis6_velp=" + servodata_axis6_velp +
                ", servodata_axis7_posp=" + servodata_axis7_posp +
                ", servodata_axis7_err=" + servodata_axis7_err +
                ", servodata_axis7_velp=" + servodata_axis7_velp +
                ", servodata_axis8_posp=" + servodata_axis8_posp +
                ", servodata_axis8_err=" + servodata_axis8_err +
                ", servodata_axis8_velp=" + servodata_axis8_velp +
                ", servodata_axis1_torque=" + servodata_axis1_torque +
                ", servodata_axis1_space=" + servodata_axis1_space +
                ", servodata_axis2_torque=" + servodata_axis2_torque +
                ", servodata_axis2_space=" + servodata_axis2_space +
                ", servodata_axis3_torque=" + servodata_axis3_torque +
                ", servodata_axis3_space=" + servodata_axis3_space +
                ", servodata_axis4_torque=" + servodata_axis4_torque +
                ", servodata_axis4_space=" + servodata_axis4_space +
                ", servodata_axis5_torque=" + servodata_axis5_torque +
                ", servodata_axis5_space=" + servodata_axis5_space +
                ", servodata_axis6_torque=" + servodata_axis6_torque +
                ", servodata_axis6_space=" + servodata_axis6_space +
                ", servodata_axis7_torque=" + servodata_axis7_torque +
                ", servodata_axis7_space=" + servodata_axis7_space +
                ", servodata_axis8_torque=" + servodata_axis8_torque +
                ", servodata_axis8_space=" + servodata_axis8_space +
                ", servoData_axis1_address=" + servoData_axis1_address +
                ", servoData_axis1_data=" + servoData_axis1_data +
                ", servoData_axis2_address=" + servoData_axis2_address +
                ", servoData_axis2_data=" + servoData_axis2_data +
                ", servoData_axis3_address=" + servoData_axis3_address +
                ", servoData_axis3_data=" + servoData_axis3_data +
                ", servoData_axis4_address=" + servoData_axis4_address +
                ", servoData_axis4_data=" + servoData_axis4_data +
                ", servoData_axis5_address=" + servoData_axis5_address +
                ", servoData_axis5_data=" + servoData_axis5_data +
                ", servoData_axis6_address=" + servoData_axis6_address +
                ", servoData_axis6_data=" + servoData_axis6_data +
                ", servoData_axis7_address=" + servoData_axis7_address +
                ", servoData_axis7_data=" + servoData_axis7_data +
                ", servoData_axis8_address=" + servoData_axis8_address +
                ", servoData_axis8_data=" + servoData_axis8_data +
                ", servoData_token='" + servoData_token + '\'' +
                '}';
    }
}
