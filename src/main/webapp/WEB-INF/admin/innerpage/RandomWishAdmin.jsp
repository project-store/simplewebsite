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
<form action="adminModelAction!addModel" method="post">
<TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center
       border="1">
    <tr><td colspan="6">随即祝福<input type="hidden" name="adminModel.modelId" value="${adminModel.modelId}"/></td></tr>
    <tr><td>祝福人:</td><td><input type="text" name="adminModel.modelName" value="${adminModel.modelName}"></td><td>祝福标题:</td><td><input name="adminModel.modelUrl" type="text" value="${adminModel.modelUrl}"/></td><td>头像Url:</td><td><input name="adminModel.orderBy" type="text" value="${adminModel.orderBy}"/></td></tr>
    <tr><td>祝福内容:</td><td colspan="5"><textarea cols="30" rows="8" type="text" name="adminModel.modelName" value="${adminModel.modelName}"></textarea></td></tr>
    <tr><td colspan="3"><input type="submit" value="添加"/></td><td colspan="3"><input type="reset" value="清空"/></td></tr>
</TABLE>
</form>
<BR>
<BR>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
</TABLE>
</BODY>
</HTML>
