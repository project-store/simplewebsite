package com.xiaohao.base.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午1:14
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="eventCategory")
public class EventCategory extends BaseModel {
    private Long eventCategoryId;
    private String eventCategoryName;
    private Date createDate;
    private Integer orderBy;
    @Transient
    private List<Event> eventList;
    @Id
    @Column(name="eventCategoryId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getEventCategoryId() {
        return eventCategoryId;
    }

    public void setEventCategoryId(Long eventCategoryId) {
        this.eventCategoryId = eventCategoryId;
    }
    @Column(name="eventCategoryName")
    public String getEventCategoryName() {
        return eventCategoryName;
    }

    public void setEventCategoryName(String eventCategoryName) {
        this.eventCategoryName = eventCategoryName;
    }
    @Column(name="createDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    @Column(name="orderBy")
    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }
    @Transient
    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
