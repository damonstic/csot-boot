package net.maku.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.sql.Timestamp;

@Table("sankyo_vacuumpressure")
@JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)
public class SankyoVacuum implements Serializable {
    @Column
    private String vacuumpressure_savetime;
    @PrimaryKeyColumn(name = "vacuumpressure_datetime",type = PrimaryKeyType.CLUSTERED)
    private Timestamp vacuumpressure_datetime;
    @PrimaryKeyColumn(name = "vacuumpressure_robotsn",type = PrimaryKeyType.PARTITIONED)
    private String vacuumpressure_robotsn;
    @Column
    private Integer vacuumpressure_command_no;
    @Column
    private Integer vacuumpressure_stage_type;
    @Column
    private Integer vacuumpressure_position_number;
    @Column
    private Integer vacuumpressure_slot_number;
    @Column
    private Integer vacuumpressure_hand;
    @Column
    private Integer vacuumpressure_upper_count;
    @Column
    private Double vacuumpressure_upper_data;
    @Column
    private Integer vacuumpressure_lower_count;
    @Column
    private Double vacuumpressure_lower_data;

    public SankyoVacuum(String vacuumpressure_savetime, Timestamp vacuumpressure_datetime, String vacuumpressure_robotsn, Integer vacuumpressure_command_no, Integer vacuumpressure_stage_type, Integer vacuumpressure_position_number, Integer vacuumpressure_slot_number, Integer vacuumpressure_hand, Integer vacuumpressure_upper_count, Double vacuumpressure_upper_data, Integer vacuumpressure_lower_count, Double vacuumpressure_lower_data) {
        this.vacuumpressure_savetime = vacuumpressure_savetime;
        this.vacuumpressure_datetime = vacuumpressure_datetime;
        this.vacuumpressure_robotsn = vacuumpressure_robotsn;
        this.vacuumpressure_command_no = vacuumpressure_command_no;
        this.vacuumpressure_stage_type = vacuumpressure_stage_type;
        this.vacuumpressure_position_number = vacuumpressure_position_number;
        this.vacuumpressure_slot_number = vacuumpressure_slot_number;
        this.vacuumpressure_hand = vacuumpressure_hand;
        this.vacuumpressure_upper_count = vacuumpressure_upper_count;
        this.vacuumpressure_upper_data = vacuumpressure_upper_data;
        this.vacuumpressure_lower_count = vacuumpressure_lower_count;
        this.vacuumpressure_lower_data = vacuumpressure_lower_data;
    }

    public String getVacuumpressure_savetime() {
        return vacuumpressure_savetime;
    }

    public void setVacuumpressure_savetime(String vacuumpressure_savetime) {
        this.vacuumpressure_savetime = vacuumpressure_savetime;
    }

    public Timestamp getVacuumpressure_datetime() {
        return vacuumpressure_datetime;
    }

    public void setVacuumpressure_datetime(Timestamp vacuumpressure_datetime) {
        this.vacuumpressure_datetime = vacuumpressure_datetime;
    }

    public String getVacuumpressure_robotsn() {
        return vacuumpressure_robotsn;
    }

    public void setVacuumpressure_robotsn(String vacuumpressure_robotsn) {
        this.vacuumpressure_robotsn = vacuumpressure_robotsn;
    }

    public Integer getVacuumpressure_command_no() {
        return vacuumpressure_command_no;
    }

    public void setVacuumpressure_command_no(Integer vacuumpressure_command_no) {
        this.vacuumpressure_command_no = vacuumpressure_command_no;
    }

    public Integer getVacuumpressure_stage_type() {
        return vacuumpressure_stage_type;
    }

    public void setVacuumpressure_stage_type(Integer vacuumpressure_stage_type) {
        this.vacuumpressure_stage_type = vacuumpressure_stage_type;
    }

    public Integer getVacuumpressure_position_number() {
        return vacuumpressure_position_number;
    }

    public void setVacuumpressure_position_number(Integer vacuumpressure_position_number) {
        this.vacuumpressure_position_number = vacuumpressure_position_number;
    }

    public Integer getVacuumpressure_slot_number() {
        return vacuumpressure_slot_number;
    }

    public void setVacuumpressure_slot_number(Integer vacuumpressure_slot_number) {
        this.vacuumpressure_slot_number = vacuumpressure_slot_number;
    }

    public Integer getVacuumpressure_hand() {
        return vacuumpressure_hand;
    }

    public void setVacuumpressure_hand(Integer vacuumpressure_hand) {
        this.vacuumpressure_hand = vacuumpressure_hand;
    }

    public Integer getVacuumpressure_upper_count() {
        return vacuumpressure_upper_count;
    }

    public void setVacuumpressure_upper_count(Integer vacuumpressure_upper_count) {
        this.vacuumpressure_upper_count = vacuumpressure_upper_count;
    }

    public Double getVacuumpressure_upper_data() {
        return vacuumpressure_upper_data;
    }

    public void setVacuumpressure_upper_data(Double vacuumpressure_upper_data) {
        this.vacuumpressure_upper_data = vacuumpressure_upper_data;
    }

    public Integer getVacuumpressure_lower_count() {
        return vacuumpressure_lower_count;
    }

    public void setVacuumpressure_lower_count(Integer vacuumpressure_lower_count) {
        this.vacuumpressure_lower_count = vacuumpressure_lower_count;
    }

    public Double getVacuumpressure_lower_data() {
        return vacuumpressure_lower_data;
    }

    public void setVacuumpressure_lower_data(Double vacuumpressure_lower_data) {
        this.vacuumpressure_lower_data = vacuumpressure_lower_data;
    }

    @Override
    public String toString() {
        return "SankyoVacuum{" +
                "vacuumpressure_savetime='" + vacuumpressure_savetime + '\'' +
                ", vacuumpressure_datetime=" + vacuumpressure_datetime +
                ", vacuumpressure_robotsn='" + vacuumpressure_robotsn + '\'' +
                ", vacuumpressure_command_no=" + vacuumpressure_command_no +
                ", vacuumpressure_stage_type=" + vacuumpressure_stage_type +
                ", vacuumpressure_position_number=" + vacuumpressure_position_number +
                ", vacuumpressure_slot_number=" + vacuumpressure_slot_number +
                ", vacuumpressure_hand=" + vacuumpressure_hand +
                ", vacuumpressure_upper_count=" + vacuumpressure_upper_count +
                ", vacuumpressure_upper_data=" + vacuumpressure_upper_data +
                ", vacuumpressure_lower_count=" + vacuumpressure_lower_count +
                ", vacuumpressure_lower_data=" + vacuumpressure_lower_data +
                '}';
    }
}
