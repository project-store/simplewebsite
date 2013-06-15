package com.xiaohao.base.action;

/**
 * Created with IntelliJ IDEA.
 * User: xiqohao
 * Date: 13-6-15
 * Time: 下午3:47
 * To change this template use File | Settings | File Templates.
 */
public class WeChatReplyTextMessage {
    private String ToUserName;
    private String FromUserName;
    private String CreateTime;
    private String messageType;
    private String Content;
    private String FuncFlag;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getFuncFlag() {
        return FuncFlag;
    }

    public void setFuncFlag(String funcFlag) {
        FuncFlag = funcFlag;
    }
}
