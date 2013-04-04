<%@include file="common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>小郝和小丽结婚啦~O(∩_∩)O哈哈~ | 送祝福</title>
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" href="styles/style.css" />
<script type="text/javascript" src="../../js/jquery-1.3.2.js"></script>
<!--[if IE 6]>
    <script src="../../js/ie6-transparency.js"></script>
    <script>DD_belatedPNG.fix('#header .logo img, .subtitle img, .slideshow-container, .navigation-container #thumbs .thumbs li .thumb img, .navigation a.next, .footer-line, #sidebar .author-photo, .line, .commentlist .comment-reply-link, #contact-page #contact .submit, #contact-page #contact-form .submit');</script>
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
      <div id="contact-page">
        <!-- The Contact Form -->
        <h2 class="page-title">您的祝福已经发送成功</h2>
        <p>您的电话和邮箱不会出现在页面上，请放心填写，只有小郝和小丽能看看</p>
          <!-- JiaThis Button BEGIN -->
          <div class="jiathis_style_32x32">
              <a class="jiathis_button_qzone"></a>
              <a class="jiathis_button_tsina"></a>
              <a class="jiathis_button_tqq"></a>
              <a class="jiathis_button_renren"></a>
              <a class="jiathis_button_kaixin001"></a>
              <a href="http://www.jiathis.com/share?uid=1762829" class="jiathis jiathis_txt jiathis_separator jtico jtico_jiathis" target="_blank"></a>
              <a class="jiathis_counter_style"></a>
          </div>
          <script type="text/javascript" >
              var jiathis_config={
                  data_track_clickback:true,
                  sm:"tqq,tsina,renren,kaixin001,meilishuo,hi,digu,miliao,weixin,qzone",
                  url:"http://localhost",
                  summary:"小郝和小丽结婚啦，大家一起送祝福",
                  title:"#小郝和小丽结婚啦~#",
                  pic:"http://loalhost/w.jpg",
                  hideMore:false
              }
          </script>
          <script type="text/javascript" src="http://v3.jiathis.com/code/jia.js?uid=1762829" charset="utf-8"></script>
          <!-- JiaThis Button END -->


      </div>
      <!--end contact-page-->
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
<div class="cache-images"><img src="images/submit-button-blue-hover.png" width="0" height="0" alt="" /></div>
<!--end cache-images-->
</body>
</html>