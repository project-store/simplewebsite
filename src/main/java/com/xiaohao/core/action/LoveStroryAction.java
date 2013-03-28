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
 * Date: 13-3-27
 * Time: 下午4:01
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("web_front")
@Scope("prototype")
@Actions({ @Action(value = ( "/loveStoryAction" ), results = {
        @Result(name = "init", location = "/WEB-INF/page/lovestory.jsp"),
        @Result(name = "tb_posordergather_list", location = "/WEB-INF/pages/tb_posordergather_list.jsp"),
        @Result(name = "list", type = "json", params = { "root", "entityListJson" }),
        @Result(name = "ajaxPromise", type = "json", params = { "root", "entityJson" }) }) })
public class LoveStroryAction extends BaseAction {
    public String init(){
        return "init";
    }
}
