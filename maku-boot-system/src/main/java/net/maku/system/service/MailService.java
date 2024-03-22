package net.maku.system.service;

import net.maku.framework.mybatis.service.BaseService;
import net.maku.system.entity.Email;
import net.maku.system.vo.MailVO;

import java.util.List;

public interface MailService extends BaseService<Email> {
    List<Email> selectAll();
    void addMail(MailVO mailVO);
    void updataMail(MailVO mailVO);
    void deleteMail(MailVO mailVO);
}
