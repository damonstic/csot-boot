package net.maku.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.sql.Timestamp;

@Table("sankyo_linetactdata")
@JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)
public class SankyoLineTact implements Serializable {
    @Column
    private String linetactdata_savetime;
    @PrimaryKeyColumn(name = "linetactdata_datetime",type = PrimaryKeyType.CLUSTERED)
    private Timestamp linetactdata_datetime;
    @PrimaryKeyColumn(name = "linetactdata_robotsn",type = PrimaryKeyType.PARTITIONED)
    private String linetactdata_robotsn;
    @Column
    private Integer linetactdata_axis1_velp;
    @Column
    private Integer linetactdata_axis2_velp;
    @Column
    private Integer linetactdata_axis3_velp;
    @Column
    private Integer linetactdata_axis4_velp;
    @Column
    private Integer linetactdata_axis5_velp;
    @Column
    private Integer linetactdata_axis6_velp;
    @Column
    private Integer linetactdata_axis7_velp;
    @Column
    private Integer linetactdata_axis8_velp;
    @Column
    private Integer linetactdata_command_code;
    @Column
    private Integer linetactdata_stage_type;
    @Column
    private Integer linetactdata_position_number;
    @Column
    private Integer linetactdata_slot_number;
    @Column
    private Integer linetactdata_hand;
    @Column
    private Integer linetactdata_itime;
    @Column
    private Integer linetactdata_axis1_address;
    @Column
    private String linetactdata_axis1_data;
    @Column
    private Integer linetactdata_axis2_address;
    @Column
    private String linetactdata_axis2_data;
    @Column
    private Integer linetactdata_axis3_address;
    @Column
    private String linetactdata_axis3_data;
    @Column
    private Integer linetactdata_axis4_address;
    @Column
    private String linetactdata_axis4_data;
    @Column
    private Integer linetactdata_axis5_address;
    @Column
    private String linetactdata_axis5_data;
    @Column
    private Integer linetactdata_axis6_address;
    @Column
    private String linetactdata_axis6_data;
    @Column
    private Integer linetactdata_axis7_address;
    @Column
    private String linetactdata_axis7_data;
    @Column
    private Integer linetactdata_axis8_address;
    @Column
    private String linetactdata_axis8_data;
    @Column
    private String linetactdata_token;

    public SankyoLineTact(String linetactdata_savetime, Timestamp linetactdata_datetime, String linetactdata_robotsn, Integer linetactdata_axis1_velp, Integer linetactdata_axis2_velp, Integer linetactdata_axis3_velp, Integer linetactdata_axis4_velp, Integer linetactdata_axis5_velp, Integer linetactdata_axis6_velp, Integer linetactdata_axis7_velp, Integer linetactdata_axis8_velp, Integer linetactdata_command_code, Integer linetactdata_stage_type, Integer linetactdata_position_number, Integer linetactdata_slot_number, Integer linetactdata_hand, Integer linetactdata_itime, Integer linetactdata_axis1_address, String linetactdata_axis1_data, Integer linetactdata_axis2_address, String linetactdata_axis2_data, Integer linetactdata_axis3_address, String linetactdata_axis3_data, Integer linetactdata_axis4_address, String linetactdata_axis4_data, Integer linetactdata_axis5_address, String linetactdata_axis5_data, Integer linetactdata_axis6_address, String linetactdata_axis6_data, Integer linetactdata_axis7_address, String linetactdata_axis7_data, Integer linetactdata_axis8_address, String linetactdata_axis8_data, String linetactdata_token) {
        this.linetactdata_savetime = linetactdata_savetime;
        this.linetactdata_datetime = linetactdata_datetime;
        this.linetactdata_robotsn = linetactdata_robotsn;
        this.linetactdata_axis1_velp = linetactdata_axis1_velp;
        this.linetactdata_axis2_velp = linetactdata_axis2_velp;
        this.linetactdata_axis3_velp = linetactdata_axis3_velp;
        this.linetactdata_axis4_velp = linetactdata_axis4_velp;
        this.linetactdata_axis5_velp = linetactdata_axis5_velp;
        this.linetactdata_axis6_velp = linetactdata_axis6_velp;
        this.linetactdata_axis7_velp = linetactdata_axis7_velp;
        this.linetactdata_axis8_velp = linetactdata_axis8_velp;
        this.linetactdata_command_code = linetactdata_command_code;
        this.linetactdata_stage_type = linetactdata_stage_type;
        this.linetactdata_position_number = linetactdata_position_number;
        this.linetactdata_slot_number = linetactdata_slot_number;
        this.linetactdata_hand = linetactdata_hand;
        this.linetactdata_itime = linetactdata_itime;
        this.linetactdata_axis1_address = linetactdata_axis1_address;
        this.linetactdata_axis1_data = linetactdata_axis1_data;
        this.linetactdata_axis2_address = linetactdata_axis2_address;
        this.linetactdata_axis2_data = linetactdata_axis2_data;
        this.linetactdata_axis3_address = linetactdata_axis3_address;
        this.linetactdata_axis3_data = linetactdata_axis3_data;
        this.linetactdata_axis4_address = linetactdata_axis4_address;
        this.linetactdata_axis4_data = linetactdata_axis4_data;
        this.linetactdata_axis5_address = linetactdata_axis5_address;
        this.linetactdata_axis5_data = linetactdata_axis5_data;
        this.linetactdata_axis6_address = linetactdata_axis6_address;
        this.linetactdata_axis6_data = linetactdata_axis6_data;
        this.linetactdata_axis7_address = linetactdata_axis7_address;
        this.linetactdata_axis7_data = linetactdata_axis7_data;
        this.linetactdata_axis8_address = linetactdata_axis8_address;
        this.linetactdata_axis8_data = linetactdata_axis8_data;
        this.linetactdata_token = linetactdata_token;
    }

    public String getLinetactdata_savetime() {
        return linetactdata_savetime;
    }

    public void setLinetactdata_savetime(String linetactdata_savetime) {
        this.linetactdata_savetime = linetactdata_savetime;
    }

    public Timestamp getLinetactdata_datetime() {
        return linetactdata_datetime;
    }

    public void setLinetactdata_datetime(Timestamp linetactdata_datetime) {
        this.linetactdata_datetime = linetactdata_datetime;
    }

    public String getLinetactdata_robotsn() {
        return linetactdata_robotsn;
    }

    public void setLinetactdata_robotsn(String linetactdata_robotsn) {
        this.linetactdata_robotsn = linetactdata_robotsn;
    }

    public Integer getLinetactdata_axis1_velp() {
        return linetactdata_axis1_velp;
    }

    public void setLinetactdata_axis1_velp(Integer linetactdata_axis1_velp) {
        this.linetactdata_axis1_velp = linetactdata_axis1_velp;
    }

    public Integer getLinetactdata_axis2_velp() {
        return linetactdata_axis2_velp;
    }

    public void setLinetactdata_axis2_velp(Integer linetactdata_axis2_velp) {
        this.linetactdata_axis2_velp = linetactdata_axis2_velp;
    }

    public Integer getLinetactdata_axis3_velp() {
        return linetactdata_axis3_velp;
    }

    public void setLinetactdata_axis3_velp(Integer linetactdata_axis3_velp) {
        this.linetactdata_axis3_velp = linetactdata_axis3_velp;
    }

    public Integer getLinetactdata_axis4_velp() {
        return linetactdata_axis4_velp;
    }

    public void setLinetactdata_axis4_velp(Integer linetactdata_axis4_velp) {
        this.linetactdata_axis4_velp = linetactdata_axis4_velp;
    }

    public Integer getLinetactdata_axis5_velp() {
        return linetactdata_axis5_velp;
    }

    public void setLinetactdata_axis5_velp(Integer linetactdata_axis5_velp) {
        this.linetactdata_axis5_velp = linetactdata_axis5_velp;
    }

    public Integer getLinetactdata_axis6_velp() {
        return linetactdata_axis6_velp;
    }

    public void setLinetactdata_axis6_velp(Integer linetactdata_axis6_velp) {
        this.linetactdata_axis6_velp = linetactdata_axis6_velp;
    }

    public Integer getLinetactdata_axis7_velp() {
        return linetactdata_axis7_velp;
    }

    public void setLinetactdata_axis7_velp(Integer linetactdata_axis7_velp) {
        this.linetactdata_axis7_velp = linetactdata_axis7_velp;
    }

    public Integer getLinetactdata_axis8_velp() {
        return linetactdata_axis8_velp;
    }

    public void setLinetactdata_axis8_velp(Integer linetactdata_axis8_velp) {
        this.linetactdata_axis8_velp = linetactdata_axis8_velp;
    }

    public Integer getLinetactdata_command_code() {
        return linetactdata_command_code;
    }

    public void setLinetactdata_command_code(Integer linetactdata_command_code) {
        this.linetactdata_command_code = linetactdata_command_code;
    }

    public Integer getLinetactdata_stage_type() {
        return linetactdata_stage_type;
    }

    public void setLinetactdata_stage_type(Integer linetactdata_stage_type) {
        this.linetactdata_stage_type = linetactdata_stage_type;
    }

    public Integer getLinetactdata_position_number() {
        return linetactdata_position_number;
    }

    public void setLinetactdata_position_number(Integer linetactdata_position_number) {
        this.linetactdata_position_number = linetactdata_position_number;
    }

    public Integer getLinetactdata_slot_number() {
        return linetactdata_slot_number;
    }

    public void setLinetactdata_slot_number(Integer linetactdata_slot_number) {
        this.linetactdata_slot_number = linetactdata_slot_number;
    }

    public Integer getLinetactdata_hand() {
        return linetactdata_hand;
    }

    public void setLinetactdata_hand(Integer linetactdata_hand) {
        this.linetactdata_hand = linetactdata_hand;
    }

    public Integer getLinetactdata_itime() {
        return linetactdata_itime;
    }

    public void setLinetactdata_itime(Integer linetactdata_itime) {
        this.linetactdata_itime = linetactdata_itime;
    }

    public Integer getLinetactdata_axis1_address() {
        return linetactdata_axis1_address;
    }

    public void setLinetactdata_axis1_address(Integer linetactdata_axis1_address) {
        this.linetactdata_axis1_address = linetactdata_axis1_address;
    }

    public String getLinetactdata_axis1_data() {
        return linetactdata_axis1_data;
    }

    public void setLinetactdata_axis1_data(String linetactdata_axis1_data) {
        this.linetactdata_axis1_data = linetactdata_axis1_data;
    }

    public Integer getLinetactdata_axis2_address() {
        return linetactdata_axis2_address;
    }

    public void setLinetactdata_axis2_address(Integer linetactdata_axis2_address) {
        this.linetactdata_axis2_address = linetactdata_axis2_address;
    }

    public String getLinetactdata_axis2_data() {
        return linetactdata_axis2_data;
    }

    public void setLinetactdata_axis2_data(String linetactdata_axis2_data) {
        this.linetactdata_axis2_data = linetactdata_axis2_data;
    }

    public Integer getLinetactdata_axis3_address() {
        return linetactdata_axis3_address;
    }

    public void setLinetactdata_axis3_address(Integer linetactdata_axis3_address) {
        this.linetactdata_axis3_address = linetactdata_axis3_address;
    }

    public String getLinetactdata_axis3_data() {
        return linetactdata_axis3_data;
    }

    public void setLinetactdata_axis3_data(String linetactdata_axis3_data) {
        this.linetactdata_axis3_data = linetactdata_axis3_data;
    }

    public Integer getLinetactdata_axis4_address() {
        return linetactdata_axis4_address;
    }

    public void setLinetactdata_axis4_address(Integer linetactdata_axis4_address) {
        this.linetactdata_axis4_address = linetactdata_axis4_address;
    }

    public String getLinetactdata_axis4_data() {
        return linetactdata_axis4_data;
    }

    public void setLinetactdata_axis4_data(String linetactdata_axis4_data) {
        this.linetactdata_axis4_data = linetactdata_axis4_data;
    }

    public Integer getLinetactdata_axis5_address() {
        return linetactdata_axis5_address;
    }

    public void setLinetactdata_axis5_address(Integer linetactdata_axis5_address) {
        this.linetactdata_axis5_address = linetactdata_axis5_address;
    }

    public String getLinetactdata_axis5_data() {
        return linetactdata_axis5_data;
    }

    public void setLinetactdata_axis5_data(String linetactdata_axis5_data) {
        this.linetactdata_axis5_data = linetactdata_axis5_data;
    }

    public Integer getLinetactdata_axis6_address() {
        return linetactdata_axis6_address;
    }

    public void setLinetactdata_axis6_address(Integer linetactdata_axis6_address) {
        this.linetactdata_axis6_address = linetactdata_axis6_address;
    }

    public String getLinetactdata_axis6_data() {
        return linetactdata_axis6_data;
    }

    public void setLinetactdata_axis6_data(String linetactdata_axis6_data) {
        this.linetactdata_axis6_data = linetactdata_axis6_data;
    }

    public Integer getLinetactdata_axis7_address() {
        return linetactdata_axis7_address;
    }

    public void setLinetactdata_axis7_address(Integer linetactdata_axis7_address) {
        this.linetactdata_axis7_address = linetactdata_axis7_address;
    }

    public String getLinetactdata_axis7_data() {
        return linetactdata_axis7_data;
    }

    public void setLinetactdata_axis7_data(String linetactdata_axis7_data) {
        this.linetactdata_axis7_data = linetactdata_axis7_data;
    }

    public Integer getLinetactdata_axis8_address() {
        return linetactdata_axis8_address;
    }

    public void setLinetactdata_axis8_address(Integer linetactdata_axis8_address) {
        this.linetactdata_axis8_address = linetactdata_axis8_address;
    }

    public String getLinetactdata_axis8_data() {
        return linetactdata_axis8_data;
    }

    public void setLinetactdata_axis8_data(String linetactdata_axis8_data) {
        this.linetactdata_axis8_data = linetactdata_axis8_data;
    }

    public String getLinetactdata_token() {
        return linetactdata_token;
    }

    public void setLinetactdata_token(String linetactdata_token) {
        this.linetactdata_token = linetactdata_token;
    }

    @Override
    public String toString() {
        return "SankyoLineTact{" +
                "linetactdata_savetime='" + linetactdata_savetime + '\'' +
                ", linetactdata_datetime=" + linetactdata_datetime +
                ", linetactdata_robotsn='" + linetactdata_robotsn + '\'' +
                ", linetactdata_axis1_velp=" + linetactdata_axis1_velp +
                ", linetactdata_axis2_velp=" + linetactdata_axis2_velp +
                ", linetactdata_axis3_velp=" + linetactdata_axis3_velp +
                ", linetactdata_axis4_velp=" + linetactdata_axis4_velp +
                ", linetactdata_axis5_velp=" + linetactdata_axis5_velp +
                ", linetactdata_axis6_velp=" + linetactdata_axis6_velp +
                ", linetactdata_axis7_velp=" + linetactdata_axis7_velp +
                ", linetactdata_axis8_velp=" + linetactdata_axis8_velp +
                ", linetactdata_command_code=" + linetactdata_command_code +
                ", linetactdata_stage_type=" + linetactdata_stage_type +
                ", linetactdata_position_number=" + linetactdata_position_number +
                ", linetactdata_slot_number=" + linetactdata_slot_number +
                ", linetactdata_hand=" + linetactdata_hand +
                ", linetactdata_itime=" + linetactdata_itime +
                ", linetactdata_axis1_address=" + linetactdata_axis1_address +
                ", linetactdata_axis1_data='" + linetactdata_axis1_data + '\'' +
                ", linetactdata_axis2_address=" + linetactdata_axis2_address +
                ", linetactdata_axis2_data='" + linetactdata_axis2_data + '\'' +
                ", linetactdata_axis3_address=" + linetactdata_axis3_address +
                ", linetactdata_axis3_data='" + linetactdata_axis3_data + '\'' +
                ", linetactdata_axis4_address=" + linetactdata_axis4_address +
                ", linetactdata_axis4_data='" + linetactdata_axis4_data + '\'' +
                ", linetactdata_axis5_address=" + linetactdata_axis5_address +
                ", linetactdata_axis5_data='" + linetactdata_axis5_data + '\'' +
                ", linetactdata_axis6_address=" + linetactdata_axis6_address +
                ", linetactdata_axis6_data='" + linetactdata_axis6_data + '\'' +
                ", linetactdata_axis7_address=" + linetactdata_axis7_address +
                ", linetactdata_axis7_data='" + linetactdata_axis7_data + '\'' +
                ", linetactdata_axis8_address=" + linetactdata_axis8_address +
                ", linetactdata_axis8_data='" + linetactdata_axis8_data + '\'' +
                ", linetactdata_token='" + linetactdata_token + '\'' +
                '}';
    }
}
