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
 * Time: 下午7:52
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("web_admin")
@Scope("prototype")
@Actions({@Action(value = ("/adminModelAction"), results = {
        @Result(name = "init", location = "/WEB-INF/admin/innerpage/adminModel.jsp")})})
public class AdminModelAction extends BaseAction {
    private AdminModel adminModel;
    private List<AdminModel> adminModelList;
    @Autowired
    AdminModelService adminModelService;
    public String init(){
        adminModelList = adminModelService.listAdminModel();
        return "init";
    }
    public String addModel(){
        if(adminModel.getModelId()==null||"".equals(adminModel.getModelId())){
            adminModelService.addAdminModel(adminModel);

        }else {
            adminModelService.updateAdminModel(adminModel);
        }

        adminModelList = adminModelService.listAdminModel();
        adminModel=null;
        return "init";
    }
    public String delModel(){
        adminModelService.delAdminModel(adminModel.getModelId());
        adminModelList = adminModelService.listAdminModel();
        return "init";
    }
    public String updateModel(){
        if(adminModel.getModelId()!=null&&!"".equals(adminModel.getModelId())){
            adminModel = adminModelService.loadAdminModelById(adminModel.getModelId());
        }
        adminModelList = adminModelService.listAdminModel();
        return "init";
    }

    public AdminModel getAdminModel() {
        return adminModel;
    }

    public void setAdminModel(AdminModel adminModel) {
        this.adminModel = adminModel;
    }

    public List<AdminModel> getAdminModelList() {
        return adminModelList;
    }

    public void setAdminModelList(List<AdminModel> adminModelList) {
        this.adminModelList = adminModelList;
    }
}
