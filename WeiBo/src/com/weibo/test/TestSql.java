package com.weibo.test;

import java.util.Date;

import com.weibo.dao.DynamicInformationDao;
import com.weibo.dao.FriendDao;
import com.weibo.dao.MessageDao;
import com.weibo.entity.DynamicInformation;
import com.weibo.entity.Friend;
import com.weibo.entity.Message;

public class TestSql {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception{
		/*UserDao udao = new UserDao();
		User user = new User();
		user.setUid(1);
		user.setUname("����");
		user.setUpwd("123456");
		user.setUsex("��");
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
		//����DynamicInformationDao��
		/*DynamicInformation info = new DynamicInformation();
		DynamicInformationDao infoDao = new DynamicInformationDao();
		info.setDdate(new java.util.Date().toLocaleString());
		info.setDcontext("����Ŷ");
		info.setUid(1);
		infoDao.InsertInfomation(info);*/
		//����messageDao��
		/*Message message = new Message();
		MessageDao messageDao = new MessageDao();
		message.setLdate(new java.util.Date().toLocaleString());
		message.setLcontext("����ѽ��");
		message.setUid(1);
		messageDao.InsertMessage(message);*/
		
		
		/*//
		Friend friend = new Friend();
		FriendDao fdao = new FriendDao();
		friend.setXuid(1);
		friend.setYuid(2);
		friend.setXunane("����");
		friend.setYuname("����");
		friend.setUid(2);
		fdao.InsertFriend(friend);*/
		
		MessageDao md=new MessageDao();
//		System.out.println(md.getCount());
	}
}
