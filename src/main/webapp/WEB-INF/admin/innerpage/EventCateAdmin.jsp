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
<h2>恋爱史分类管理页面</h2>
<form action="loveStoryAction!addEventCategory" method="post">
<TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center
       border="1">
    <tr><td colspan="4">恋爱史分类<input type="hidden" name="eventCategory.eventCategoryId" value="${eventCategory.eventCategoryId}"/></td></tr>
    <tr>
        <td>分类名称:</td>
        <td><input type="text" name="eventCategory.eventCategoryName" value="${eventCategory.eventCategoryName}"></td>
        <td>分类顺序:</td>
        <td><input name="eventCategory.orderBy" type="text" value="${eventCategory.orderBy}"/></td>
    </tr>
    <tr><td colspan="2"><input type="submit" value="添加"/></td><td colspan="2"><input type="reset" value="清空"/></td></tr>
</TABLE>
</form>
<br/><br/>
    <TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center
           border="1">
        <tr><td colspan="5">现存事件分类</td></tr>
        <tr><td>分类编号</td><td>分类名称</td><td>创建时间</td><td>顺序</td><td>操作</td></tr>
        <c:forEach items="${eventCategoryList}" var="eventCategory" varStatus="status">
            <tr><td>${eventCategory.eventCategoryId}</td><td>${eventCategory.eventCategoryName}</td><td>${eventCategory.createDate}</td><td>${eventCategory.orderBy}</td><td><a href="loveStoryAction!delEventCategory?eventCategory.eventCategoryId=${eventCategory.eventCategoryId}">删除</a>&nbsp;&nbsp;<a href="loveStoryAction!updateCategory?eventCategory.eventCategoryId=${eventCategory.eventCategoryId}">更新</a></td></tr>
        </c:forEach>

    </TABLE>

<BR>

<BR>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
</TABLE>
</BODY>
</HTML>
