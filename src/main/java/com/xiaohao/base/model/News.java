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
@Table(name = "news")
public class News extends BaseModel {
    private Long newsId;
    private String newsTitle;
    private String newsContent;
    private Long addUserId;
    private Date createDate;
    private Date lastModifyDate;
    private String keyWords;
    private String shortContent;
    @Id
    @Column(name="newsId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }
    @Column(name="newsTitle")
    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }
    @Lob
    @Column(name="newsContent")
    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }



    @Column(name="addUserId")
    public Long getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Long addUserId) {
        this.addUserId = addUserId;
    }
    @Column(name="createDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    @Column(name="lastModifyDate")
    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
    @Column(name="keyWords")
    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }
    @Column(name = "shortContent")
    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }
}
