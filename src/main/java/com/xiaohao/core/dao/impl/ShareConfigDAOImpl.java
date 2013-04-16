package com.xiaohao.core.dao.impl;

import com.xiaohao.base.dao.impl.GenericDAOHibernateImpl;
import com.xiaohao.base.model.ShareConfig;
import com.xiaohao.core.dao.ShareConfigDAO;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-16
 * Time: 下午2:38
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class ShareConfigDAOImpl extends GenericDAOHibernateImpl<ShareConfig,Long> implements ShareConfigDAO {
}
