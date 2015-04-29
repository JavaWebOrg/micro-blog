<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ page import="com.weibo.dao.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.weibo.entity.*" %>

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
	<link rel="stylesheet" type="text/css" href="./css/message.css">
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
						<li  id="li"><a id="a"  href="index.html">未来展望</a></li> 
					</ul>
				</div>
	  		</div>

	  		
	  		<div class="main">
	  			<div class="message">
	  				<div id="mLeft">
		  					<div class="liuyan">留言内容:</div>
		  					<div class="text">
		  						<form action="MessageServlet" method="post" onsubmit="return isNull()">
		  							<textarea rows="10" name="message" id="message" cols="80" style="margin: 0px; width: 425px; height: 180px;" > </textarea>	
		  						<button type="submit" class="button orange medium"> 提交留言</button>
		  						</form>
		  					</div>
	  						<div class="clear"></div>
		  				
			  				<div class="show">
			  				
				  				<form action="">
				  				<div class="msg"> 
				  				<%
				  					final int number = 5;	// 一页显示 5条记录
				  					int pageNum = 1; 			// 当前页数
				  					int pageCount = 1;			// 总页数
				  					int recordCount = MessageDao.getCount();		// 总记录数
System.out.println("recordCount="+recordCount);
				  					// 计算总页数
				  					pageCount = ( recordCount + number - 1 ) / number;
				  					// 本页从 startRecord 行开始
				  					int start= ( pageNum - 1) * number;
				  					ArrayList<Message> mess=MessageDao.QueryInfo(start,number);
				  					for(int i=0;i<mess.size();i++){
				  						Message message=mess.get(i);
				  						int id=message.getLid();
//System.out.println("id="+id);
				  						String text=message.getLcontext();
//System.out.println("text="+text);
				  						String date=message.getLdate();
//System.out.println("id="+id);
				  				%>
				  					
				  						<dl>
										   	 <dt><%=text %></dt>
									   		 <dd  style="postion:relative;right:5px;"><%=id %>&nbsp;&nbsp;<%=date %></dd>
										</dl>
				  					
				  				<%
				  					}
				  				%>
				  				</div>
				  				<a href="#">next  要在点击的时候能够显示下一条数据,还有留言的框架要做完</a>
				  				</form>	
				  				
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
	<script type="text/javascript">
		function isNull(){
			var text=document.getElementById("message").value;
			if(""==text){
				return false;
			}
			else{
				return true;
			}
		}
	</script>
	
</html>