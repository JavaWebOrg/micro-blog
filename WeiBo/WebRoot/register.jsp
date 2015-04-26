<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    
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
	<link rel="stylesheet" type="text/css" href="./css/clear.css">
	<link rel="stylesheet" type="text/css" href="./css/register.css">

	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1" />

	<SCRIPT   LANGUAGE="JavaScript">       
function   fresh()  
/* {  
if(location.href.indexOf("?reload=true")<0)
   {
    location.href+="?reload=true";  
   }  
}  
setTimeout("fresh()",10); */
</SCRIPT>
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
	  			<div class="register">
	  				<form action="RegisterServlet" method="post">
	  				
	  					<div>  <div class="info">用户名:</div>   <div class="info"><input type="text" name="userName" id="userName"/></div></div>
	  					<div class="clear"></div>
	  					<div>  <div class="info">密码: </div>    <div class="info"><input type="password" name="password" id="password"/></div></div>
	  					<div class="clear"></div>
	  			<!--  		<div>  <div class="info">确认密码: </div>  <div class="info"><input type="password" name="" id=""/></div></div>
	  					<div class="clear"></div> --> 
	  					<div>  <div class="info">性别: </div>  <div class="info"><input type="text" name="sex" id="sex"/></div><div class="float"><font color="red">*(男 或 女)</font></div>  </div>
	  					<div class="clear"></div>
	  					<div>  <div class="info">年龄: </div>  <div class="info"><input type="text" name="age" id="age"/></div>  </div>
	  					<div class="clear"></div>
	  					<div>  <div class="info">电话: </div>  <div class="info"><input type="text" name="tel" id="tel"/></div>  </div>
	  					<div class="clear"></div>
	  					<div>  <div class="info">地址: </div>  <div class="info"><input type="text" name="address" id="address"/> </div>  </div>
						<div class="clear"></div>
	  						<div class="input" style="padding-top:15px;">
	  							<!-- <input type="submit" name="submit" value="register"  /> -->
	  	 							<button type="submit" class="button gray medium" width:="10px";> <font style="opacity:1;">注册</font> </button> 
	  	 					 		
	  						 </div>
	  				
	  				</form>
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
