package com.xiaohao.core.service;

import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.RandomWish;

import java.util.Hashtable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-2
 * Time: 上午10:21
 * To change this template use File | Settings | File Templates.
 */
public interface RandomWIshService {
    public RandomWish pickAWish(List<Long> randomIdList,Hashtable<Long,RandomWish> randomWishMap);
    public Long addRandomWish(RandomWish randomWish);
    public Page<RandomWish> listRandomWishPage();
    public void updateRandomWish(RandomWish randomWish);
    public List loadRandomWishAll();
    public void deleteRandomWish(RandomWish randomWish);
    public RandomWish loadRandomWishById(Long wishId);
}
