package com.xiaohao.core.service.impl;

import com.xiaohao.base.model.RandomWish;
import com.xiaohao.core.service.RandomWIshService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-2
 * Time: 上午10:21
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class RandomWishServiceImpl implements RandomWIshService {
    @Override
    public RandomWish pickAWish() {
        return null;
    }
}
