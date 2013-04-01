package com.xiaohao.core.service.impl;

import com.xiaohao.base.model.News;
import com.xiaohao.core.dao.NewsDAO;
import com.xiaohao.core.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午3:08
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsDAO newsDAO;
    @Override
    public Long addNews(News news) {
       return (Long)newsDAO.save(news);
    }
}
