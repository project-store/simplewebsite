<%@include file="../common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD><TITLE>随即祝福管理</TITLE>
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
<h2>随即祝福管理</h2>
<BR>
<TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center
       border="1">
    <tr><td colspan="7">现存随即祝福</td></tr>
    <tr><td>编号</td><td>祝福人</td><td>照片url:</td><td>照片</td><td>标题</td><td>内容</td><td>操作</td></tr>
    <c:forEach items="${adminModelList}" var="model" varStatus="status">
        <tr><td>${model.modelId}</td><td>${model.modelName}</td><td>${model.modelUrl}</td><td><c:if test="${model.useFlag eq 1}">是</c:if><c:if test="${model.useFlag eq 0}">否</c:if></td><td>${model.orderBy}</td><td><a href="adminModelAction!delModel?adminModel.modelId=${model.modelId}">删除</a>&nbsp;&nbsp;<a href="adminModelAction!updateModel?adminModel.modelId=${model.modelId}">更新</a></td></tr>
    </c:forEach>
</TABLE>
<BR>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
</TABLE>
</BODY>
</HTML>
