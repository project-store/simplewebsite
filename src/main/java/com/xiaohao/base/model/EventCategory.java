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
@Table(name="eventCategory")
public class EventCategory extends BaseModel {
    private Long eventCategoryId;
    private Long eventCategoryName;
    private Date createDate;
    private Integer orderBy;
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
    public Long getEventCategoryName() {
        return eventCategoryName;
    }

    public void setEventCategoryName(Long eventCategoryName) {
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
}
