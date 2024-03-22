package net.maku.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.AllArgsConstructor;
import net.maku.framework.mybatis.service.impl.BaseServiceImpl;
import net.maku.system.dao.MailDao;
import net.maku.system.entity.Email;
import net.maku.system.service.MailService;
import net.maku.system.vo.MailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MailServiceImpl extends BaseServiceImpl<MailDao, Email> implements MailService {
    @Autowired
    private MailDao mailDao;
    @Override
    public List<Email> selectAll() {
        return mailDao.selectAll();
    }

    @Override
    public void addMail(MailVO mailVO) {
        String email = mailVO.getEmail();
        Email email1 = new Email();
        email1.setEmail(email);
        mailDao.insert(email1);
    }

    @Override
    public void updataMail(MailVO mailVO) {
        Integer id = mailVO.getId();
        String email = mailVO.getEmail();
        QueryWrapper<Email> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        Email email1 = new Email();
        email1.setEmail(email);
        mailDao.update(email1,queryWrapper);
    }

    @Override
    public void deleteMail(MailVO mailVO) {
        Integer id = mailVO.getId();
        QueryWrapper<Email> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        mailDao.delete(queryWrapper);
    }
}
