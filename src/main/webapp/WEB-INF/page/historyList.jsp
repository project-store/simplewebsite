<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SuperHao
  Date: 13-3-28
  Time: 上午11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="css/history.css" rel="stylesheet"/>
</head>
<body>
<!-- 代码 开始 -->
<div class="head-warp" style="display: none">
    <div class="head">
        <div class="nav-box">
            <ul>
                <li class="cur" style="text-align:center; font-size:62px; font-family:'微软雅黑', '宋体';">公司大事记时间轴</li>
            </ul>
        </div>
    </div>
</div>
<div class="main">
    <div class="history">
        <c:forEach items="${eventCategoryList}" var="category" varStatus="status">
            <c:if test="${status.index==0}">
                <div class="history-date">
                    <ul>
                        <h2 class="first"><a href="#nogo">${category.eventCategoryName}</a></h2>


                        <c:forEach items="${category.eventList}" var="event" varStatus="estatus">
                            <li <c:if test="${event.importantFlag eq 1}">class="green"</c:if>>
                                <h3>${event.eventDate}</h3>
                                <dl>
                                    <dt>${event.eventTitle}
                                        <span>${event.eventContent}</span>
                                    </dt>
                                </dl>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </c:if>
            <c:if test="${status.index!=0}">
                <div class="history-date">
                    <ul>
                        <h2 class="date02"><a href="#nogo">${category.eventCategoryName}</a></h2>
                        <c:forEach items="${category.eventList}" var="event" varStatus="estatus">
                        <li <c:if test="${event.importantFlag eq 1}">class="green"</c:if>>
                            <h3>${event.eventDate}</h3>
                            <dl>
                                <dt>${event.eventTitle}
                                    <span>${event.eventContent}</span>
                                </dt>
                            </dl>
                        </li>
                        </c:forEach>
                    </ul>
                </div>
            </c:if>
        </c:forEach>
    </div>
</div>

<script src="../js/jquery-1.3.2.js"></script>
<!-- 代码 结束 -->
</body>
</html>
