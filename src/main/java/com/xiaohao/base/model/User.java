package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * User: xiqohao
 * Date: 12-12-8
 * Time: 下午12:56
 */
@Entity
@Table(name="user")
public class User extends BaseModel {
    private Long userId;
    private String userName;

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
