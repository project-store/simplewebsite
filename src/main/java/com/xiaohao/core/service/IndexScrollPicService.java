package com.xiaohao.core.service;

import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.IndexScrollPic;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-4-4
 * Time: 下午5:33
 * To change this template use File | Settings | File Templates.
 */
public interface IndexScrollPicService {
    public List<IndexScrollPic> loadAllIndexPic();
    public Page<IndexScrollPic> listIndexPicPage();
    public IndexScrollPic loadIndexPicById(Long id);
    public void deleteIndexPicById(Long id);
    public void updateIndexPic(IndexScrollPic indexScrollPic);
    public Long addIndexPic(IndexScrollPic indexScrollPic);
}
