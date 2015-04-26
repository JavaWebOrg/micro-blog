<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>个人信息</title>
<link rel="stylesheet" type="text/css" href="./css/index.css">
	<link rel="stylesheet" type="text/css" href="./css/button.css">
	<link rel="stylesheet" type="text/css" href="./css/nav.css">
	<link rel="stylesheet" type="text/css" href="./css/clear.css">
	<link rel="stylesheet" type="text/css" href="./css/register.css">
	<link rel="stylesheet" type="text/css" href="./css/personInfo.css">
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
 			<div class="leftInfo">
 				<a href="#"><font size="12px">信息</font></a>
			</div>
			
	  		<div class="rightInfo">
	  		
			  		<div class="myInfo"  >		
			     	    <h4 >昵称:</h4> <button>打开</button>
					    <div>
					    	<form class="panel" action="#" method="post" id="formId"  style="display: none;">
					           	 新昵称:<input type="text" value="" name="userNameInfo"/>
							        <input name="submit" type="submit" value="提交修改"/>
							        <input class="hidval" value="0" type="hidden"/>
					      </form>
					  </div>
			        </div>
			        
			  		<div  class="myInfo"  >		
						         <h4>  密码: </h4> <button>打开</button>
					    <form class="panel" action="#" method="post" id="formId"  style="display: none;">
					           	 新密码:<input type="text" value="" name="userNameInfo"/>
							        <input name="submit" type="submit" value="提交修改"/>
							       <input class="hidval" value="0" type="hidden"/>
					      </form>
			        </div>
			        
			        <div  class="myInfo"  >		
						          <h4>  性别: </h4>   <button>打开</button>
					    <form class="panel" action="#" method="post" id="formId"  style="display: none;">
					           	 性别:<input type="text" value="" name="userNameInfo"/>
							        <input name="submit" type="submit" value="提交修改"/>
							        <input class="hidval" value="0" type="hidden"/>
					      </form>
			        </div>
			        
			        <div  class="myInfo"  >		
						     <h4>年龄</h4><button>打开</button>
					    <form class="panel" action="#" method="post" id="formId"  style="display: none;">
					           	 年龄:<input type="text" value="" name="userNameInfo"/>
							        <input name="submit" type="submit" value="提交修改"/>
							        <input class="hidval" value="0" type="hidden"/>
					      </form>
			        </div>
			        
			        <div  class="myInfo"  >		
						     <h4>电话</h4> <button>打开</button>
					    <form class="panel" action="#" method="post" id="formId"  style="display: none;">
					           	新电话:<input type="text" value="" name="userNameInfo"/>
							        <input name="submit" type="submit" value="提交修改"/>
							        <input class="hidval" value="0" type="hidden"/>
					      </form>
			        </div>
			        
			        <div  class="myInfo"  >		
						       <h4>地址</h4> <button>打开</button>
					    <form class="panel" action="#" method="post" id="formId"  style="display: none;">
					           	 新地址:<input type="text" value="" name="userNameInfo"/>
							        <input name="submit" type="submit" value="提交修改"/>
							       <input class="hidval" value="0" type="hidden"/>
					      </form>
			        </div>
		    
		   				
		    
		    
		    </div>	
			
			
	  		<div class="footer">
					<p><a href="#">weibo简介</a><i>|</i><a href="#">weibo公告</a><i>|</i> <a href="#">招纳贤士</a><i>|</i><a href="#">联系我们</a><i>|</i>客服热线：188-188-168</p>
				<p>Copyright &copy;版权所有&nbsp;&nbsp;&nbsp;京ICP备88888888号&nbsp;&nbsp;&nbsp;京ICP证B8888-8888号&nbsp;&nbsp;&nbsp;某市公安局XX分局备案编号：1681681681818168</p>
			</div> 	
	  </div>
       


</body> 
	<script language="javascript" type="text/javascript" src="js/jquery-1.4.4.js"></script>

<script>
$('.myInfo').each(function () {
	$form = $('form');
	//console
	$(this).bind('click', function () {
		
		 if ( $(".hidval").eq($(this).index()).val() == 0) {
               $form.eq($(this).index()).show(500);
                $(".hidval").eq($(this).index()).val(1);
            } else {
                $form.eq($(this).index()).hide(500);
                  $(".hidval").eq($(this).index()).val(0);
            }
		 $('button').eq($(this).index()).html() == "打开" ? $('button').eq($(this).index()).html("关闭") : $('button').eq($(this).index()).html("打开");
	})
	})
</script>

</html>