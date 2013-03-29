package com.xiaohao.core.dao.impl;

import com.xiaohao.base.dao.impl.GenericDAOHibernateImpl;
import com.xiaohao.base.model.EventCategory;
import com.xiaohao.core.dao.EventCategoryDAO;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午3:07
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class EventCategoryDAOImpl extends GenericDAOHibernateImpl<EventCategory,Long> implements EventCategoryDAO {
}
