package com.xiaohao.base.util;

import com.xiaohao.base.model.User;
import com.xiaohao.core.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 */
public class BootStrap {
    @Autowired
    private UserDao userDao;
    @PostConstruct
    public void init(){
        User u =new User();
        u.setUserName("xiaohao");
        userDao.save(u);
        System.out.println(userDao.get(1L));
    }
}
