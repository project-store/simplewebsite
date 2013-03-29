package com.xiaohao.core.dao.impl;

import com.xiaohao.base.dao.impl.GenericDAOHibernateImpl;
import com.xiaohao.base.model.User;
import com.xiaohao.core.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 12-12-8
 * Time: 下午1:22
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl  extends GenericDAOHibernateImpl<User,Long> implements UserDao {

}
