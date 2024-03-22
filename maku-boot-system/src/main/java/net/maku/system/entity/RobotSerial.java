package net.maku.system.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

@Table("robotserial")
@JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS)
public class RobotSerial implements Serializable {
    @PrimaryKey
    private Integer id;
    @Column
    private String factory_end;
    @Column
    private String factory_type;
    @Column
    private String robotsn_type;
    @Column
    private String robotsn;
    @Column
    private String connection_status;
    @Column
    private String upload_time;

    public RobotSerial(Integer id, String factory_end, String factory_type, String robotsn_type, String robotsn, String connection_status, String upload_time) {
        this.id = id;
        this.factory_end = factory_end;
        this.factory_type = factory_type;
        this.robotsn_type = robotsn_type;
        this.robotsn = robotsn;
        this.connection_status = connection_status;
        this.upload_time = upload_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFactory_end() {
        return factory_end;
    }

    public void setFactory_end(String factory_end) {
        this.factory_end = factory_end;
    }

    public String getFactory_type() {
        return factory_type;
    }

    public void setFactory_type(String factory_type) {
        this.factory_type = factory_type;
    }

    public String getRobotsn_type() {
        return robotsn_type;
    }

    public void setRobotsn_type(String robotsn_type) {
        this.robotsn_type = robotsn_type;
    }

    public String getRobotsn() {
        return robotsn;
    }

    public void setRobotsn(String robotsn) {
        this.robotsn = robotsn;
    }

    public String getConnection_status() {
        return connection_status;
    }

    public void setConnection_status(String connection_status) {
        this.connection_status = connection_status;
    }

    public String getUpload_time() {
        return upload_time;
    }

    public void setUpload_time(String upload_time) {
        this.upload_time = upload_time;
    }

    @Override
    public String toString() {
        return "RobotSerial{" +
                "id=" + id +
                ", factory_end='" + factory_end + '\'' +
                ", factory_type='" + factory_type + '\'' +
                ", robotsn_type='" + robotsn_type + '\'' +
                ", robotsn='" + robotsn + '\'' +
                ", connection_status='" + connection_status + '\'' +
                ", upload_time='" + upload_time + '\'' +
                '}';
    }
}
