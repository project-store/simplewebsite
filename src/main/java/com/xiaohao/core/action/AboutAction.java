package com.xiaohao.core.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-3-27
 * Time: 下午6:42
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("web_front")
@Scope("prototype")
@Actions({ @Action(value = ( "/aboutAction" ), results = {
        @Result(name = "init", location = "/WEB-INF/page/about.jsp"),
        @Result(name = "tb_posordergather_list", location = "/WEB-INF/pages/tb_posordergather_list.jsp"),
        @Result(name = "list", type = "json", params = { "root", "entityListJson" }),
        @Result(name = "ajaxPromise", type = "json", params = { "root", "entityJson" }) }) })
public class AboutAction {
    private String flag;
    public String init(){
        flag="about";
        return "init";
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
