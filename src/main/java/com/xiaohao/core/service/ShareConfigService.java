package com.xiaohao.core.service;

import com.xiaohao.base.model.ShareConfig;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-16
 * Time: 下午2:39
 * To change this template use File | Settings | File Templates.
 */
public interface ShareConfigService {
    public Long addShareConfig(ShareConfig shareConfig);

    public void updateShareConfig(ShareConfig shareConfig);
}
