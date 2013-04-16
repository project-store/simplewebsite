package com.xiaohao.core.service.impl;

import com.xiaohao.base.model.ShareConfig;
import com.xiaohao.core.dao.ShareConfigDAO;
import com.xiaohao.core.service.ShareConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-16
 * Time: 下午2:39
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class ShareConfigServiceImpl implements ShareConfigService {
     @Autowired
    ShareConfigDAO shareConfigDAO;

    @Override
    public Long addShareConfig(ShareConfig shareConfig) {
        return (Long)shareConfigDAO.save(shareConfig);
    }

    @Override
    public void updateShareConfig(ShareConfig shareConfig) {
       shareConfigDAO.update(shareConfig);
    }

    @Override
    public ShareConfig loadShareConfig() {
       List configList = shareConfigDAO.loadAll();
       if(configList!=null&&configList.size()>0){
           return (ShareConfig)configList.get(0);
       }
        return null;
    }
}
