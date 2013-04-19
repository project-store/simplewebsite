package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.Event;
import com.xiaohao.base.model.EventCategory;
import com.xiaohao.core.service.EventService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-27
 * Time: 下午4:01
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("web_front")
@Scope("prototype")
@Actions({ @Action(value = ( "/loveStoryAction" ), results = {
        @Result(name = "init", location = "/WEB-INF/page/lovestory.jsp"),
        @Result(name = "historyList", location = "/WEB-INF/page/historyList.jsp"),
        @Result(name = "initAdminCategory", location = "/WEB-INF/admin/innerpage/EventCateAdmin.jsp"),
        @Result(name = "initAdminEvent", location = "/WEB-INF/admin/innerpage/EventAdmin.jsp"),
        @Result(name = "addEvent", location = "/WEB-INF/admin/innerpage/addEvent.jsp"),
        @Result(name = "list", type = "json", params = { "root", "entityListJson" }),
        @Result(name = "ajaxPromise", type = "json", params = { "root", "entityJson" }) }) })
public class LoveStroryAction extends BaseAction {
    @Autowired
    EventService eventService;
    private String flag;
    private List<EventCategory> eventCategoryList;
    private EventCategory eventCategory;
    private Page<Event> eventPage;
    private Event event;
    public String init(){
        flag="loveStory";
        return "init";
    }
    //分类管理
    public String initAdminCategory(){
        eventCategoryList = eventService.loadAllEvnetCategory();
        return "initAdminCategory";
    }
    //初始化事件管理
    public String initAdminEvent(){
        eventPage =eventService.loadAllEvent();
        return "initAdminEvent";
    }
    //
    public String addEventCategory(){
        if(eventCategory!=null){
            eventCategory.setCreateDate(new Date());
        }
        eventService.addEventCate(eventCategory);
        eventCategoryList =eventService.loadAllEvnetCategory();
        return "initAdminCategory";
    }
    //
    public String delEventCategory(){
        if(eventCategory!=null&&eventCategory.getEventCategoryId()!=null){
            eventService.delEventCate(eventCategory.getEventCategoryId());
        }
        eventCategoryList =eventService.loadAllEvnetCategory();
        return "initAdminCategory";
    }
    //
    public String addEvent(){
        eventService.addEvent(event);
        event=null;
        return "addEvent";
    }
    //
    public String delEvent(){
        if(event!=null&&event.getEventId()!=null){
            eventService.delEvent(event.getEventId());
        }
        return "";
    }
    public String historyList(){

        return "historyList";
    }
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<EventCategory> getEventCategoryList() {
        return eventCategoryList;
    }

    public void setEventCategoryList(List<EventCategory> eventCategoryList) {
        this.eventCategoryList = eventCategoryList;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Page<Event> getEventPage() {
        return eventPage;
    }

    public void setEventPage(Page<Event> eventPage) {
        this.eventPage = eventPage;
    }
}
