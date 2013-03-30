package com.xiaohao.core.service;

import com.xiaohao.base.model.AdminModel;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-3-30
 * Time: 下午7:44
 * To change this template use File | Settings | File Templates.
 */
public interface AdminModelService {
    public Long addAdminModel(AdminModel adminModel);
    public void delAdminModel(Long modelId);
    public void updateAdminModel(AdminModel adminModel);
    public List listAdminModel();
}
