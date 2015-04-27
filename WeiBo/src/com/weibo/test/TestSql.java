package com.weibo.test;

import java.util.Date;

import com.weibo.dao.DynamicInformationDao;
import com.weibo.dao.FriendDao;
import com.weibo.dao.MessageDao;
import com.weibo.dao.UserDao;
import com.weibo.entity.DynamicInformation;
import com.weibo.entity.Friend;
import com.weibo.entity.Message;
import com.weibo.entity.User;

public class TestSql {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception{
		/*UserDao udao = new UserDao();
		User user = new User();
		user.setUid(1);
		user.setUname("王五");
		user.setUpwd("123456");
		user.setUsex("男");
		user.setUage(20);
		user.setUtel("534535");
		user.setUaddress("djkshfdkshk");
		try {
			udao.UpdateUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("uname = "+user.getUname());
		System.out.println("upwd = "+user.getUpwd());*/
		//测试DynamicInformationDao类
		/*DynamicInformation info = new DynamicInformation();
		DynamicInformationDao infoDao = new DynamicInformationDao();
		info.setDdate(new java.util.Date().toLocaleString());
		info.setDcontext("不错哦");
		info.setUid(1);
		infoDao.InsertInfomation(info);*/
		//测试messageDao类
		/*Message message = new Message();
		MessageDao messageDao = new MessageDao();
		message.setLdate(new java.util.Date().toLocaleString());
		message.setLcontext("你妹呀！");
		message.setUid(1);
		messageDao.InsertMessage(message);*/
		
		
		//
		/*Friend friend = new Friend();
		FriendDao fdao = new FriendDao();
		friend.setXuid(1);
		friend.setYuid(2);
		friend.setXunane("张三");
		friend.setYuname("李四");
		friend.setUid(2);
		fdao.InsertFriend(friend);*/
		User user = new User();
		UserDao udao = new UserDao();
		user = udao.SearchUser("admin", "uname");
		if(user!=null){
			System.out.println("utel = "+user.getUtel());
		}
	}
}
