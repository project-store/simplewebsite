package com.xiaohao.base.util;

import com.xiaohao.base.model.AdminUser;
import com.xiaohao.base.model.RandomWish;
import com.xiaohao.core.dao.UserDao;
import com.xiaohao.core.service.AdminUserService;
import com.xiaohao.core.service.RandomWIshService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 */
public class BootStrap {
    @Autowired
    private UserDao userDao;
    @Autowired
    private AdminUserService adminUserService;
    @Autowired
    private RandomWIshService randomWIshService;//初始化随即显示的list
    @PostConstruct
    public void init(){
        //初始化管理员配置
        List adminUsers = adminUserService.loadAdminUser();
       if(adminUsers!=null&&adminUsers.size()>0){
           return;
       }else {
           AdminUser adminUser = new AdminUser();
           adminUser.setLoginName("xiaohao");
           adminUser.setPassword("xiaohao");
           adminUser.setUserName("superhao");
           adminUserService.addAdminUser(adminUser);
       }
       List<RandomWish> randomWishList = randomWIshService.loadRandomWishAll();

    }
}
