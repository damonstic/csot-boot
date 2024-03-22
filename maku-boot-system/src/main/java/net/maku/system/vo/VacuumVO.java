package net.maku.system.vo;

import lombok.Data;

@Data
public class VacuumVO {
    private String robotsn;
    private String factory_end;
    private String factory_type;
    private String robotsn_type;
    private Double upper_max;
    private Double upper_min;
    private Double lower_max;
    private Double lower_min;
}
