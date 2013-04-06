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
<h2>祝福列表展示模块</h2>

    <TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center
           border="1">
        <tr><td colspan="8">现存祝福</td></tr>
        <tr><td width="15">编号</td><td width="100">发送人</td><td width="120">电话</td><td>email</td><td width="400">祝福</td><td width="135">创建时间</td><td width="80">是否可见</td><td width="100">操作</td></tr>
        <c:forEach items="${bestWishPage.items}" var="wish" varStatus="status">
            <tr>
                <td>${wish.wishId}</td>
                <td>${wish.sendUserName}</td>
                <td>${wish.mobile}</td>
                <td>${wish.email}</td>
                <td>${wish.wishContent}</td>
                <td>${wish.createDate}</td>
                <td><c:if test="${wish.viewFlag eq 1}">可见</c:if><c:if test="${wish.viewFlag eq 0}">隐藏</c:if> </td>
                <td>
                    <a href="bestWishAction!delBestWish?bestWish.wishId=${wish.wishId}">
                        删除
                    </a>&nbsp;&nbsp;
                    <a href="bestWishAction!changeBestWishFlag?bestWish.wishId=${wish.wishId}">
                        <c:if test="${wish.viewFlag eq 1}">隐藏</c:if><c:if test="${wish.viewFlag eq 0}">显示</c:if>
                    </a>
                </td>
            </tr>
        </c:forEach>
        <tr> <td colspan="8" align="center">
<pg:pager url="bestWishAction!initAdmin"
          items="${bestWishPage.total}" maxPageItems="10" maxIndexPages="5"
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
