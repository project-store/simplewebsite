<%--
  Created by IntelliJ IDEA.
  User: SuperHao
  Date: 13-3-27
  Time: 下午6:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/taglibs.jsp"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<div id="header">
    <div class="logo"><a href="#"><img src="images/name.png" alt="" /></a></div>
    <!--end logo-->
    <div class="subtitle"><img src="images/subtitle.png" alt="" /></div>
    <!--end subtitle-->
    <div id="nav">
        <ul id="nav-pages">
            <li><a href="index.jsp" <c:if test="${flag eq 'index'}">class="current"</c:if>>首页</a><span>~</span></li>
            <li><a href="aboutAction!init" <c:if test="${flag eq 'about'}">class="current"</c:if>>关于</a><span>~</span></li>
            <li><a href="loveStoryAction!init" <c:if test="${flag eq 'loveStory'}">class="current"</c:if>>恋爱史</a><span>~</span></li>
            <li><a href="newsAction!init" <c:if test="${flag eq 'news'}">class="current"</c:if>>结婚动态</a><span>~</span></li>
            <li><a href="bestWishAction!init" <c:if test="${flag eq 'wishes'}">class="current"</c:if>>祝福</a><span>~</span></li>
            <li><a href="sendMyWishAction!init" <c:if test="${flag eq 'sendWish'}">class="current"</c:if>>送祝福</a></li>
        </ul>
        <!--end nav-pages-->
    </div>
    <!--end nav-->
</div>
<!--end header-->