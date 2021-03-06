package com.xiaohao.core.service;

import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.News;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午3:04
 * To change this template use File | Settings | File Templates.
 */
public interface NewsService {
    public Long addNews(News news);
    public Page<News> listAllNews();
    public void delNews(Long newsId);
    public News loadNewsById(Long newsId);
    public void updateNews(News news);
}
