package com.weibo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.weibo.dao.DynamicInformationDao;
import com.weibo.entity.DynamicInformation;

public class MyBlogServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		String info = request.getParameter("info");
		String date = new java.util.Date().toLocaleString();
		HttpSession session = request.getSession();
		int uid =  (Integer) session.getAttribute("uid");
		DynamicInformation dInfor = new DynamicInformation();
		dInfor.setUid(uid);
		dInfor.setDdate(date);
		dInfor.setDcontext(info);
		DynamicInformationDao ddao = new DynamicInformationDao();
		boolean isInsert = ddao.InsertInfomation(dInfor);
		if(isInsert == true){
			ArrayList<DynamicInformation> list = ddao.QueryInfor(uid);
			session.setAttribute("dlist", list);
			request.getRequestDispatcher("myBlog.jsp").forward(request, response);
			
		}
	}

}
