<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
		<link rel="stylesheet" type="text/css" href="./css/index.css">
	<link rel="stylesheet" type="text/css" href="./css/button.css">
	<link rel="stylesheet" type="text/css" href="./css/nav.css">
	<link rel="stylesheet" type="text/css" href="./css/scroll.css">
	<link rel="stylesheet" type="text/css" href="./css/clear.css">
	<link rel="stylesheet" type="text/css" href="./css/register.css">
	<script type="text/javascript" src="js/jquery-1.4.4.js"></script>
	<script type="text/javascript" src="js/jqueryme.js"></script>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	

  </head>
  
  <body><div class="container" align="center">

	  		<div class="header">
	  			<div class="imgheader" >
	  				<div class="imglogo"><img src="./images/logo.png" /> </div>
	  				<div class="imgphone"><img src="./images/phone.jpg" /> </div>	
	  			</div>
	  			
	  		</div>



	  		<div class="nav">
	  			  		<hr>
	  			<ul id="nav"> 
					<li><a href="#">首页</a></li> 
					<li><a href="#">我的微博</a></li> 
					<li><a href="#">个人中心</a></li> 
					<li><a href="#">最新动态</a></li> 
					<li><a href="#">留言板</a></li> 
					<li><a href="#">帮助中心</a></li> 
				</ul> 
	  		</div>

	  		
	  		<div class="main">
	  			<div class="register">
	  				<form action="*" method="post">
	  				
	  					<div>  <div class="info">用户名:</div>   <div class="info"><input type="text" name="userName" id="userName"/></div></div>
	  					<div class="clear"></div>
	  					<div>  <div class="info">密码: </div>    <div class="info"><input type="password" name="password" id="password"/></div></div>
	  					<div class="clear"></div>
	  			<!--  		<div>  <div class="info">确认密码: </div>  <div class="info"><input type="password" name="" id=""/></div></div>
	  					<div class="clear"></div> --> 
	  					<div>  <div class="info">性别: </div>  <div class="info1"><input type="radio" name="sex" id="man"  value="男"  /> 男<input type="radio" name="sex" id="woman"  value="女"  style="margin-left: 20px;" />女</div></div>
	  					<div class="clear"></div>
	  					<div>  <div class="info">年龄: </div>  <div class="info"><input type="text" name="" id=""/></div>  </div>
	  					<div class="clear"></div>
	  					<div>  <div class="info">电话: </div>  <div class="info"><input type="text" name="" id=""/></div>  </div>
	  					<div class="clear"></div>
	  					<div>  <div class="info">地址: </div>  <div class="info"><input type="text" name="" id=""/></div>   </div>
						<div class="clear"></div>
	  						<div class="input" style="padding-top:15px;">
	  							<!-- <input type="submit" name="submit" value="register"  /> -->
	  	 				<!-- 			<button href="" class="button gray small" width:="10px";> <font style="opacity:1;">注册</font> </button> 
	  	 					 -->		
	  						 </div>
	  				
	  				</form>
				</div>
			</div>
			
	  		<div class="footer">footer</div>  		
	  </div>
  </body>
</html>
