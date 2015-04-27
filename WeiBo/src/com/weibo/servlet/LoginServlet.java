package com.weibo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.weibo.dao.UserDao;
import com.weibo.entity.User;

public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		String name = request.getParameter("userName");
		String password = request.getParameter("pwd");
		UserDao userDao = new UserDao();
		User user = new User();
		user = userDao.SearchUser(name, "uname");
		//System.out.println("upwd = "+user.getUpwd());
		if(user!=null&&user.getUpwd().equals(password)){
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			session.setAttribute("uid", user.getUid());
			request.getRequestDispatcher("myBlog.jsp").forward(request, response);
		}else {
			
		}
		
	}

}
