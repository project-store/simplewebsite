package com.xiaohao.core.dao.impl;

import com.xiaohao.base.dao.impl.GenericDAOHibernateImpl;
import com.xiaohao.base.model.News;
import com.xiaohao.core.dao.NewsDAO;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午3:08
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class NewsDAOImpl extends GenericDAOHibernateImpl<News,Long> implements NewsDAO {
}
