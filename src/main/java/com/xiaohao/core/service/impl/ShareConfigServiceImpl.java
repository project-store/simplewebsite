package com.xiaohao.core.service.impl;

import com.xiaohao.core.dao.ShareConfigDAO;
import com.xiaohao.core.service.ShareConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


}
