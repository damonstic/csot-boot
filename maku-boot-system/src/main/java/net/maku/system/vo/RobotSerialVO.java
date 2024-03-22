package net.maku.system.vo;

import lombok.Data;

@Data
public class RobotSerialVO {
    private Integer id;
    private String factory_end;
    private String factory_type;
    private String robotsn_type;
    private String robotsn;
    private String connection_status;
    private String upload_time;
}
