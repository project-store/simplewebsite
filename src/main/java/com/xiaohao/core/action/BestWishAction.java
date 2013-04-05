package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.BestWish;
import com.xiaohao.core.service.BestWishService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Date;

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
        @Result(name = "addBestWish", location = "/WEB-INF/page/sendWishOk.jsp"),
        @Result(name = "list", type = "json", params = { "root", "entityListJson" }),
        @Result(name = "ajaxPromise", type = "json", params = { "root", "entityJson" }) }) })
public class BestWishAction extends BaseAction {
    private String flag;
    private BestWish bestWish;
    private Page<BestWish> bestWishPage;
    @Autowired
    BestWishService bestWishService;
    public String init(){
        bestWishPage = bestWishService.loadWishesPage();
        flag="wishes";
        return "init";
    }
    public String addBestWish(){
        if(bestWish!=null){
            bestWish.setCreateDate(new Date());
            bestWish.setViewFlag(1);
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

    public Page<BestWish> getBestWishPage() {
        return bestWishPage;
    }

    public void setBestWishPage(Page<BestWish> bestWishPage) {
        this.bestWishPage = bestWishPage;
    }
}
