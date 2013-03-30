package com.xiaohao.core.dao;

import com.xiaohao.base.dao.GenericDAO;
import com.xiaohao.base.model.AdminModel;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-3-30
 * Time: 下午7:42
 * To change this template use File | Settings | File Templates.
 */
public interface AdminModelDAO extends GenericDAO<AdminModel,Long> {
    public List listAdminModels();
}
