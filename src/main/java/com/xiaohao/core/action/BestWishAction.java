package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.BestWish;
import com.xiaohao.base.model.ShareConfig;
import com.xiaohao.core.service.BestWishService;
import com.xiaohao.core.service.ShareConfigService;
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
        @Result(name = "initAdmin", location = "/WEB-INF/admin/innerpage/bestWishAdmin.jsp"),
        @Result(name = "list", type = "json", params = { "root", "entityListJson" }),
        @Result(name = "ajaxPromise", type = "json", params = { "root", "entityJson" }) }) })
public class BestWishAction extends BaseAction {
    private String flag;
    private BestWish bestWish;
    private Page<BestWish> bestWishPage;
    private ShareConfig shareConfig;
    @Autowired
    BestWishService bestWishService;
    @Autowired
    ShareConfigService shareConfigService;
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
        shareConfig = shareConfigService.loadShareConfig();
        String summary =shareConfig.getSummary()+"   "+bestWish.getWishContent();
        shareConfig.setSummary(summary);
        flag="sendWish";
        return "addBestWish";
    }
    public String initAdmin(){
        bestWishPage =bestWishService.loadWishAllPage();
        return "initAdmin";
    }
    public String delBestWish(){
        if(bestWish!=null&&bestWish.getWishId()!=null){
            bestWishService.deleteBestWish(bestWish.getWishId());
        }
        bestWishPage = bestWishService.loadWishAllPage();
        return "initAdmin";
    }
    public String changeBestWishFlag(){
         if(bestWish!=null&&bestWish.getWishId()!=null){
             bestWish =bestWishService.loadBestWishById(bestWish.getWishId());
             if(bestWish!=null){
                 if(1==bestWish.getViewFlag()){
                     bestWish.setViewFlag(0);
                     bestWishService.updateBestWish(bestWish);
                 }else if(0==bestWish.getViewFlag()){
                     bestWish.setViewFlag(1);
                     bestWishService.updateBestWish(bestWish);
                 }
             }
         }
        bestWishPage =bestWishService.loadWishAllPage();
        return "initAdmin";
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

    public ShareConfig getShareConfig() {
        return shareConfig;
    }

    public void setShareConfig(ShareConfig shareConfig) {
        this.shareConfig = shareConfig;
    }
}
