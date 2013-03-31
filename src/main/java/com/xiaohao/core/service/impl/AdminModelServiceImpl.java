package com.xiaohao.core.service.impl;

import com.xiaohao.base.model.AdminModel;
import com.xiaohao.core.dao.AdminModelDAO;
import com.xiaohao.core.service.AdminModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-3-30
 * Time: 下午7:45
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class AdminModelServiceImpl implements AdminModelService {
    @Autowired
    AdminModelDAO adminModelDAO;
    @Override
    public Long addAdminModel(AdminModel adminModel) {
        return (Long)adminModelDAO.save(adminModel);
    }

    @Override
    public void delAdminModel(Long modelId) {
        adminModelDAO.deleteByKey(modelId);
    }

    @Override
    public void updateAdminModel(AdminModel adminModel) {
        adminModelDAO.update(adminModel);
    }

    @Override
    public List listAdminModel() {
        return adminModelDAO.listAdminModels();
    }

    @Override
    public AdminModel loadAdminModelById(Long modelId) {
        return adminModelDAO.get(modelId);
    }
}
