package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.base.dao.Page;
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
        @Result(name = "indexPicAdmin", location = "/WEB-INF/admin/innerpage/indexPicAdmin.jsp"),
        @Result(name = "list", type = "json", params = { "root", "entityListJson" }),
        @Result(name = "ajaxPromise", type = "json", params = { "root", "entityJson" }) }) })
public class IndexAction extends BaseAction {
    @Autowired
    IndexScrollPicService indexScrollPicService;
    private String flag;
    private IndexScrollPic indexScrollPic;
    private Page<IndexScrollPic> indexScrollPicPage;
    private List<IndexScrollPic> indexScrollPicList;
    public String index(){
        indexScrollPicList = indexScrollPicService.loadAllIndexPic();
        flag="index";
        return "index";
    }
    public String indexPicAdmin(){
        indexScrollPicPage = indexScrollPicService.listIndexPicPage();
        return "indexPicAdmin";
    }
    public String delIndexPic(){
        if(indexScrollPic!=null&&indexScrollPic.getPicId()!=null){
            indexScrollPicService.deleteIndexPicById(indexScrollPic.getPicId());
        }
        indexScrollPicPage = indexScrollPicService.listIndexPicPage();
        return "indexPicAdmin";
    }
    public String addOrUpdateIndexPic(){
        if(indexScrollPic!=null){
            if(indexScrollPic.getPicId()!=null&&!"".equals(indexScrollPic.getPicId())){
                indexScrollPicService.updateIndexPic(indexScrollPic);
            }else{
                indexScrollPicService.addIndexPic(indexScrollPic);
            }
        }
        indexScrollPicPage = indexScrollPicService.listIndexPicPage();
        indexScrollPic =null;
        return "indexPicAdmin";
    }
    public String updateIndexPic(){
        if(indexScrollPic!=null&&indexScrollPic.getPicId()!=null){
            indexScrollPic = indexScrollPicService.loadIndexPicById(indexScrollPic.getPicId());
        }
        indexScrollPicPage = indexScrollPicService.listIndexPicPage();
        return "indexPicAdmin";
    }
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public IndexScrollPic getIndexScrollPic() {
        return indexScrollPic;
    }

    public void setIndexScrollPic(IndexScrollPic indexScrollPic) {
        this.indexScrollPic = indexScrollPic;
    }

    public Page<IndexScrollPic> getIndexScrollPicPage() {
        return indexScrollPicPage;
    }

    public void setIndexScrollPicPage(Page<IndexScrollPic> indexScrollPicPage) {
        this.indexScrollPicPage = indexScrollPicPage;
    }

    public List<IndexScrollPic> getIndexScrollPicList() {
        return indexScrollPicList;
    }

    public void setIndexScrollPicList(List<IndexScrollPic> indexScrollPicList) {
        this.indexScrollPicList = indexScrollPicList;
    }
}
