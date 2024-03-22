package net.maku.system.vo;

import lombok.Data;

@Data
public class SysWarnVO {
    private Integer id;
    private String robotsn;
    private String savetime;
    private String axis;
    private Double datavalue;
    private String truth;
    private String content;
    private String startTime;
    private String endTime;
    private Integer pageNumber; //页码
    private Integer pageSize; //每页显示数目
}
