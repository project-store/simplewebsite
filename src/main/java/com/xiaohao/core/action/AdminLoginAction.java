package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-28
 * Time: 下午12:46
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("web_admin")
@Scope("prototype")
@Actions({@Action(value = ("/adminLoginAction"), results = {
        @Result(name = "init", location = "/WEB-INF/admin/admin.jsp"),
        @Result(name = "login", location = "/WEB-INF/pages/admin/login.jsp"),
        @Result(name = "list", type = "json", params = {"root", "entityListJson"}),
        @Result(name = "ajaxPromise", type = "json", params = {"root", "entityJson"})})})
public class AdminLoginAction extends BaseAction {
    private String adminName;
    private String adminPassword;

    public String init() {
        return "init";
    }

    public String login() {
        return "login";
    }
    //后台登陆操作
    public String adminLogin() {

        return "admin";
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
