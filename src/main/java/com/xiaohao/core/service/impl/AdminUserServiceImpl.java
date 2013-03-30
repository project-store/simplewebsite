package com.xiaohao.core.service.impl;

import com.xiaohao.base.model.AdminUser;
import com.xiaohao.core.dao.AdminUserDAO;
import com.xiaohao.core.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-3-30
 * Time: 下午5:46
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    AdminUserDAO adminUserDAO;
    @Override
    public List loadAdminUser() {
        return adminUserDAO.loadAll();
    }

    @Override
    public void addAdminUser(AdminUser adminUser) {
        adminUserDAO.save(adminUser);
    }

    @Override
    public AdminUser loginAdmin(String userName, String password) {
        return adminUserDAO.getAdminUserByUserNameAndPassword(userName,password);
    }
}
