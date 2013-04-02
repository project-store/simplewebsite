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
 * Date: 13-4-2
 * Time: 上午10:01
 *生成随即祝福页面 将会包含在其他页面中
 */
@Controller
@ParentPackage("web_front")
@Scope("prototype")
@Actions({@Action(value = ("/randomWishAction"), results = {
        @Result(name = "init", location = "/WEB-INF/page/randomWish.jsp")})})
public class RandomWishAction extends BaseAction {
    @Override
    public String execute() throws Exception {
        return "init";
    }
}
