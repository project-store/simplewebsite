package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.base.model.ShareConfig;
import com.xiaohao.core.service.ShareConfigService;
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
 * Date: 13-4-17
 * Time: 下午5:48
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("web_front")
@Scope("prototype")
@Actions({ @Action(value = ( "/shareConfigAction" ), results = {
        @Result(name = "initAdmin", location = "/WEB-INF/admin/innerpage/shareConfigAdmin.jsp"),
        @Result(name = "ajaxPromise", type = "json", params = { "root", "entityJson" }) }) })
public class ShareConfigAction extends BaseAction {
    @Autowired
    ShareConfigService shareConfigService;

    private ShareConfig shareConfig;

    public String saveOrUpdateConfig(){
        if(shareConfig!=null){
            if(shareConfig.getConfigId()!=null&&!"".equals(shareConfig.getConfigId())){
                shareConfigService.updateShareConfig(shareConfig);
            }else{
                shareConfigService.addShareConfig(shareConfig);
            }

        }
        shareConfig = shareConfigService.loadShareConfig();
        return "initAdmin";
    }

    public ShareConfig getShareConfig() {
        return shareConfig;
    }

    public void setShareConfig(ShareConfig shareConfig) {
        this.shareConfig = shareConfig;
    }
}
