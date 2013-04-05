<%@include file="common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>小郝和小丽结婚啦~O(∩_∩)O哈哈~ |首页</title>
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" href="styles/galleriffic.css"/>
<link type="text/css" rel="stylesheet" href="styles/style.css" />
<script type="text/javascript" src="../../js/jquery-1.3.2.js"></script>
<script type="text/javascript" src="../../js/jquery.opacityrollover.js"></script>
<script type="text/javascript" src="../../js/jquery.galleriffic.js"></script>
<script type="text/javascript" src="../../js/gallery-settings.js"></script>
<!--[if IE 6]>
    <script src="../../js/ie6-transparency.js"></script>
    <script>DD_belatedPNG.fix('#header .logo img, .subtitle img, .slideshow-container, .navigation-container #thumbs .thumbs li .thumb img, .navigation a.next, .footer-line, #sidebar .author-photo, .line, .commentlist .comment-reply-link, #contact-page #contact .submit');</script>
    <link type="text/css" rel="stylesheet" type="text/css" href="styles/ie6.css"/>
    <![endif]-->
<!--[if IE 7]><link type="text/css" rel="stylesheet" type="text/css" href="styles/ie7.css" /><![endif]-->
<!--[if IE 8]><link type="text/css" rel="stylesheet" type="text/css" href="styles/ie8.css" /><![endif]-->
    <style>
        .slideshow-container img{
            width: 600px;
            height: 350px
        }
    </style>
</head>
<body>
<div id="wrap">
    <jsp:include page="common/header.jsp"></jsp:include>
  <!--end header-->
  <div id="frontpage-content">
    <div id="container">
      <div class="gallery-content">
        <div class="slideshow-container">
          <div id="slideshow" class="slideshow"></div>
        </div>
        <!--end slideshow-container-->
      </div>
      <!--end gallery-content-->
    </div>
    <!--end container-->
    <div class="navigation-container">
      <div id="thumbs" class="navigation"> <a class="pageLink prev" style="visibility: hidden;" href="#"></a>
        <ul class="thumbs noscript">
            <c:forEach items="${indexScrollPicList}" var="indexPic" varStatus="status">
          <li><a class="thumb" href="${indexPic.bicPicUrl}"><img src="${indexPic.smallPicUrl}" width="130px" height="75px" /></a></li>
            </c:forEach>
        </ul>
        <a class="pageLink next" style="visibility: hidden;" href="#"></a></div>
      <!--end thumbs-->
    </div>
    <!--end navigation-containter-->
  </div>
  <!--end frontpage-content-->
    <!--
    <div id="footer">
    <div class="footer-line"></div>
    <p class="copyright">Copyright &copy; <a href="#">Domain Name</a> - All Rights Reserved / Design By <a target="_blank" href="http://www.chris-creed.com/">Chris Creed</a></p>
  </div>
  -->
    <jsp:include page="common/footer.jsp"></jsp:include>
  <!--end footer-->
</div>
<!--end wrap-->
</body>
</html>