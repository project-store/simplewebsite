package com.xiaohao.core.action;

import com.xiaohao.base.action.BaseAction;
import com.xiaohao.tongbu.qq.QQAppInfo;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 12-12-8
 * Time: 下午4:06
 * To change this template use File | Settings | File Templates.
 */
@Controller
@Actions({ @Action(value = ( "/qqaction" ), results = { //
        @Result(name = "top", location = "/WEB-INF/pages/top.jsp"),
        @Result(name = "right", location = "/WEB-INF/pages/right.jsp"),
        @Result(name = "end", location = "/WEB-INF/pages/end.jsp"),
        @Result(name = "menu", location = "/WEB-INF/pages/menu.jsp"),
        @Result(name = "login_index", location = "/WEB-INF/pages/shop_back_user/login_index.jsp")

}) })
public class QQAction extends BaseAction {

    public String execute() throws Exception{
        if(httpSession.getAttribute("QQ")==null){
            httpServletRequest.setAttribute("client_id",QQAppInfo.appKey);
            httpServletRequest.setAttribute("response_type","code");
            httpServletRequest.setAttribute("redirect_uri",QQAppInfo.appReqUrl);
            httpServletRequest.getRequestDispatcher(QQAppInfo.firstUrl).forward(httpServletRequest,httpServletResponse);

            httpSession.setAttribute("QQ","1");


        }else if(httpSession.getAttribute("QQ")!=null&&httpSession.getAttribute("QQ").equals("1")){
            String code = (String)httpServletRequest.getAttribute("code");
            httpServletRequest.setAttribute("client_id",QQAppInfo.appKey);
            httpServletRequest.setAttribute("client_secret",QQAppInfo.appSecret);
            httpServletRequest.setAttribute("redirect_uri",QQAppInfo.appReqUrl);
            httpServletRequest.setAttribute("grant_type",code);
            httpServletRequest.setAttribute("code","CODE");
            httpServletRequest.getRequestDispatcher(QQAppInfo.secondUrl).forward(httpServletRequest,httpServletResponse);
            httpSession.setAttribute("QQ","2");


        }else if(httpSession.getAttribute("QQ")!=null&&httpSession.getAttribute("QQ").equals("2")){
            String code = (String)httpServletRequest.getAttribute(" access_token");
            System.out.println(code);
        }
        return null;
    }

}
