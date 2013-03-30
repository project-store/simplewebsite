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
    public String init(){
        return "init";
    }
    public String loadAdminIndexContent(){
        return "indexContent";
    }
}
