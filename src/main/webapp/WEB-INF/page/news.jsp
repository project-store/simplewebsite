<%@include file="common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>小郝和小丽结婚啦~O(∩_∩)O哈哈~ | 结婚动态</title>
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" href="styles/style.css" />
<script type="text/javascript" src="../../js/jquery-1.3.2.js"></script>
<!--[if IE 6]>
    <script src="../../js/ie6-transparency.js"></script>
    <script>DD_belatedPNG.fix('#header .logo img, .subtitle img, .slideshow-container, .navigation-container #thumbs .thumbs li .thumb img, .navigation a.next, .footer-line, #sidebar .author-photo, .line, .commentlist .comment-reply-link, #contact-page #contact .submit');</script>
    <link type="text/css" rel="stylesheet" type="text/css" href="styles/ie6.css"/>
    <![endif]-->
<!--[if IE 7]><link type="text/css" rel="stylesheet" type="text/css" href="styles/ie7.css" /><![endif]-->
</head>
<body>
<div id="wrap">
    <jsp:include page="common/header.jsp"></jsp:include>
  <!--end header-->
  <div id="main">
    <div id="content">
      <!--迭代显示news-->
      <div class="article">
          <!--标题和作者时间-->
          <h2 class="title"><a href="#">婚纱照拍摄完成</a></h2>
        <p class="meta">小郝 ~ 14th March 2011</p>
          <!--文章正文-->
          婚纱照拍摄完成，马上上传空间~
          <!--下面是文章链接-->
        <a href="#" class="more-link">Read The Full Article &raquo;</a>
      </div>
      <!--end post-->
      <div class="line"></div>
       <!--迭代显示news-->
        <!---此处做一个分页导航----->
        <span class="pageNumStyle"><a href="#" >1</a></span><span class="pageNumStyle"><a href="#">2</a></span><span class="pageNumStyle"><a href="#">3</a></span><span class="pageNumStyle"><a href="#">下一页</a></span>
    </div>

    <!--end content-->
      <s:action name="randomWishAction" ignoreContextParams="true" executeResult="true"></s:action>
    <!--end sidebar-->
  </div>
  <!--end main-->
    <jsp:include page="common/footer.jsp"></jsp:include>
  <!--end footer-->
</div>
<!--end wrap-->
</body>
</html>