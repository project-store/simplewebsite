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
      <c:forEach items="${newsList.items}" var="news" varStatus="status">
      <div class="article">
          <!--标题和作者时间-->
          <h2 class="title"><a href="#">${news.newsTitle}</a></h2>
        <p class="meta">小郝 ~ ${news.createDate}</p>
          <!--文章正文-->
         ${news.newsContent}
          <!--下面是文章链接-->
        <a href="#" class="more-link">Read The Full Article &raquo;</a>
      </div>

      <!--end post-->
      <div class="line"></div>
      </c:forEach>
       <!--迭代显示news-->
        <!---此处做一个分页导航----->
        <pg:pager url="newsAction!init"
                  items="${newsList.total}" maxPageItems="10" maxIndexPages="5"
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