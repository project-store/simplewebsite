package com.xiaohao.core.dao.impl;

import com.xiaohao.base.dao.impl.GenericDAOHibernateImpl;
import com.xiaohao.base.model.Event;
import com.xiaohao.core.dao.EventDAO;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午3:07
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class EventDAOImpl extends GenericDAOHibernateImpl<Event,Long> implements EventDAO {
    @Override
    public List<Event> loadAllEventByCateId(Long cateId) {
        Criteria criteria = this.createCriteria();
        criteria.add(Restrictions.eq("eventCategoryId",cateId));
        criteria.addOrder(Order.desc("createDate"));
        return criteria.list();
    }
}
