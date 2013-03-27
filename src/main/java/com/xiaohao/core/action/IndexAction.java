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
 * Date: 13-3-26
 * Time: 下午6:04
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("web_front")
@Scope("prototype")
@Actions({ @Action(value = ( "/indexAction" ), results = {
        @Result(name = "index", location = "/WEB-INF/page/index.jsp"),
        @Result(name = "tb_posordergather_list", location = "/WEB-INF/pages/tb_posordergather_list.jsp"),
        @Result(name = "list", type = "json", params = { "root", "entityListJson" }),
        @Result(name = "ajaxPromise", type = "json", params = { "root", "entityJson" }) }) })
public class IndexAction extends BaseAction {
    public String index(){

        return "index";
    }
}
