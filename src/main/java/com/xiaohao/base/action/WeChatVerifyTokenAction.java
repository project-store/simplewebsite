package com.xiaohao.base.action;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

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
                httpServletResponse.setContentType("text/html;charset=UTF-8");
                PrintWriter pw = httpServletResponse.getWriter();
                String wxMsgXml = IOUtils.toString(httpServletRequest.getInputStream(), "utf-8");
                WeChatTextMessage textMsg = null;
                try {
                    textMsg = getWeChatTextMessage(wxMsgXml);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                StringBuffer replyMsg = new StringBuffer();
                if(textMsg != null){
                    //增加你所需要的处理逻辑，这里只是简单重复消息
                    replyMsg.append("您给我的消息是：");
                    replyMsg.append(textMsg.getContent());
                }
                else{
                    replyMsg.append("我的智商暂时看不懂非文本消息");
                }
                String returnXml = getReplyTextMessage(replyMsg.toString(), textMsg.getFromUserName());
                pw.println(returnXml);
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

    private WeChatTextMessage getWeChatTextMessage(String xml){
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("xml", WeChatTextMessage.class);
        xstream.aliasField("ToUserName", WeChatTextMessage.class, "toUserName");
        xstream.aliasField("FromUserName", WeChatTextMessage.class, "fromUserName");
        xstream.aliasField("CreateTime", WeChatTextMessage.class, "createTime");
        xstream.aliasField("MsgType", WeChatTextMessage.class, "messageType");
        xstream.aliasField("Content", WeChatTextMessage.class, "content");
        xstream.aliasField("MsgId", WeChatTextMessage.class, "msgId");
        WeChatTextMessage wechatTextMessage = (WeChatTextMessage)xstream.fromXML(xml);
        return wechatTextMessage;
    }

    private String getReplyTextMessage(String content, String weChatUser){
        WeChatReplyTextMessage we = new WeChatReplyTextMessage();
        we.setMessageType("text");
        we.setFuncFlag("0");
        we.setCreateTime(new Long(new Date().getTime()).toString());
        we.setContent(content);
        we.setToUserName(weChatUser);
        we.setFromUserName("xiaohaolxiaoli");//TODO 你的公众帐号微信号
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("xml", WeChatReplyTextMessage.class);
        xstream.aliasField("ToUserName", WeChatReplyTextMessage.class, "toUserName");
        xstream.aliasField("FromUserName", WeChatReplyTextMessage.class, "fromUserName");
        xstream.aliasField("CreateTime", WeChatReplyTextMessage.class, "createTime");
        xstream.aliasField("MsgType", WeChatReplyTextMessage.class, "messageType");
        xstream.aliasField("Content", WeChatReplyTextMessage.class, "content");
        xstream.aliasField("FuncFlag", WeChatReplyTextMessage.class, "funcFlag");
        String xml =xstream.toXML(we);
        return xml;
    }
}
