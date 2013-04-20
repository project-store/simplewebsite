package com.xiaohao.base.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午1:14
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="event")
public class Event extends BaseModel {

    private Long eventId;
    private Long eventCategoryId;
    private String eventTitle;
    private String eventContent;
    private String eventDate;
    private Date createDate;
    private Integer orderBy;
    private Integer importantFlag;
    @Transient
    private String eventCategory;
    @Id
    @Column(name="eventId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
    @Column(name="eventCategoryId")
    public Long getEventCategoryId() {
        return eventCategoryId;
    }

    public void setEventCategoryId(Long eventCategoryId) {
        this.eventCategoryId = eventCategoryId;
    }
    @Column(name="eventTitle")
    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }
    @Column(name="eventContent")
    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }
    @Column(name="eventDate")
    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }
    @Column(name="createDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    @Column(name="importantFlag")
    public Integer getImportantFlag() {
        return importantFlag;
    }

    public void setImportantFlag(Integer importantFlag) {
        this.importantFlag = importantFlag;
    }
    @Transient
    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }
    @Column(name = "orderBy")
    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }
}
