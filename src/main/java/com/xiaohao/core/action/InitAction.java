package com.xiaohao.core.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaohao.base.model.IndexScrollPic;
import com.xiaohao.core.service.IndexScrollPicService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

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
    @Autowired
    IndexScrollPicService indexScrollPicService;
    private String flag;
    private List<IndexScrollPic> indexScrollPicList;
    @Override
    public String execute() throws Exception {
        indexScrollPicList = indexScrollPicService.loadAllIndexPic();
        flag="index";
        return "index";
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<IndexScrollPic> getIndexScrollPicList() {
        return indexScrollPicList;
    }

    public void setIndexScrollPicList(List<IndexScrollPic> indexScrollPicList) {
        this.indexScrollPicList = indexScrollPicList;
    }
}
