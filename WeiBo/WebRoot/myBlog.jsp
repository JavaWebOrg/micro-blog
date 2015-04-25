<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>我的微博</title>
<link rel="stylesheet" type="text/css" href="./css/index.css">
	<link rel="stylesheet" type="text/css" href="./css/button.css">
	<link rel="stylesheet" type="text/css" href="./css/nav.css">
	<link rel="stylesheet" type="text/css" href="./css/clear.css">
	<link rel="stylesheet" type="text/css" href="./css/myblog.css">
	<script type="text/javascript" src="js/jquery-1.4.4.js"></script>
	<script type="text/javascript" src="js/jqueryme.js"></script>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1" />


</head>
<body>

 <div class="container" align="center">

	  		<div class="header">
	  			<div class="imgheader" >
	  				<div class="imglogo"><img src="./images/logo.png" /> </div>
	  				<div class="imgphone"><img src="./images/phone.jpg" /> </div>	
	  			</div>
	  			
	  		</div>



	  			  		<div class="nav" >
		  		<div class="clear"></div>
		  		<div class="navall" >
		  			<ul id="ul"> 
						<li  id="li"><a id="a"  href="index.html">首页</a></li> 
						<li  id="li"><a id="a"  href="myBlog.jsp">我的微博</a></li> 
						<li  id="li"><a id="a"  href="personInfo.jsp">个人中心</a></li> 
						<li  id="li"><a id="a"  href="lastInfo.jsp">最新动态</a></li> 
						<li  id="li"><a id="a"  href="message.jsp">留言板</a></li> 
						<li  id="li"><a id="a"  href="help.jsp">帮助中心</a></li> 
					</ul>
				</div>
	  		</div>

	  		
	  		<div class="main">
	  			<div class="blogLeft" >
	  				<a href="#">消息</a>
	  				<a href="#">收藏</a>
	  				<a href="#">好友圈</a>
	  			</div>
	  			<div class="blogMiddle">
	  				<div class="something"></div>
	  				<div class="myblog">
	  					<form action="#" method="post">
	  						<textarea rows="5" cols="70" class="text" >nihao </textarea>
	  						<button type="submit" class="button orange medium" style="float:right;margin-right:28px;margin-top:5px;"> <font style="opacity:1;">发表微博</font> </button> 
	  					</form>
	  				</div>
	  				<div class="clear"></div>
	  				<div class="blognav">
	  					<a >全部</a>
	  					<a >原创</a>
	  					<a >视频</a>
	  					<a >音乐</a>
	  					<a >图片</a>
	  					
							<div><img alt="serch" src="images/search.jpg" style="z-index: -1;">
								<form action="#" method="post"><input class="bloginput"/></form>	</div>
		  					</div>
		  					<div style="width:10px;height:10px;"><a href="#" class="yes"></a></div>
		  					
		  					<div class="clear"></div>
		  					
		  			<div class="show">
	  					<div class="msg"> 
	  						<dl>
						  	 <dt>微博用户</dt>
						   	<dd>微博内容</dd>
							</dl>
	  					</div>
	  					<div class="msg"> 
	  						<dl>
						  	 <dt>微博用户</dt>
						   	<dd>微博内容</dd>
							</dl>
	  					</div>
	  					<div class="msg"> 
	  						<dl>
						  	 <dt>微博用户</dt>
						   	<dd>微博内容</dd>
							</dl>
	  					</div>
	  				</div>
	  					
	  			</div>
	  			
	  			<div class="blogRight">	  				
	  				<div class="blogfirst">
	  				<p>最近访客:</p>
		  				<dl>
		  					<dt>
		  						访客名:
		  					</dt>
		  					<dd>
		  						访客信息:
		  					</dd>
		  				</dl>
	  				</div>
	  				<div class="blogsecond">
		  				<dl>
		  					<dt>
		  						热门微博
		  					</dt>
		  					<dd>
		  						热门微博详情
		  					</dd>
		  				</dl>
	  				</div>
	  				<div class="blogthird">
		  				<dl>
		  					<dt>
		  						电影推荐
		  					</dt>
		  					<dd>
		  						电影信息
		  					</dd>
		  				</dl>
	  				</div>
	  				
	  			</div>
			
	  		<div class="footer">
					<p><a href="#">weibo简介</a><i>|</i><a href="#">weibo公告</a><i>|</i> <a href="#">招纳贤士</a><i>|</i><a href="#">联系我们</a><i>|</i>客服热线：188-188-168</p>
					<p>Copyright &copy;版权所有&nbsp;&nbsp;&nbsp;京ICP备88888888号&nbsp;&nbsp;&nbsp;京ICP证B8888-8888号&nbsp;&nbsp;&nbsp;某市公安局XX分局备案编号：1681681681818168</p>
			</div>   		
	  </div>
</div>
</body>
</html>