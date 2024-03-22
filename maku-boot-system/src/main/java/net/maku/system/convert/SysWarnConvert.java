package net.maku.system.convert;

import net.maku.system.entity.SysWarn;
import net.maku.system.vo.SysWarnVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SysWarnConvert {
    SysWarnConvert INSTANCE = Mappers.getMapper(SysWarnConvert.class);
    SysWarn convert(SysWarnVO vo);
    SysWarnVO convert(SysWarn entity);
    List<SysWarnVO> convertList(List<SysWarn> list);
}
