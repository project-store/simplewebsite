<%@include file="common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>小郝和小丽结婚啦~O(∩_∩)O哈哈~ | 祝福</title>
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
      <div class="article">
        <h2 class="title"><a href="#">A Guide On Mastering Slow Shutter Speeds</a></h2>
        <p class="meta">Jennifer Patterson ~ 14th April 2011</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit.<a href="#" class="more-link">Read The Full Article &raquo;</a></p>
      </div>
      <!--end post-->
      <div class="line"></div>
      <div class="article">
        <h2 class="title"><a href="#">How To Take Stunning Interior Photos</a></h2>
        <p class="meta">Jennifer Patterson ~ 7th Aril 2011</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit.<a href="#" class="more-link">Read The Full Article &raquo;</a></p>
      </div>
      <!--end post-->
      <div class="line"></div>
      <div class="article">
        <h2 class="title"><a href="#">Top Tips For Taking Portrait Photos</a></h2>
        <p class="meta">Jennifer Patterson ~ 28th March 2011</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit.<a href="#" class="more-link">Read The Full Article &raquo;</a></p>
      </div>
      <!--end post-->
      <div class="line"></div>
      <div class="article">
        <h2 class="title"><a href="#">How To Take Great Wildlife Photos</a></h2>
        <p class="meta">Jennifer Patterson ~ 21st March 2011</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit.<a href="#" class="more-link">Read The Full Article &raquo;</a></p>
      </div>
      <!--end post-->
      <div class="line"></div>
      <div class="article">
        <h2 class="title"><a href="#">8 Tips For Shooting Water Droplets</a></h2>
        <p class="meta">Jennifer Patterson ~ 14th March 2011</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit.<a href="#" class="more-link">Read The Full Article &raquo;</a></p>
      </div>
      <!--end post-->
      <div class="line"></div>
      <a href="#">&laquo; Previous Posts</a></div>
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