<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>留言板</title>
<link rel="stylesheet" type="text/css" href="./css/index.css">
	<link rel="stylesheet" type="text/css" href="./css/button.css">
	<link rel="stylesheet" type="text/css" href="./css/nav.css">
	<link rel="stylesheet" type="text/css" href="./css/clear.css">
	<link rel="stylesheet" type="text/css" href="./css/register.css">

	<meta name="viewport" content="width=device-width, initial-scale=1" />
<style>
	.message{
		width:720px;
		height:100%;
		/* border:2px red solid; */
	}
	#mLeft{
		float: left;
		border:0px red solid;
		width: 75%;
		height: 100%;
		background-color: #efefef;
	}

	#mRight{
		float:right;
		border:0px red solid;
		width: 20%;
		height: 100%;
		background-color: yellow;
	}
	.text{
		width: 80%;
		float: right;
		margin-top: 20px;
	}
	.liuyan{
	float:left;font-size:18px;position:relative;left:30px;top:30px;
	font-family: sans-serif;
	font-weight: bold;
	left: 15px;
	top: 20px;
	
	}
	.show{
	margin-top:20px; border:2px red solid;width:100%;height:250px;
	padding:10px 0;
	overflow:hidden;
	}
	.msg{
	border:2px red solid;
	margin-left:10px; 
	}
	
</style>

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
						<li  id="li"><a id="a"  href="index.html">未来展望</a></li> 
					</ul>
				</div>
	  		</div>

	  		
	  		<div class="main">
	  			<div class="message">
	  				<div id="mLeft">
	  					<div class="liuyan">留言内容:</div>
	  					<div class="text">
	  						<form>
	  						<textarea rows="10" name="message" id="message" cols="80" style="margin: 0px; width: 425px; height: 180px;">nihao </textarea>	
	  						<button type="submit" class="button orange medium"> 提交留言</button>
	  						</form>
	  					</div>
	  				<div class="clear"></div>
	  				
	  				<div class="show">
	  					<div class="float msg"> 
	  						<dl>
						  	 <dt>取出的数据标题</dt>
						   	<dd>取出的留言</dd>
							</dl>
	  					</div>
	  					<div class="float msg"> 
						  	 <dl>
						  	 <dt>取出的数据标题</dt>
						   	<dd>取出的留言</dd>
							</dl>
	  					</div>
	  					<div class="float msg"> 
	  						<dl>
						  	 <dt>取出的数据标题</dt>
						   	<dd>取出的留言</dd>
							</dl>
	  					</div>
	  				</div>
	  					

	  				</div>


					<div id="mRight" >
						
					</div>


	  			</div>
	  		
			</div>
			
	  		<div class="footer">
					<p><a href="#">weibo简介</a><i>|</i><a href="#">weibo公告</a><i>|</i> <a href="#">招纳贤士</a><i>|</i><a href="#">联系我们</a><i>|</i>客服热线：188-188-168</p>
					<p>Copyright &copy;版权所有&nbsp;&nbsp;&nbsp;京ICP备88888888号&nbsp;&nbsp;&nbsp;京ICP证B8888-8888号&nbsp;&nbsp;&nbsp;某市公安局XX分局备案编号：1681681681818168</p>
			</div>   		
	  </div>

</body>

	<script type="text/javascript" src="js/jquery-1.4.4.js"></script>
	<script type="text/javascript" src="js/jqueryme.js"></script>
</html>