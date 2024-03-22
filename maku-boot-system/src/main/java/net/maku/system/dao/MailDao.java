package net.maku.system.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.system.entity.Email;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MailDao extends BaseDao<Email> {
    List<Email> selectAll();
}