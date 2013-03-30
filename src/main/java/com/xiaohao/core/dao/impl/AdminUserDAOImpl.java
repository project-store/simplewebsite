package com.xiaohao.core.dao.impl;

import com.xiaohao.base.dao.impl.GenericDAOHibernateImpl;
import com.xiaohao.base.model.AdminUser;
import com.xiaohao.core.dao.AdminUserDAO;
import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-3-30
 * Time: 下午5:47
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class AdminUserDAOImpl extends GenericDAOHibernateImpl<AdminUser,Long> implements AdminUserDAO {
    @Override
    public AdminUser getAdminUserByUserNameAndPassword(String userName, String password) {
        Criteria criteria = this.createCriteria();
        criteria.add(Expression.eq("loginName",userName)).add(Expression.eq("password",password));
        AdminUser adminUser =(AdminUser)criteria.uniqueResult();
        return adminUser;
    }
}
