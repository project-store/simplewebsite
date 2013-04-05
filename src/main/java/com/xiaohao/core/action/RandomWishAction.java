package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.RandomWish;
import com.xiaohao.core.service.RandomWIshService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Hashtable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-4-2
 * Time: 上午10:01
 * 生成随即祝福页面 将会包含在其他页面中
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
    private Page<RandomWish> randomWishPage;

    @Override
    public String execute() throws Exception {
        List<Long> randomIdList = (List<Long>) this.servletContext.getAttribute("RandomWishIdList");
        Hashtable randomMap = (Hashtable) this.servletContext.getAttribute("RandomWishMap");
        randomWish = randomWIshService.pickAWish(randomIdList, randomMap);
        return "init";
    }

    public String initAdd() {
        return "initAdd";
    }

    public String list() {
        randomWishPage = randomWIshService.listRandomWishPage();
        return "list";
    }

    public String addRandomWish() {
        if (randomWish != null) {
            List<Long> randomIdList = (List<Long>) this.servletContext.getAttribute("RandomWishIdList");
            Hashtable randomMap = (Hashtable) this.servletContext.getAttribute("RandomWishMap");
            if (randomWish.getRandomWishId() == null || "".equals(randomWish.getRandomWishId())) {
                randomWIshService.addRandomWish(randomWish);
                //这里添加写application中list操作
                randomIdList.add(randomWish.getRandomWishId());
                randomMap.put(randomWish.getRandomWishId(), randomWish);

            } else {
                randomWIshService.updateRandomWish(randomWish);
                randomMap.put(randomWish.getRandomWishId(), randomWish);
            }

        }
        //
        randomWish = null;
        return "initAdd";
    }
    public String delRandomWish(){
        if(randomWish!=null&&randomWish.getRandomWishId()!=null){
            randomWIshService.deleteRandomWish(randomWish);
            List<Long> randomIdList = (List<Long>) this.servletContext.getAttribute("RandomWishIdList");
            Hashtable randomMap = (Hashtable) this.servletContext.getAttribute("RandomWishMap");
            randomIdList.remove(randomWish.getRandomWishId());
            randomMap.remove(randomWish.getRandomWishId());
        }
        randomWishPage = randomWIshService.listRandomWishPage();
        return   "list";
    }
    public String initUpdate(){
        if(randomWish!=null&&randomWish.getRandomWishId()!=null){
            randomWish = randomWIshService.loadRandomWishById(randomWish.getRandomWishId());
        }
        return "initAdd";
    }
    public RandomWish getRandomWish() {
        return randomWish;
    }

    public void setRandomWish(RandomWish randomWish) {
        this.randomWish = randomWish;
    }

    public Page<RandomWish> getRandomWishPage() {
        return randomWishPage;
    }

    public void setRandomWishPage(Page<RandomWish> randomWishPage) {
        this.randomWishPage = randomWishPage;
    }
}
