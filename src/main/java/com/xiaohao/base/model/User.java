package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 12-12-8
 * Time: 下午12:56
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="user")
public class User extends BaseModel {
    private Long userId;
    private String userName;
    private String realName;
    private String mobile;
    private String goodWish;

    @Id
    @Column(name="userId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    @Column(name="userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
