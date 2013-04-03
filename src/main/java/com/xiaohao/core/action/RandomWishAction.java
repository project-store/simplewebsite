package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.base.model.RandomWish;
import com.xiaohao.core.service.RandomWIshService;
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
 * Date: 13-4-2
 * Time: 上午10:01
 *生成随即祝福页面 将会包含在其他页面中
 */
@Controller
@ParentPackage("web_front")
@Scope("prototype")
@Actions({@Action(value = ("/randomWishAction"), results = {
        @Result(name = "init", location = "/WEB-INF/page/randomWish.jsp"),
        @Result(name = "initAdd", location = "/WEB-INF/admin/innerpage/RandomWishAdmin.jsp"),
        @Result(name = "list", location = "/WEB-INF/admin/innerpage/randomWishList.jsp")})})
public class RandomWishAction extends BaseAction {
    @Autowired
    RandomWIshService randomWIshService;
    private RandomWish randomWish;
    @Override
    public String execute() throws Exception {
        return "init";
    }
    public String initAdd(){
        return "initAdd";
    }
    public String list(){
        return "list";
    }

    public RandomWish getRandomWish() {
        return randomWish;
    }

    public void setRandomWish(RandomWish randomWish) {
        this.randomWish = randomWish;
    }
}
