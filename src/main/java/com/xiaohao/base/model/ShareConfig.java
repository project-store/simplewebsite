package com.xiaohao.base.model;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-16
 * Time: 下午1:28
 * To change this template use File | Settings | File Templates.
 */
public class ShareConfig extends BaseModel {
    private Long configId;
    private String url;
    private String title;
    private String summry;
    private String picUrl;

    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummry() {
        return summry;
    }

    public void setSummry(String summry) {
        this.summry = summry;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
