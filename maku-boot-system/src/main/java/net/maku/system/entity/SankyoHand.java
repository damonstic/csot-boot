package net.maku.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jnr.ffi.annotations.In;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.sql.Timestamp;

@Table("sankyo_handbend")
@JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)
public class SankyoHand implements Serializable {
    @Column
    private String handbend_savetime;
    @PrimaryKeyColumn(name = "handbend_datetime",type = PrimaryKeyType.CLUSTERED)
    private Timestamp handbend_datetime;
    @PrimaryKeyColumn(name = "handbend_robotsn",type = PrimaryKeyType.PARTITIONED)
    private String handbend_robotsn;
    @Column
    private Double handbend_zpos_start;
    @Column
    private Double handbend_zpos1_on;
    @Column
    private Double handbend_zpos1_diff;
    @Column
    private Double handbend_zpos2_on;
    @Column
    private Double handbend_zpos2_diff;
    @Column
    private Integer handbend_command_no;
    @Column
    private Integer handbend_stage_type;
    @Column
    private Integer handbend_position_number;
    @Column
    private Integer handbend_slot_number;
    @Column
    private Integer handbend_hand;

    public SankyoHand(String handbend_savetime, Timestamp handbend_datetime, String handbend_robotsn, Double handbend_zpos_start, Double handbend_zpos1_on, Double handbend_zpos1_diff, Double handbend_zpos2_on, Double handbend_zpos2_diff, Integer handbend_command_no, Integer handbend_stage_type, Integer handbend_position_number, Integer handbend_slot_number, Integer handbend_hand) {
        this.handbend_savetime = handbend_savetime;
        this.handbend_datetime = handbend_datetime;
        this.handbend_robotsn = handbend_robotsn;
        this.handbend_zpos_start = handbend_zpos_start;
        this.handbend_zpos1_on = handbend_zpos1_on;
        this.handbend_zpos1_diff = handbend_zpos1_diff;
        this.handbend_zpos2_on = handbend_zpos2_on;
        this.handbend_zpos2_diff = handbend_zpos2_diff;
        this.handbend_command_no = handbend_command_no;
        this.handbend_stage_type = handbend_stage_type;
        this.handbend_position_number = handbend_position_number;
        this.handbend_slot_number = handbend_slot_number;
        this.handbend_hand = handbend_hand;
    }

    public String getHandbend_savetime() {
        return handbend_savetime;
    }

    public void setHandbend_savetime(String handbend_savetime) {
        this.handbend_savetime = handbend_savetime;
    }

    public Timestamp getHandbend_datetime() {
        return handbend_datetime;
    }

    public void setHandbend_datetime(Timestamp handbend_datetime) {
        this.handbend_datetime = handbend_datetime;
    }

    public String getHandbend_robotsn() {
        return handbend_robotsn;
    }

    public void setHandbend_robotsn(String handbend_robotsn) {
        this.handbend_robotsn = handbend_robotsn;
    }

    public Double getHandbend_zpos_start() {
        return handbend_zpos_start;
    }

    public void setHandbend_zpos_start(Double handbend_zpos_start) {
        this.handbend_zpos_start = handbend_zpos_start;
    }

    public Double getHandbend_zpos1_on() {
        return handbend_zpos1_on;
    }

    public void setHandbend_zpos1_on(Double handbend_zpos1_on) {
        this.handbend_zpos1_on = handbend_zpos1_on;
    }

    public Double getHandbend_zpos1_diff() {
        return handbend_zpos1_diff;
    }

    public void setHandbend_zpos1_diff(Double handbend_zpos1_diff) {
        this.handbend_zpos1_diff = handbend_zpos1_diff;
    }

    public Double getHandbend_zpos2_on() {
        return handbend_zpos2_on;
    }

    public void setHandbend_zpos2_on(Double handbend_zpos2_on) {
        this.handbend_zpos2_on = handbend_zpos2_on;
    }

    public Double getHandbend_zpos2_diff() {
        return handbend_zpos2_diff;
    }

    public void setHandbend_zpos2_diff(Double handbend_zpos2_diff) {
        this.handbend_zpos2_diff = handbend_zpos2_diff;
    }

    public Integer getHandbend_command_no() {
        return handbend_command_no;
    }

    public void setHandbend_command_no(Integer handbend_command_no) {
        this.handbend_command_no = handbend_command_no;
    }

    public Integer getHandbend_stage_type() {
        return handbend_stage_type;
    }

    public void setHandbend_stage_type(Integer handbend_stage_type) {
        this.handbend_stage_type = handbend_stage_type;
    }

    public Integer getHandbend_position_number() {
        return handbend_position_number;
    }

    public void setHandbend_position_number(Integer handbend_position_number) {
        this.handbend_position_number = handbend_position_number;
    }

    public Integer getHandbend_slot_number() {
        return handbend_slot_number;
    }

    public void setHandbend_slot_number(Integer handbend_slot_number) {
        this.handbend_slot_number = handbend_slot_number;
    }

    public Integer getHandbend_hand() {
        return handbend_hand;
    }

    public void setHandbend_hand(Integer handbend_hand) {
        this.handbend_hand = handbend_hand;
    }

    @Override
    public String toString() {
        return "SankyoHand{" +
                "handbend_savetime='" + handbend_savetime + '\'' +
                ", handbend_datetime=" + handbend_datetime +
                ", handbend_robotsn='" + handbend_robotsn + '\'' +
                ", handbend_zpos_start=" + handbend_zpos_start +
                ", handbend_zpos1_on=" + handbend_zpos1_on +
                ", handbend_zpos1_diff=" + handbend_zpos1_diff +
                ", handbend_zpos2_on=" + handbend_zpos2_on +
                ", handbend_zpos2_diff=" + handbend_zpos2_diff +
                ", handbend_command_no=" + handbend_command_no +
                ", handbend_stage_type=" + handbend_stage_type +
                ", handbend_position_number=" + handbend_position_number +
                ", handbend_slot_number=" + handbend_slot_number +
                ", handbend_hand=" + handbend_hand +
                '}';
    }
}
