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
        <h2 class="title"><a href="#">8 Tips For Shooting Water Droplets</a></h2>
        <p class="meta">Jennifer Patterson ~ 14th March 2011</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit.<a href="#" class="more-link">Read The Full Article &raquo;</a></p>
      </div>
      <!--end post-->
      <div class="line"></div>
       <!--迭代显示news-->
        <!---此处做一个分页导航----->
      <a href="#">&laquo; Previous Posts</a></div>
    <!--end content-->
      <!--旁边随即显示朋友祝福见证-->
      <div id="sidebar">
      <div class="author-photo"><img src="images/author-img.jpg" alt="" /></div>
      <!--end author-photo-->
      <div id="author-details">
        <h3><span class="status">Status: </span>Taking On New Clients</h3>
        <p>I am currently available for work in covering portrait photography, photos of products for marketing purposes, weddings and other special events, and fashion and beauty.</p>
        <p>I am willing to travel to meet with you to discuss your requirements. Please get in touch with me and we can arrange a suitable time to meet up.</p>
        <p>My specialties are wedding photography, flowers, and portrait photography. I have been working predominantly in these areas for over 10 years now and have lots of happy clients.</p>
      </div>

      <!--end author-details-->
    </div>
    <!--end sidebar-->
  </div>
  <!--end main-->
    <jsp:include page="common/footer.jsp"></jsp:include>
  <!--end footer-->
</div>
<!--end wrap-->
</body>
</html>