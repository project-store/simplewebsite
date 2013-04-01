<%@include file="../common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
	<title>编辑文章</title>
	<meta charset="utf-8" />        
	<meta name="description" content="" />
	<meta name="keywords" content="" />  
	<meta name="author" content="Jeremie Tisseau">
	<link rel="icon" type="image/png" href="favicon.png" />
	
	<!-- shitload of crap for IE -->
	<!--[if IE]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js" type="text/javascript"></script><![endif]-->
	<!--[if lt IE 8]><script src="http://ie7-js.googlecode.com/svn/version/2.0(beta3)/IE8.js" type="text/javascript"></script><![endif]-->
	<!-- END -->	
	<link rel="stylesheet" type="text/css" href="css/editerstyle.css" />
	<link type="text/css" rel="stylesheet" href="css/wkrte.css" />
</head>

<body>
	<div id="container">
		<header>
		</header>
		<article>
			<section>				
				<p>添加文章</p>
				<form action="newsAction!addNews" method="post">
                 <p><input name="news.newsTitle"/></p>
                 <p><input name="news.keyWords"/></p><br/><br/>
				<!-- THE WKRTE TEXTAREA -->		        
				<textarea name="news.newsContent" cols="70" rows="20" class="wkrte-1">
				</textarea>	
				<!-- END TEXTAREA -->
                <p><input type="submit" value="提交"/>&nbsp;&nbsp;</p>
                </form>
			</section>
		</article>
	</div><!-- END container -->
	<footer>

	</footer>
	
	<!-- The scripts that will do all the magic -->
	<script type="text/javascript" src="js/jquery-1.3.2.js"></script>
	<script type="text/javascript" src="js/wkrte.js"></script>
	<script type="text/javascript">
	$(document).ready(function() {
		var arr = $('.wkrte-1').rte({
			width: 720,
			height: 520,
			controls_rte: rte_toolbar,
			controls_html: html_toolbar
		});		
	});
</script>
</body>
</html>	