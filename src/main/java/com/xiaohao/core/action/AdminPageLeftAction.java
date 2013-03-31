package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.base.model.AdminModel;
import com.xiaohao.core.service.AdminModelService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-3-30
 * Time: 下午7:07
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("web_admin")
@Scope("prototype")
@Actions({@Action(value = ("/adminPageLeftAction"), results = {
        @Result(name = "init", location = "/WEB-INF/admin/innerpage/left.jsp"),
        @Result(name = "indexContent", location = "/WEB-INF/admin/innerpage/adminContent.jsp")})})
public class AdminPageLeftAction extends BaseAction{
    @Autowired
    AdminModelService adminModelService;
    private List<AdminModel> adminModelList;
    public String init(){
        adminModelList = adminModelService.listAdminModel();
        return "init";
    }
    public String loadAdminIndexContent(){
        return "indexContent";
    }

    public List<AdminModel> getAdminModelList() {
        return adminModelList;
    }

    public void setAdminModelList(List<AdminModel> adminModelList) {
        this.adminModelList = adminModelList;
    }
}
