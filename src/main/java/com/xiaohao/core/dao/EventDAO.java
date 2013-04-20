package com.xiaohao.core.dao;

import com.xiaohao.base.dao.GenericDAO;
import com.xiaohao.base.model.Event;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午3:05
 * To change this template use File | Settings | File Templates.
 */
public interface EventDAO extends GenericDAO<Event,Long> {
    public List<Event> loadAllEventByCateId(Long cateId);
    public void deleteEventByCategoryId(Long categoryId);
}
