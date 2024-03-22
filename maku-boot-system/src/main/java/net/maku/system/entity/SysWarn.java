package net.maku.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigInteger;

@Data
@TableName("sys_warn")
public class SysWarn {
    @TableId(type = IdType.AUTO)
    private BigInteger id;
    @TableField("robotsn")
    private String robotsn;
    @TableField("savetime")
    private String savetime;
    @TableField("axis")
    private String axis;
    @TableField("datavalue")
    private Double datavalue;
    @TableField("truth")
    private String truth;
    @TableField("content")
    private  String content;

    public SysWarn(BigInteger id, String robotsn, String savetime, String axis, Double datavalue, String truth, String content) {
        this.id = id;
        this.robotsn = robotsn;
        this.savetime = savetime;
        this.axis = axis;
        this.datavalue = datavalue;
        this.truth = truth;
        this.content = content;
    }

    public SysWarn() {

    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getRobotsn() {
        return robotsn;
    }

    public void setRobotsn(String robotsn) {
        this.robotsn = robotsn;
    }

    public String getSavetime() {
        return savetime;
    }

    public void setSavetime(String savetime) {
        this.savetime = savetime;
    }

    public String getAxis() {
        return axis;
    }

    public void setAxis(String axis) {
        this.axis = axis;
    }

    public Double getDatavalue() {
        return datavalue;
    }

    public void setDatavalue(Double datavalue) {
        this.datavalue = datavalue;
    }

    public String getTruth() {
        return truth;
    }

    public void setTruth(String truth) {
        this.truth = truth;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "SysWarn{" +
                "id=" + id +
                ", robotsn='" + robotsn + '\'' +
                ", savetime='" + savetime + '\'' +
                ", axis='" + axis + '\'' +
                ", datavalue=" + datavalue +
                ", truth='" + truth + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
