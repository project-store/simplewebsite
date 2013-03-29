package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-29
 * Time: 下午1:13
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="bestWish")
public class BestWish extends BaseModel {
    private Long wishId;
    private String sendUserName;
    private String email;
    private String mobile;
    private String title;
    private String wishContent;
    @Id
    @Column(name="wishId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getWishId() {
        return wishId;
    }

    public void setWishId(Long wishId) {
        this.wishId = wishId;
    }
    @Column(name="sendUserName")
    public String getSendUserName() {
        return sendUserName;
    }

    public void setSendUserName(String sendUserName) {
        this.sendUserName = sendUserName;
    }
    @Column(name="email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name="mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name="wishContent")
    public String getWishContent() {
        return wishContent;
    }

    public void setWishContent(String wishContent) {
        this.wishContent = wishContent;
    }
}
