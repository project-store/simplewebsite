package com.xiaohao.base.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 12-12-8
 * Time: 下午2:46
 */
@Entity
@Table(name="adminUser")
public class AdminUser extends BaseModel {
    private Long userId;
    private String userName;
    private String loginName;
    private String password;
    @Id
    @Column(name="userId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Column(name = "loginName")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    @Column(name="password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
