package com.xiaohao.core.service.impl;

import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.Event;
import com.xiaohao.base.model.EventCategory;
import com.xiaohao.core.dao.EventCategoryDAO;
import com.xiaohao.core.dao.EventDAO;
import com.xiaohao.core.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午3:08
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class EventServiceImpl implements EventService {
    @Autowired
    EventCategoryDAO eventCategoryDAO;
    @Autowired
    EventDAO eventDAO;

    @Override
    public Long addEvent(Event event) {
        return (Long)eventDAO.save(event);
    }

    @Override
    public void delEvent(Long eventId) {
        eventDAO.deleteByKey(eventId);
    }

    @Override
    public void updateEvnet(Event event) {
        eventDAO.update(event);
    }

    @Override
    public List<Event> loadAllEventByCateId(Long CategoryId) {
        return eventDAO.loadAllEventByCateId(CategoryId);
    }

    @Override
    public List<EventCategory> loadAllEvnetCategory() {
       return eventCategoryDAO.find("select t from EventCategory t order By t.orderBy asc");
    }

    @Override
    public Long addEventCate(EventCategory eventCategory) {
       return (Long) eventCategoryDAO.save(eventCategory);
    }

    @Override
    public void delEventCate(Long eventCateId) {
        eventCategoryDAO.deleteByKey(eventCateId);
        eventDAO.deleteEventByCategoryId(eventCateId);
    }

    @Override
    public void updateEventCate(EventCategory eventCategory) {
        eventCategoryDAO.update(eventCategory);
    }

    @Override
    public Page<Event> loadAllEvent() {
        return eventDAO.queryForpage("select t from Event t order by t.eventCategoryId");
    }
    public EventCategory findCategoryById(Long categoryId){
        return eventCategoryDAO.get(categoryId);
    }

    @Override
    public Event findEvent(Long eventId) {
        return eventDAO.get(eventId);
    }
}
