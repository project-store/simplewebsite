package com.xiaohao.core.service;

import com.xiaohao.base.model.AdminUser;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-3-30
 * Time: 下午5:46
 * To change this template use File | Settings | File Templates.
 */
public interface AdminUserService {
    public List loadAdminUser();

    public void addAdminUser(AdminUser adminUser);
    public AdminUser loginAdmin(String userName,String password);
}
