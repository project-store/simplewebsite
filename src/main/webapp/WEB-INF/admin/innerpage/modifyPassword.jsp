<%@include file="../common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD><TITLE>修改密码</TITLE>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <LINK
            href="../../../css/Admin.css" rel=stylesheet>

    <STYLE type=text/css>.STYLE1 {
        FONT-WEIGHT: bold;
        COLOR: #0099ff
    }
    </STYLE>

    <META content="MSHTML 6.00.2900.5726" name=GENERATOR>
</HEAD>
<BODY><BR>
<h2>修改管理员密码</h2>
<form action="adminLoginAction!updatePassWord" method="post">
<TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center
       border="1">
    <tr><td colspan="4">修改密码<input type="hidden" name="adminUser.userId" value="${adminUser.userId}"/></td></tr>
    <tr><td>用户名:</td><td><input type="text" name="adminUser.loginName" value=""></td><td>密码:</td><td><input name="adminUser.password" type="text" value=""/></td></tr>
    <tr><td colspan="2"><input type="submit" value="更新"/></td><td colspan="2"><input type="reset" value="清空"/></td></tr>
</TABLE>
</form>
<BR>

</BODY>
</HTML>
