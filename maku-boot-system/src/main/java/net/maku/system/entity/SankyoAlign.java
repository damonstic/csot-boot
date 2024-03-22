package net.maku.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.sql.Timestamp;

@Table("sankyo_glassalignment")
@JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)
public class SankyoAlign implements Serializable {
    @Column
    private String glassalignment_savetime;
    @PrimaryKeyColumn(name = "glassalignment_datetime",type = PrimaryKeyType.CLUSTERED)
    private Timestamp glassalignment_datetime;
    @PrimaryKeyColumn(name = "glassalignment_robotsn",type = PrimaryKeyType.PARTITIONED)
    private String glassalignment_robotsn;
    @Column
    private Double glassalignment_axis1_r;
    @Column
    private Double glassalignment_axis2_r;
    @Column
    private Double glassalignment_axis3_r;
    @Column
    private Double glassalignment_axis4_r;
    @Column
    private Double glassalignment_axis5_r;
    @Column
    private Double glassalignment_axis6_r;
    @Column
    private Double glassalignment_axis7_r;
    @Column
    private Double glassalignment_axis8_r;

    @Column
    private Double glassalignment_axis1_x;
    @Column
    private Double glassalignment_axis2_x;
    @Column
    private Double glassalignment_axis3_x;
    @Column
    private Double glassalignment_axis4_x;
    @Column
    private Double glassalignment_axis5_x;
    @Column
    private Double glassalignment_axis6_x;
    @Column
    private Double glassalignment_axis7_x;
    @Column
    private Double glassalignment_axis8_x;

    @Column
    private Integer glassalignment_stage_type;
    @Column
    private Integer glassalignment_position_number;
    @Column
    private Integer glassalignment_slot_number;
    @Column
    private Integer glassalignment_hand;

    public SankyoAlign(String glassalignment_savetime, Timestamp glassalignment_datetime, String glassalignment_robotsn, Double glassalignment_axis1_r, Double glassalignment_axis2_r, Double glassalignment_axis3_r, Double glassalignment_axis4_r, Double glassalignment_axis5_r, Double glassalignment_axis6_r, Double glassalignment_axis7_r, Double glassalignment_axis8_r, Double glassalignment_axis1_x, Double glassalignment_axis2_x, Double glassalignment_axis3_x, Double glassalignment_axis4_x, Double glassalignment_axis5_x, Double glassalignment_axis6_x, Double glassalignment_axis7_x, Double glassalignment_axis8_x, Integer glassalignment_stage_type, Integer glassalignment_position_number, Integer glassalignment_slot_number, Integer glassalignment_hand) {
        this.glassalignment_savetime = glassalignment_savetime;
        this.glassalignment_datetime = glassalignment_datetime;
        this.glassalignment_robotsn = glassalignment_robotsn;
        this.glassalignment_axis1_r = glassalignment_axis1_r;
        this.glassalignment_axis2_r = glassalignment_axis2_r;
        this.glassalignment_axis3_r = glassalignment_axis3_r;
        this.glassalignment_axis4_r = glassalignment_axis4_r;
        this.glassalignment_axis5_r = glassalignment_axis5_r;
        this.glassalignment_axis6_r = glassalignment_axis6_r;
        this.glassalignment_axis7_r = glassalignment_axis7_r;
        this.glassalignment_axis8_r = glassalignment_axis8_r;
        this.glassalignment_axis1_x = glassalignment_axis1_x;
        this.glassalignment_axis2_x = glassalignment_axis2_x;
        this.glassalignment_axis3_x = glassalignment_axis3_x;
        this.glassalignment_axis4_x = glassalignment_axis4_x;
        this.glassalignment_axis5_x = glassalignment_axis5_x;
        this.glassalignment_axis6_x = glassalignment_axis6_x;
        this.glassalignment_axis7_x = glassalignment_axis7_x;
        this.glassalignment_axis8_x = glassalignment_axis8_x;
        this.glassalignment_stage_type = glassalignment_stage_type;
        this.glassalignment_position_number = glassalignment_position_number;
        this.glassalignment_slot_number = glassalignment_slot_number;
        this.glassalignment_hand = glassalignment_hand;
    }

    public String getGlassalignment_savetime() {
        return glassalignment_savetime;
    }

    public void setGlassalignment_savetime(String glassalignment_savetime) {
        this.glassalignment_savetime = glassalignment_savetime;
    }

    public Timestamp getGlassalignment_datetime() {
        return glassalignment_datetime;
    }

    public void setGlassalignment_datetime(Timestamp glassalignment_datetime) {
        this.glassalignment_datetime = glassalignment_datetime;
    }

    public String getGlassalignment_robotsn() {
        return glassalignment_robotsn;
    }

    public void setGlassalignment_robotsn(String glassalignment_robotsn) {
        this.glassalignment_robotsn = glassalignment_robotsn;
    }

    public Double getGlassalignment_axis1_r() {
        return glassalignment_axis1_r;
    }

    public void setGlassalignment_axis1_r(Double glassalignment_axis1_r) {
        this.glassalignment_axis1_r = glassalignment_axis1_r;
    }

    public Double getGlassalignment_axis2_r() {
        return glassalignment_axis2_r;
    }

    public void setGlassalignment_axis2_r(Double glassalignment_axis2_r) {
        this.glassalignment_axis2_r = glassalignment_axis2_r;
    }

    public Double getGlassalignment_axis3_r() {
        return glassalignment_axis3_r;
    }

    public void setGlassalignment_axis3_r(Double glassalignment_axis3_r) {
        this.glassalignment_axis3_r = glassalignment_axis3_r;
    }

    public Double getGlassalignment_axis4_r() {
        return glassalignment_axis4_r;
    }

    public void setGlassalignment_axis4_r(Double glassalignment_axis4_r) {
        this.glassalignment_axis4_r = glassalignment_axis4_r;
    }

    public Double getGlassalignment_axis5_r() {
        return glassalignment_axis5_r;
    }

    public void setGlassalignment_axis5_r(Double glassalignment_axis5_r) {
        this.glassalignment_axis5_r = glassalignment_axis5_r;
    }

    public Double getGlassalignment_axis6_r() {
        return glassalignment_axis6_r;
    }

    public void setGlassalignment_axis6_r(Double glassalignment_axis6_r) {
        this.glassalignment_axis6_r = glassalignment_axis6_r;
    }

    public Double getGlassalignment_axis7_r() {
        return glassalignment_axis7_r;
    }

    public void setGlassalignment_axis7_r(Double glassalignment_axis7_r) {
        this.glassalignment_axis7_r = glassalignment_axis7_r;
    }

    public Double getGlassalignment_axis8_r() {
        return glassalignment_axis8_r;
    }

    public void setGlassalignment_axis8_r(Double glassalignment_axis8_r) {
        this.glassalignment_axis8_r = glassalignment_axis8_r;
    }

    public Double getGlassalignment_axis1_x() {
        return glassalignment_axis1_x;
    }

    public void setGlassalignment_axis1_x(Double glassalignment_axis1_x) {
        this.glassalignment_axis1_x = glassalignment_axis1_x;
    }

    public Double getGlassalignment_axis2_x() {
        return glassalignment_axis2_x;
    }

    public void setGlassalignment_axis2_x(Double glassalignment_axis2_x) {
        this.glassalignment_axis2_x = glassalignment_axis2_x;
    }

    public Double getGlassalignment_axis3_x() {
        return glassalignment_axis3_x;
    }

    public void setGlassalignment_axis3_x(Double glassalignment_axis3_x) {
        this.glassalignment_axis3_x = glassalignment_axis3_x;
    }

    public Double getGlassalignment_axis4_x() {
        return glassalignment_axis4_x;
    }

    public void setGlassalignment_axis4_x(Double glassalignment_axis4_x) {
        this.glassalignment_axis4_x = glassalignment_axis4_x;
    }

    public Double getGlassalignment_axis5_x() {
        return glassalignment_axis5_x;
    }

    public void setGlassalignment_axis5_x(Double glassalignment_axis5_x) {
        this.glassalignment_axis5_x = glassalignment_axis5_x;
    }

    public Double getGlassalignment_axis6_x() {
        return glassalignment_axis6_x;
    }

    public void setGlassalignment_axis6_x(Double glassalignment_axis6_x) {
        this.glassalignment_axis6_x = glassalignment_axis6_x;
    }

    public Double getGlassalignment_axis7_x() {
        return glassalignment_axis7_x;
    }

    public void setGlassalignment_axis7_x(Double glassalignment_axis7_x) {
        this.glassalignment_axis7_x = glassalignment_axis7_x;
    }

    public Double getGlassalignment_axis8_x() {
        return glassalignment_axis8_x;
    }

    public void setGlassalignment_axis8_x(Double glassalignment_axis8_x) {
        this.glassalignment_axis8_x = glassalignment_axis8_x;
    }

    public Integer getGlassalignment_stage_type() {
        return glassalignment_stage_type;
    }

    public void setGlassalignment_stage_type(Integer glassalignment_stage_type) {
        this.glassalignment_stage_type = glassalignment_stage_type;
    }

    public Integer getGlassalignment_position_number() {
        return glassalignment_position_number;
    }

    public void setGlassalignment_position_number(Integer glassalignment_position_number) {
        this.glassalignment_position_number = glassalignment_position_number;
    }

    public Integer getGlassalignment_slot_number() {
        return glassalignment_slot_number;
    }

    public void setGlassalignment_slot_number(Integer glassalignment_slot_number) {
        this.glassalignment_slot_number = glassalignment_slot_number;
    }

    public Integer getGlassalignment_hand() {
        return glassalignment_hand;
    }

    public void setGlassalignment_hand(Integer glassalignment_hand) {
        this.glassalignment_hand = glassalignment_hand;
    }

    @Override
    public String toString() {
        return "SankyoAlign{" +
                "glassalignment_savetime='" + glassalignment_savetime + '\'' +
                ", glassalignment_datetime=" + glassalignment_datetime +
                ", glassalignment_robotsn='" + glassalignment_robotsn + '\'' +
                ", glassalignment_axis1_r=" + glassalignment_axis1_r +
                ", glassalignment_axis2_r=" + glassalignment_axis2_r +
                ", glassalignment_axis3_r=" + glassalignment_axis3_r +
                ", glassalignment_axis4_r=" + glassalignment_axis4_r +
                ", glassalignment_axis5_r=" + glassalignment_axis5_r +
                ", glassalignment_axis6_r=" + glassalignment_axis6_r +
                ", glassalignment_axis7_r=" + glassalignment_axis7_r +
                ", glassalignment_axis8_r=" + glassalignment_axis8_r +
                ", glassalignment_axis1_x=" + glassalignment_axis1_x +
                ", glassalignment_axis2_x=" + glassalignment_axis2_x +
                ", glassalignment_axis3_x=" + glassalignment_axis3_x +
                ", glassalignment_axis4_x=" + glassalignment_axis4_x +
                ", glassalignment_axis5_x=" + glassalignment_axis5_x +
                ", glassalignment_axis6_x=" + glassalignment_axis6_x +
                ", glassalignment_axis7_x=" + glassalignment_axis7_x +
                ", glassalignment_axis8_x=" + glassalignment_axis8_x +
                ", glassalignment_stage_type=" + glassalignment_stage_type +
                ", glassalignment_position_number=" + glassalignment_position_number +
                ", glassalignment_slot_number=" + glassalignment_slot_number +
                ", glassalignment_hand=" + glassalignment_hand +
                '}';
    }
}
