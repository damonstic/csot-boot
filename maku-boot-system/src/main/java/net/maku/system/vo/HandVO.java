package net.maku.system.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class HandVO {
    private String robotsn;
    private String factory_end;
    private String factory_type;
    private String robotsn_type;

    private Double zpos_start_max;
    private Double zpos_start_min;
    private Double zpos1_on_max;
    private Double zpos1_on_min;
    private Double zpos1_diff_max;
    private Double zpos1_diff_min;
    private Double zpos2_on_max;
    private Double zpos2_on_min;
    private Double zpos2_diff_max;
    private Double zpos2_diff_min;
}
