package com.xiaohao.core.dao.impl;

import com.xiaohao.base.dao.impl.GenericDAOHibernateImpl;
import com.xiaohao.base.model.RandomWish;
import com.xiaohao.core.dao.RandomWishDAO;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-2
 * Time: 上午10:03
 */
@Repository
public class RandomWishDAOImpl extends GenericDAOHibernateImpl<RandomWish,Long> implements RandomWishDAO {
}
