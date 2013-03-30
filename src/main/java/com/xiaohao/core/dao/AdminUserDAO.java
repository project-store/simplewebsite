package com.xiaohao.core.dao;

import com.xiaohao.base.dao.GenericDAO;
import com.xiaohao.base.model.AdminUser;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-3-30
 * Time: 下午5:47
 * To change this template use File | Settings | File Templates.
 */
public interface AdminUserDAO extends GenericDAO<AdminUser,Long> {
    public AdminUser getAdminUserByUserNameAndPassword(String userName,String password);
}
