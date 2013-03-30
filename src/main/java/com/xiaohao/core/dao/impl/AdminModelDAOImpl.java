package com.xiaohao.core.dao.impl;

import com.xiaohao.base.dao.impl.GenericDAOHibernateImpl;
import com.xiaohao.base.model.AdminModel;
import com.xiaohao.core.dao.AdminModelDAO;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-3-30
 * Time: 下午7:43
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class AdminModelDAOImpl extends GenericDAOHibernateImpl<AdminModel,Long> implements AdminModelDAO {
    @Override
    public List listAdminModels() {
        Criteria criteria = this.createCriteria();
        criteria.add(Restrictions.eq("useFlag", 1)).addOrder(Order.asc("orderBy"));
        return criteria.list();
    }
}
