package com.xiaohao.core.service.impl;

import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.BestWish;
import com.xiaohao.core.dao.BestWishDAO;
import com.xiaohao.core.service.BestWishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class BestWishServiceImpl implements BestWishService {
    @Autowired
    BestWishDAO bestWishDAO;

    @Override
    public Long addBestWish(BestWish bestWish) {
        return (Long)bestWishDAO.save(bestWish);
    }

    @Override
    public List loadAllWish() {
        return bestWishDAO.loadAll();
    }

    @Override
    public Page loadWishesPage() {
        LinkedHashMap hashMap =new LinkedHashMap();
        hashMap.put("wishId","desc");
        return bestWishDAO.queryForpage("select t from BestWish t where t.viewFlag =1",hashMap);
    }

    @Override
    public void deleteBestWish(Long bestId) {
        bestWishDAO.deleteByKey(bestId);
    }

    @Override
    public BestWish loadBestWishById(Long bestId) {
        return bestWishDAO.get(bestId);
    }

    @Override
    public void updateBestWish(BestWish bestWish) {
        bestWishDAO.update(bestWish);
    }

    @Override
    public Page loadWishAllPage() {
        LinkedHashMap hashMap =new LinkedHashMap();
        hashMap.put("wishId","desc");
        return bestWishDAO.queryForpage("select t from BestWish t",hashMap);
    }
}
