package com.serviceimle;

import com.entity.MailBean;
import com.entity.WebUser;
import com.mapper.WebUserMapper;
import com.service.WebUerService;
import com.util.MailUtil;
import com.util.PageBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by lvhong on 2019/2/25.
 */
@Service("webUserService")
@Transactional
public class WebUserServiceImpl implements WebUerService, BeanFactoryAware, BeanNameAware,
        DisposableBean, InitializingBean {
    @Autowired
    private WebUserMapper webUserMapper;
//    @Autowired
//    private RedisUtil redisUtil;
//    @Autowired
//    private MailUtil mailUtil;
    @Override
    public WebUser selectByPrimaryKey(Long fId) {

        return webUserMapper.selectByPrimaryKey(fId);
    }

    @Override
    public PageBean selectUserList(PageBean pageBean) {
        String key = "user";
        List<WebUser> list =  webUserMapper.selectUserList(pageBean);
        /*list = (List<WebUser>)redisUtil.get(key);*/
        if(list == null){
            WebUser webUser = new WebUser();

           /* redisUtil.set(key,list,50);*/
        }
        /*MailBean mailBean = new MailBean();
        mailBean.setSubject("恐怖分子白蜡等");
        mailBean.setRecipient("540243461@qq.com");
        mailBean.setContent("恐怖分子柏兰登已经被枪毙,你亲放心魏先生");
        mailUtil.sendHTMLMail(mailBean);*/
        pageBean.setTotal(webUserMapper.selectUserListCount(pageBean));
        pageBean.setRows(list);
        return pageBean;
    }

    @Override
    public void insrtList(List<WebUser> webUsers) {
        webUserMapper.insertForeach(webUsers);
//        int a = 1/0;
    }

    @Override
    public List<WebUser> selectUserLists() {
        return webUserMapper.selectUserLists();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory.getBean("webUserService"));
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
