<%@include file="../common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD><TITLE>事件添加</TITLE>
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
    <form action="loveStoryAction!addEvent" method="post">
    <TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center
           border="1">
        <tr><td colspan="10">添加事件<input value="${event.eventId}" type="" name="event.eventId"></td></tr>
        <tr>
            <td>事件名称</td><td><input type="text" value="${event.eventTitle}" name="event.eventTitle"/></td>
            <td>事件分类</td>
                <td><select name="event.eventCategoryId">
                    <c:forEach var="eventCategory" items="${eventCategoryList}" varStatus="status">
                    <option <c:if test="${eventCategory.eventCategoryId eq event.eventCategoryId}">selected="true"</c:if> value="${eventCategory.eventCategoryId}">${eventCategory.eventCategoryName}</option>
                    </c:forEach>
                </select></td>

            <td>事件日期</td><td><input type="text" value="${event.eventDate}" name="event.eventDate"/></td>
            <td>重要标志</td>
            <td>
                <select name="event.importantFlag"><option <c:if test="${event.importantFlag eq 0}">selected="true" </c:if> value="0">否</option><option <c:if test="${event.importantFlag eq 1}">selected="true"</c:if> value="1">是</option></select>
            </td>
            <td>顺序</td><td><input type="text" name="event.orderBy" value="${event.orderBy}"/></td>
        </tr>
        <tr>
            <td colspan="2">事件内容</td><td colspan="8"><textarea rows="10" cols="60" name="event.eventContent">${event.eventContent}</textarea></td>
        </tr>
        <tr><td colspan="5"><input type="submit" value="提交"></td><td colspan="5"><input type="reset" value="清空"></td></tr>
    </TABLE>
    </form>
<BR>

<BR>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
</TABLE>
</BODY>
</HTML>
