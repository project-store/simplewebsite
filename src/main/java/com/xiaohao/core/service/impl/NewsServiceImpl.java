package com.xiaohao.core.service.impl;

import com.xiaohao.base.dao.Page;
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

    @Override
    public Page<News> listAllNews() {
        String hql = "select t from News t";
        return newsDAO.queryForpage(hql);
    }

    @Override
    public void delNews(Long newsId) {
        newsDAO.deleteByKey(newsId);
    }

    @Override
    public News loadNewsById(Long newsId) {
        return newsDAO.get(newsId);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateNews(News news) {
       newsDAO.update(news);
    }
}
