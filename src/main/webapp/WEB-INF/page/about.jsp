<%@include file="common/taglibs.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>小郝和小丽结婚啦~O(∩_∩)O哈哈~ | 关于我们</title>
    <meta charset="utf-8">
    <link type="text/css" rel="stylesheet" href="styles/style.css"/>
    <script type="text/javascript" src="../../js/jquery-1.3.2.js"></script>
    <!--[if IE 6]>
    <script src="../../js/ie6-transparency.js"></script>
    <script>DD_belatedPNG.fix('#header .logo img, .subtitle img, .slideshow-container, .navigation-container #thumbs .thumbs li .thumb img, .navigation a.next, .footer-line, #sidebar .author-photo, .line, .commentlist .comment-reply-link, #contact-page #contact .submit');</script>
    <link type="text/css" rel="stylesheet" type="text/css" href="styles/ie6.css"/>
    <![endif]-->
    <!--[if IE 7]>
    <link type="text/css" rel="stylesheet" type="text/css" href="styles/ie7.css"/><![endif]-->
</head>
<body>
<div id="wrap">
    <jsp:include page="common/header.jsp"></jsp:include>
    <!--end header-->
    <div id="main">
        <div id="content">
            <div class="article page">

                <img width="230px" height="230px" src="http://farm9.staticflickr.com/8259/8664998610_0a30497cb0_b.jpg" style="border: 2px solid #F34607;-webkit-border-radius: 5px;-moz-border-radius: 5px;border-radius: 5px">

                <h4><a href="#">关于新郎</a></h4>

                <p>新郎大名郝自璞，新娘称呼新郎小胖，小璞，小郝，老公。88年生人，毕业于河北农大，现就职于北京某IT公司。</p>

                <p></p>

                <div class="line"></div>

                <img width="230px" height="230px" src="http://farm9.staticflickr.com/8264/8664998292_4342e1b4a2_b.jpg" style="border: 2px solid #F34607;-webkit-border-radius: 5px;-moz-border-radius: 5px;border-radius: 5px">

                <h4><a href="#">关于新娘</a></h4>

                <p>新娘芳名张建丽，新郎称呼新娘小丽，丽妞妞，小屁丽，丽姐姐。XX年生人(当然要保密)，毕业于河北农大，现就职于某旅游公司。</p>


                <p></p>

                <div class="line"></div>
                <div id="testimonials">
                    <h4><a href="#">关于本站</a></h4>

                    <div class="testimonial">
                        <p><em>本站是新郎为了收集朋友们的祝福而制作，采用ssh+mysql，在这里要感谢贵棋同学对页面顶部图片的设计，
                            是页面的点睛之笔，喜庆的气氛一下子表现出来了~</em><br/>

                    </div>
                    <!--end testimonial-->

                </div>
                <!--end testimonials-->
            </div>
            <!--end post-->
        </div>
        <!--end content-->
        <!--旁边随即显示朋友祝福见证-->
        <div id="sidebar">
            <div class="author-photo"><img
                    src="http://xiaohao405-wordpress.stor.sinaapp.com/uploads/2013/04/weixinPic.jpg" alt=""
                    width="230px" height="230px"/></div>
            <!--end author-photo-->
            <div id="author-details">
                <h3><span class="status">亲: </span>关注小郝和小丽结婚啦~微信账号</h3>

                <p>小郝和小丽就要结婚啦，非常感谢你能来这个站点给我们送上祝福。</p>

                <p>扫一下上面的二维码图，关注我们结婚的公共账号，了解我们结婚最新动态，八卦一下恋爱史，看看婚纱照，更多功能你自己发现~</p>

                <p>谢谢~</p>
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