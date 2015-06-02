package com.weibo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weibo.dao.UserDao;
import com.weibo.entity.User;

public class RegisterServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		User user = new User();
		user.setUname(name);
		user.setUpwd(password);
		user.setUsex(sex);
		user.setUage(age);
		user.setUtel(tel);
		user.setUaddress(address);
		UserDao userdao = new UserDao();
		boolean isInsert = false;
		try {
			isInsert = userdao.Insert(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(isInsert == true){
			request.getRequestDispatcher("index.html").forward(request, response);
		}else {
			request.getRequestDispatcher("erroe.jsp");
		}
	}

}
