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
        <h2 class="page-title">填写下面的表单给小郝和小丽发送祝福</h2>
        <p>您的电话和邮箱不会出现在页面上，请放心填写，只有小郝和小丽能看看</p>
        <form id="contact-form" method="post" action="bestWishAction!addBestWish">
          <fieldset>
            <input id="form_name" type="text" name="bestWish.sendUserName" value="名字" onFocus="if(this.value=='名字'){this.value=''};" onBlur="if(this.value==''){this.value='名字'};" />
              <input id="form_mobile" type="text" name="bestWish.mobile" value="手机号" onFocus="if(this.value=='手机号'){this.value=''};" onBlur="if(this.value==''){this.value='手机号'};" />
            <input id="form_email" type="text" name="bestWish.email" value="电子邮箱" onFocus="if(this.value=='电子邮箱'){this.value=''};" onBlur="if(this.value==''){this.value='电子邮箱'};" />

            <textarea id="form_message" rows="10" cols="40" name="bestWish.wishContent"  onFocus="if(this.value=='祝福'){this.value=''};" onBlur="if(this.value==''){this.value='祝福'};">祝福</textarea>
            <input id="form_submit" class="submit" type="submit" name="submit" value="" />
            <div class="hide">
              <label>Do not fill out this field</label>
              <input name="spam_check" type="text" value="" />
            </div>
          </fieldset>
        </form>
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