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
        <tr><td colspan="9">现存事件</td></tr>
        <tr><td>事件编号</td><td>事件名称</td><td>事件分类</td><td>事件内容</td><td>事件日期</td><td>创建日期</td><td>重要标志</td><td>顺序</td><td>操作</td></tr>
        <c:forEach items="${eventPage.items}" var="event" varStatus="status">
            <tr>
                <td>${event.eventId}</td>
                <td>${event.eventTitle}</td>
                <td>${event.eventCategory}</td>
                <td>${event.eventContent}</td>
                <td>${event.eventDate}</td>
                <td>${event.createDate}</td>
                <td><c:if test="${event.importantFlag eq 0}">否</c:if><c:if test="${event.importantFlag eq 1}">是</c:if></td>
                <td>${event.orderBy}</td><td><a href="loveStoryAction!delEvent?event.eventId=${event.eventId}">删除</a>&nbsp;&nbsp;<a href="loveStoryAction!updateEvent?event.eventId=${event.eventId}">更新</a></td></tr>
        </c:forEach>
        <tr><td colspan="9">
            <pg:pager url="loveStoryAction!initAdminEvent"
                      items="${eventPage.total}" maxPageItems="10" maxIndexPages="5"
                      export="currentPageNumber=pageNumber">
                <pg:prev>
                    <a href="${pageUrl }">上一页</a>
                </pg:prev>
                <pg:pages>
                    <c:choose>
                        <c:when test="${currentPageNumber eq pageNumber }">
                            <span style="width:8px;height:8px;border: 1px solid red;padding-right: 3px">${pageNumber }</span>
                        </c:when>
                        <c:otherwise>
                            <a style="display:inline;width:8px;height:8px;border:1px solid #ffffff;padding-right: 3px" href="${pageUrl }">${pageNumber }</a>
                        </c:otherwise>
                    </c:choose>
                </pg:pages>
                <pg:next>
                    <a href="${pageUrl }">下一页</a>
                </pg:next>
                当前:${currentPageNumber}/总共:${newsList.pageCount}
            </pg:pager>
        </td></tr>
    </TABLE>

<BR>

<BR>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
</TABLE>
</BODY>
</HTML>
