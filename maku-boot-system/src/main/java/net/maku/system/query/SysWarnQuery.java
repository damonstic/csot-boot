package net.maku.system.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.maku.framework.common.query.Query;
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "报错日志查询")
public class SysWarnQuery  extends Query {
    @Schema(description = "序列号")
    private String robotsn;
}
