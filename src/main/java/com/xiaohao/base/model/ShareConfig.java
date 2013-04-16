package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-16
 * Time: 下午1:28
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "shareConfig")
public class ShareConfig extends BaseModel {
    private Long configId;
    private String url;
    private String title;
    private String summary;
    private String picUrl;

    @Id
    @Column(name="configId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name = "summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }



    @Column(name = "picUrl")
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
