package com.weibo.dao;

import java.util.ArrayList;
import java.util.Date;

import com.weibo.entity.Message;

public class MessageDao extends BaseDao{
	/**
	 * 
	 * @param message
	 * @return
	 */
	public boolean InsertMessage(Message message)throws Exception{
			String sql = "insert into t_message(ldate,lcontext,uid) values(?,?,?)";
			int result = update(sql, Message.class,new Date().toLocaleString(),message.getLcontext(),message.getUid());
			if(result != -1){
				return true;
			}else{
				return false;
			}
	}
	/**
	 * 
	 * @param value
	 * @param action
	 * @return
	 * @throws Exception 
	 */
	public ArrayList<Message> QueryInfor(String value,String action) throws Exception{
		ArrayList<Message> list = new ArrayList<Message>();
		String sql = "select * from t_message where +action+ = ?";
		list = (ArrayList<Message>)queryToList(sql, Message.class, value);
		return list;
	}
}
