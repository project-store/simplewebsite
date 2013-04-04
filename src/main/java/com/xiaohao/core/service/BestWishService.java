package com.xiaohao.core.service;

import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.BestWish;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午3:04
 * To change this template use File | Settings | File Templates.
 */
public interface BestWishService {
    public Long addBestWish(BestWish bestWish);
    public List loadAllWish();
    public Page loadWishesPage();
}
