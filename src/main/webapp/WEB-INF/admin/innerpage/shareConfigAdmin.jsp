<%@include file="../common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD><TITLE>添加首页图片</TITLE>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <LINK
            href="../../../css/Admin.css" rel=stylesheet>
    <SCRIPT language=javascript src="syscome.files/Admin.js"></SCRIPT>

    <STYLE type=text/css>.STYLE1 {
        FONT-WEIGHT: bold;
        COLOR: #0099ff
    }
        *{
            margin: 0px;
            padding: 0px;
        }
    </STYLE>

    <META content="MSHTML 6.00.2900.5726" name=GENERATOR>
</HEAD>
<BODY>
<form action="shareConfigAction!saveOrUpdateConfig" method="post">
<TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center
       border="1">
    <tr><td colspan="8">分享配置<input type="hidden" name="indexScrollPic.picId" value="${indexScrollPic.picId}"/></td></tr>
    <tr>
        <td>配置id:</td>
        <td><input type="text" name="shareConfig.configId" value="${shareConfig.configId}"></td>
        <td>分享url:</td>
        <td><input name="shareConfig.url" type="text" value="${shareConfig.url}"/></td>
        <td>图片url:</td>
        <td><input name="shareConfig.picUrl" type="text" value="${shareConfig.picUrl}"/></td>
        <td>分享标题:</td>
        <td><input  type="text" value="${shareConfig.title}" name="shareConfig.title"/></td>
        <td>分享内容:</td>
        <td><input  type="text" value="${shareConfig.summary}" name="shareConfig.summary"/></td>
    </tr>

    <tr><td colspan="4"><input type="submit" value="添加"/></td><td colspan="4"><input type="reset" value="清空"/></td></tr>
</TABLE>
</form>
<BR>

<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
</TABLE>
</BODY>
</HTML>
