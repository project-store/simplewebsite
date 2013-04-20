package com.xiaohao.core.service;

import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.Event;
import com.xiaohao.base.model.EventCategory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午3:04
 * To change this template use File | Settings | File Templates.
 */
public interface EventService {
    public Long addEvent(Event event);
    public void delEvent(Long eventId);
    public void updateEvnet(Event event);
    public List<Event> loadAllEventByCateId(Long CategoryId);
    public Event findEvent(Long eventId);


    public List<EventCategory>  loadAllEvnetCategory();
    public Long addEventCate(EventCategory eventCategory);
    public void delEventCate(Long eventCateId);
    public void updateEventCate(EventCategory eventCategory);
    public Page<Event> loadAllEvent();
    public EventCategory findCategoryById(Long categoryId);
}
