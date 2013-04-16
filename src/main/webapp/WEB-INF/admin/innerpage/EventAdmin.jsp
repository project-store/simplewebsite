<%@include file="../common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD><TITLE>祝福管理</TITLE>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <LINK
            href="../../../css/Admin.css" rel=stylesheet>
    <SCRIPT language=javascript src="syscome.files/Admin.js"></SCRIPT>

    <STYLE type=text/css>.STYLE1 {
        FONT-WEIGHT: bold;
        COLOR: #0099ff
    }
    </STYLE>

    <META content="MSHTML 6.00.2900.5726" name=GENERATOR>
</HEAD>
<BODY><BR>
<h2>事件模块</h2>

    <TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center
           border="1">
        <tr><td colspan="6">现存事件</td></tr>
        <tr><td>事件编号</td><td>事件名称</td><td>事件分类</td><td>事件内容</td><td>事件日期</td><td>创建日期</td><td>重要标志</td><td>操作</td></tr>
        <c:forEach items="${eventPage.items}" var="event" varStatus="status">
            <tr><td>${event.eventId}</td><td>${event.newsTitle}</td><td>${event.eventCategory}</td><td>${event.eventContent}</td><td>${event.eventDate}</td><td>${event.createDate}</td><td><a href="newsAction!delNews?news.newsId=${news.newsId}">删除</a>&nbsp;&nbsp;<a href="newsAction!updateNews?news.newsId=${news.newsId}">更新</a></td></tr>
        </c:forEach>
    </TABLE>

<BR>

<BR>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
</TABLE>
</BODY>
</HTML>
