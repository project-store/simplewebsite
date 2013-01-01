package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * User: xiqohao
 * Date: 13-1-1
 * Time: 下午2:05
 */
@Entity
@Table(name="friendlink")
public class FriendLink extends BaseModel {
    private Long linkId;
    private String linkUrl;
    private String linkTitle;
    private Integer linkSort;
    private String imgUrl;
    @Id
    @Column(name="linkId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    @Column(name="linkUrl")
    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
    @Column(name="linkTitle")
    public String getLinkTitle() {
        return linkTitle;
    }

    public void setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
    }
    @Column(name="linkSort")
    public Integer getLinkSort() {
        return linkSort;
    }

    public void setLinkSort(Integer linkSort) {
        this.linkSort = linkSort;
    }
    @Column(name="imgUrl")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
