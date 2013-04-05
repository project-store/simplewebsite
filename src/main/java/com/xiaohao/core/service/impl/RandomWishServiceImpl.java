package com.xiaohao.core.service.impl;

import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.RandomWish;
import com.xiaohao.core.dao.RandomWishDAO;
import com.xiaohao.core.service.RandomWIshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Hashtable;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-2
 * Time: 上午10:21
 * To change this template use File | Settings | File Templates.
 */
@Service("RandomWishServiceImpl")
@Transactional
public class RandomWishServiceImpl implements RandomWIshService {
    @Autowired
    RandomWishDAO randomWishDAO;
    @Override
    public RandomWish pickAWish(List<Long> randomIdList,Hashtable<Long,RandomWish> randomWishMap) {
        if(randomIdList!=null&&randomWishMap!=null){
            int count = randomIdList.size();
            Random random = new Random();
            int index =random.nextInt(count);
            return randomWishMap.get(randomIdList.get(index));
        }

        //取得一个随机的祝福
        return null;
    }

    @Override
    public Long addRandomWish(RandomWish randomWish) {
        return (Long)randomWishDAO.save(randomWish);
    }

    @Override
    public Page<RandomWish> listRandomWishPage() {
        return randomWishDAO.queryForpage("select t from RandomWish t order by t.randomWishId desc");
    }

    @Override
    public void updateRandomWish(RandomWish randomWish) {
        randomWishDAO.update(randomWish);
    }

    @Override
    public List loadRandomWishAll() {
        return randomWishDAO.loadAll();
    }

    @Override
    public void deleteRandomWish(RandomWish randomWish) {
        randomWishDAO.delete(randomWish);
    }

    @Override
    public RandomWish loadRandomWishById(Long wishId) {
        return  randomWishDAO.get(wishId);
    }
}
