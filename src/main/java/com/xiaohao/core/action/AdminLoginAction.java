package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.base.model.AdminUser;
import com.xiaohao.core.service.AdminUserService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
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
        @Result(name = "admin", location = "/WEB-INF/admin/admin.jsp"),
        @Result(name = "login", location = "/WEB-INF/admin/login.jsp"),
        @Result(name = "init", location = "/WEB-INF/admin/login.jsp"),
        @Result(name = "updatePassword",location = "/WEB-INF/admin/innerpage/modifyPassword.jsp"),
        @Result(name = "list", type = "json", params = {"root", "entityListJson"}),
        @Result(name = "ajaxPromise", type = "json", params = {"root", "entityJson"})})})
public class AdminLoginAction extends BaseAction {
    @Autowired
    AdminUserService adminUserService;
    private String adminName;
    private String adminPassword;
    private AdminUser adminUser;
    public String updateAdminPassWord(){
        adminUser = (AdminUser)this.httpSession.getAttribute("adminUser");
        return "updatePassword";
    }
    public String updatePassWord(){
        if(adminUser!=null&&adminUser.getUserId()!=null&&!"".equals(adminUser.getUserId())){
            AdminUser adminUserTemp =adminUserService.loadAdminUserById(adminUser.getUserId());
            adminUserTemp.setPassword(adminUser.getPassword());
            adminUserTemp.setLoginName(adminUser.getLoginName());
            adminUserService.updateAdminUser(adminUserTemp);
        }
        return "updatePassword";
    }
    public String login() {
        Object user =this.httpSession.getAttribute("adminUser");
        if(user!=null){
            return "admin";
        }
        return "login";
    }
    //后台登陆操作
    public String adminLogin() {
        if(adminName!=null&&!"".equals(adminName)&&adminPassword!=null&&!"".equals(adminPassword)){
            AdminUser adminUser = adminUserService.loginAdmin(adminName, adminPassword);
            if(adminUser==null){
                return "login";
            }else {
                this.httpSession.setAttribute("adminUser",adminUser);
            }
        }
        return "admin";
    }
    public String loginOut(){
        this.httpSession.setAttribute("adminUser",null);
        this.httpSession.invalidate();
        return "login";
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

    public AdminUser getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(AdminUser adminUser) {
        this.adminUser = adminUser;
    }
}
