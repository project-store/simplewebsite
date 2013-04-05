<%@include file="common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!--旁边随即显示朋友祝福见证-->
<div id="sidebar">
    <div class="author-photo"><img src="${randomWish.randomWishPicUrl}" alt=""  width="230px" height="230px" /></div>
    <!--end author-photo-->
    <div id="author-details">
        <h3><span class="status">${randomWish.sendWishUserName}: </span>${randomWish.wishTitle}</h3>
        <p>${randomWish.wishContent}</p>
    </div>

    <!--end author-details-->
</div>