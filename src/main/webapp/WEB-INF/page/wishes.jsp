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
        <c:forEach items="${bestWishPage.items}" var="wish" varStatus="status">
        <div class="article">
        <p class="meta"><a href="#">${wish.sendUserName} ~ ${wish.createDate}</a></p>
        <div style="width: 600px;word-break: break-all;">${wish.wishContent}</div>
      </div>
      <!--end post-->
      <div class="line"></div>
        </c:forEach>
        <!---此处做一个分页导航----->
        <pg:pager url="bestWishAction!init"
                  items="${bestWishPage.total}" maxPageItems="10" maxIndexPages="5"
                  export="currentPageNumber=pageNumber">
            <pg:prev>
                <span class="pageNumStyle"><a href="${pageUrl }">上一页</a></span>
            </pg:prev>
            <pg:pages>
                <c:choose>
                    <c:when test="${currentPageNumber eq pageNumber }">
                        <span class="pageNumStyle" style="border:1px solid red"><a href="#">${pageNumber }</a></span>
                    </c:when>
                    <c:otherwise>
                        <span class="pageNumStyle"><a href="${pageUrl }">${pageNumber }</a></span>
                    </c:otherwise>
                </c:choose>
            </pg:pages>
            <pg:next>
                <span class="pageNumStyle"><a href="${pageUrl }">下一页</a></span>
            </pg:next>
        </pg:pager>

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