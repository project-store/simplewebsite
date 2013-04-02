package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-2
 * Time: 下午5:40
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "indexScrollPic")
public class IndexScrollPic {
    private Long picId;
    private String bicPicUrl;
    private String smallPicUrl;
    private Integer orderBy;
    private String picName;
    private String picDescribe;
    @Id
    @Column(name = "picId")
    public Long getPicId() {
        return picId;
    }

    public void setPicId(Long picId) {
        this.picId = picId;
    }
    @Column(name = "bicPicUrl")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public String getBicPicUrl() {
        return bicPicUrl;
    }

    public void setBicPicUrl(String bicPicUrl) {
        this.bicPicUrl = bicPicUrl;
    }
    @Column(name = "smallPicUrl")
    public String getSmallPicUrl() {
        return smallPicUrl;
    }

    public void setSmallPicUrl(String smallPicUrl) {
        this.smallPicUrl = smallPicUrl;
    }
    @Column(name = "orderBy")
    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }
    @Column(name = "picName")
    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }
    @Column(name = "picDescribe")
    public String getPicDescribe() {
        return picDescribe;
    }

    public void setPicDescribe(String picDescribe) {
        this.picDescribe = picDescribe;
    }
}
