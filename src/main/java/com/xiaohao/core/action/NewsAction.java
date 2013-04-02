package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.base.dao.Page;
import com.xiaohao.base.model.AdminUser;
import com.xiaohao.base.model.News;
import com.xiaohao.core.service.NewsService;
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
 * Time: 下午6:44
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("web_front")
@Scope("prototype")
@Actions({@Action(value = ("/newsAction"), results = {
        @Result(name = "init", location = "/WEB-INF/page/news.jsp"),
        @Result(name = "initAdd", location = "/WEB-INF/admin/innerpage/newsAdmin.jsp"),
        @Result(name = "addNews", location = "/WEB-INF/admin/innerpage/newsAdmin.jsp"),
        @Result(name = "listNews", location = "/WEB-INF/admin/innerpage/newsList.jsp"),
        @Result(name = "list", type = "json", params = {"root", "entityListJson"}),
        @Result(name = "ajaxPromise", type = "json", params = {"root", "entityJson"})})})
public class NewsAction extends BaseAction {
    @Autowired
    NewsService newsService;
    private String flag;
    private News news;
    private Page<News> newsList;

    public String init() {
        newsList = newsService.listAllNews();
        flag = "news";
        return "init";
    }

    public String initAdd() {
        return "initAdd";
    }

    public String addNews() {
        AdminUser adminUser = (AdminUser) this.httpSession.getAttribute("adminUser");
        if (news != null&&news.getNewsId()!=null&&!"".equals(news.getNewsId())) {
            String content =news.getNewsContent();
            news = newsService.loadNewsById(news.getNewsId());
            news.setNewsContent(content);
            news.setAddUserId(adminUser.getUserId());
            news.setLastModifyDate(new Date());
            newsService.updateNews(news);
        }else if(news!=null){

            news.setAddUserId(adminUser.getUserId());
            news.setCreateDate(new Date());
            newsService.addNews(news);
        }
        news=null;
        return "addNews";
    }

    public String listNews() {
        newsList = newsService.listAllNews();
        return "listNews";
    }

    public String delNews() {
        if (news.getNewsId() != null) {
            newsService.delNews(news.getNewsId());
        }
        newsList = newsService.listAllNews();
        return "listNews";
    }
    public String updateNews(){
        if(news!=null&&news.getNewsId()!=null){
            news =newsService.loadNewsById(news.getNewsId());
        }
        return "initAdd";
    }
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public Page<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(Page<News> newsList) {
        this.newsList = newsList;
    }
}
