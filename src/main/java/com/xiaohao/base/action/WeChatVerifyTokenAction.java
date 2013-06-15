package com.xiaohao.base.action;
import com.xiaohao.base.util.SHA1;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.auth.AuthState;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: SuperHao
 * Date: 13-6-13
 * Time: 下午2:02
 * To change this template use File | Settings | File Templates.
 */
@Controller
@ParentPackage("web_front")
@Scope("prototype")
@Actions({ @Action(value = ( "/verifyWeChat" ), results = {
        @Result(name = "init", location = "/WEB-INF/page/about.jsp"),
        @Result(name = "list", type = "json", params = { "root", "entityListJson" }),
        @Result(name = "ajaxPromise", type = "json", params = { "root", "entityJson" }) }) })
public class WeChatVerifyTokenAction extends BaseAction {
    public String verifyToken() throws IOException {
        String requestType = ServletActionContext.getRequest().getMethod();
        if (requestType != null) {
            if ("POST".equals(requestType)) {

            } else if ("GET".equals(requestType)) {
                String echostr = httpServletRequest.getParameter("echostr");
//                String timestamp = httpServletRequest.getParameter("timestamp");
//                String nonce = httpServletRequest.getParameter("nonce");
//                String signature = httpServletRequest.getParameter("signature");
//                ArrayList<String> keys = new ArrayList<String>();
//                keys.add("1988518");
//                keys.add(nonce);
//                keys.add(timestamp);
//                Collections.sort(keys);
//                StringBuffer stringBuffer = new StringBuffer();
//
//                for (int i = 0; i < keys.size(); i++) {
//                    stringBuffer.append(keys.get(i).toString());
//                }
//                String digest = new SHA1().getDigestOfString(stringBuffer.toString().getBytes());
//                if (digest.equals(signature)) {
                    //timestamp、nonce
                    httpServletResponse.setContentType("text/html;charset=UTF-8");
                    PrintWriter pw = httpServletResponse.getWriter();
                    echostr = new String(echostr.getBytes("ISO-8859-1"),"UTF-8");
                    pw.println(echostr);
                    pw.close();



                return null;
            }
        }
        return null;
    }

}
