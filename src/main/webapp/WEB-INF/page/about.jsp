<%@include file="common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>小郝和小丽结婚啦~O(∩_∩)O哈哈~ | 关于我们</title>
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
      <div class="article page">
        <h2 class="title">Hi, I'm Jennifer and photography is my passion...</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris lorem ipsum dolor sit.</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris lorem ipsum dolor sit.</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris lorem ipsum dolor sit.</p>
        <h2>Recent Awards</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris lorem ipsum dolor sit.</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris lorem ipsum dolor sit.</p>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris lorem ipsum dolor sit.</p>
        <div id="testimonials">
          <h2>Testimonials</h2>
          <div class="testimonial">
            <p><em>“Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris lorem ipsum dolor sit.”</em><br />
              <span class="author">Sarah Johnson</span> ~ <span class="company"><a href="#">Media Solutions</a></span></p>
          </div>
          <!--end testimonial-->
          <div class="testimonial">
            <p><em>“Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris. Mauris interdum, dolor in vulputate tincidunt, mauris lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin a nibh mauris lorem ipsum dolor sit.”</em><br />
              <span class="author">David Simpson</span> ~ <span class="company"><a href="#">Photography Studio</a></span></p>
          </div>
          <!--end testimonial-->
        </div>
        <!--end testimonials-->
      </div>
      <!--end post-->
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