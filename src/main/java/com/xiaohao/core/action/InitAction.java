package com.xiaohao.core.action;

import com.opensymphony.xwork2.ActionSupport;
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
 * Time: 下午5:37
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("default")
@Scope("prototype")
@Actions({ @Action(value = ( "/initAction" ), results = {
        @Result(name = "index", location = "/WEB-INF/page/index.jsp") }) })
public class InitAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return "index";
    }
}
