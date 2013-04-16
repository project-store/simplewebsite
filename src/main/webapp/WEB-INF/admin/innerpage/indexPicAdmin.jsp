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
<form action="indexAction!addOrUpdateIndexPic" method="post">
<TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center
       border="1">
    <tr><td colspan="8">添加首页图片<input type="hidden" name="indexScrollPic.picId" value="${indexScrollPic.picId}"/></td></tr>
    <tr>
        <td>图片名称:</td>
        <td><input type="text" name="indexScrollPic.picName" value="${indexScrollPic.picName}"></td>
        <td>大图url:</td>
        <td><input name="indexScrollPic.bicPicUrl" type="text" value="${indexScrollPic.bicPicUrl}"/></td>
        <td>小图url:</td>
        <td><input name="indexScrollPic.smallPicUrl" type="text" value="${indexScrollPic.smallPicUrl}"/></td>
        <td>顺序:</td>
        <td><input  type="text" value="${indexScrollPic.orderBy}" name="indexScrollPic.orderBy"/></td>
    </tr>
    <tr><td>图片描述:</td><td colspan="7"><textarea rows="5" cols="60" name="indexScrollPic.picDescribe">${indexScrollPic.picDescribe}</textarea></td> </tr>
    <tr><td colspan="4"><input type="submit" value="添加"/></td><td colspan="4"><input type="reset" value="清空"/></td></tr>
</TABLE>
</form>
<BR>
<TABLE class=tableborder cellSpacing="0" cellPadding="0" width="95%" align=center
       border="1">
    <tr><td colspan="8">现存图片</td></tr>
    <tr><td width="5">编号</td>
        <td width="10">名称</td>
        <td width="30">大图url:</td>
        <td width="30">小图url</td>
        <td width="30">小图</td>
        <td width="40">描述</td>
        <td width="5">模块顺序</td>
        <td width="10">操作</td></tr>
    <c:forEach items="${indexScrollPicPage.items}" var="indexPic" varStatus="status">
        <tr>
            <td>${indexPic.picId}</td>
            <td>${indexPic.picName}</td>
            <td>${indexPic.bicPicUrl}</td>
            <td>${indexPic.smallPicUrl}</td>
            <td style="padding: 0px;line-height:1px" ><img src="${indexPic.smallPicUrl}" alt="" width="50px" height="35px" style="margin: 0px;display: block;vertical-align: bottom;border: 0px"></td>
            <td>${indexPic.picDescribe}</td>
            <td>${indexPic.orderBy}</td>


            <td><a href="indexAction!delIndexPic?indexScrollPic.picId=${indexPic.picId}">删除</a>&nbsp;&nbsp;<a href="indexAction!updateIndexPic?indexScrollPic.picId=${indexPic.picId}">更新</a></td></tr>
    </c:forEach>
    <tr> <td colspan="8" align="center">
        <pg:pager url="indexAction!indexPicAdmin"
                  items="${indexScrollPicPage.total}" maxPageItems="10" maxIndexPages="5"
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
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
</TABLE>
</BODY>
</HTML>
