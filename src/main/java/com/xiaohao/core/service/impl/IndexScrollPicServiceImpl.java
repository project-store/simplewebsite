package com.xiaohao.core.service.impl;

import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.IndexScrollPic;
import com.xiaohao.core.dao.IndexScrollPicDAO;
import com.xiaohao.core.service.IndexScrollPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-4-4
 * Time: 下午5:33
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class IndexScrollPicServiceImpl implements IndexScrollPicService {
    @Autowired
    IndexScrollPicDAO indexScrollPicDAO;

    @Override
    public List<IndexScrollPic> loadAllIndexPic() {
        return indexScrollPicDAO.find("select t from IndexScrollPic t order by t.orderBy asc");
    }

    @Override
    public Page<IndexScrollPic> listIndexPicPage() {
       return indexScrollPicDAO.queryForpage("select t from IndexScrollPic t order by t.picId desc");
    }

    @Override
    public IndexScrollPic loadIndexPicById(Long indexPicId) {
       return indexScrollPicDAO.get(indexPicId);
    }

    @Override
    public void deleteIndexPicById(Long id) {
        indexScrollPicDAO.deleteByKey(id);
    }

    @Override
    public void updateIndexPic(IndexScrollPic indexScrollPic) {
        indexScrollPicDAO.update(indexScrollPic);
    }

    @Override
    public Long addIndexPic(IndexScrollPic indexScrollPic) {
        return (Long) indexScrollPicDAO.save(indexScrollPic);
    }
}
