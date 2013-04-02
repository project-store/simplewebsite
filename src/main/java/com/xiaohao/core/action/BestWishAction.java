package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.base.model.BestWish;
import com.xiaohao.core.service.BestWishService;
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
 * Date: 13-3-27
 * Time: 下午3:59
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("web_front")
@Scope("prototype")
@Actions({ @Action(value = ( "/bestWishAction" ), results = {
        @Result(name = "init", location = "/WEB-INF/page/wishes.jsp"),
        @Result(name = "tb_posordergather_list", location = "/WEB-INF/pages/tb_posordergather_list.jsp"),
        @Result(name = "list", type = "json", params = { "root", "entityListJson" }),
        @Result(name = "ajaxPromise", type = "json", params = { "root", "entityJson" }) }) })
public class BestWishAction extends BaseAction {
    private String flag;
    private BestWish bestWish;
    @Autowired
    BestWishService bestWishService;
    public String init(){
        flag="wishes";
        return "init";
    }
    public String addBestWish(){
        if(bestWish!=null){
            bestWishService.addBestWish(bestWish);
        }
        flag="wishes";
        return "addBestWish";
    }
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public BestWish getBestWish() {
        return bestWish;
    }

    public void setBestWish(BestWish bestWish) {
        this.bestWish = bestWish;
    }
}
