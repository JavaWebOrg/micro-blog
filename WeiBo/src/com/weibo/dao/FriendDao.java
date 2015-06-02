package com.weibo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.weibo.entity.Friend;
import com.weibo.jdbc.DbUtil;

public class FriendDao extends BaseDao{
	/**
	 * 
	 * @param friend
	 * @return
	 * @throws Exception
	 */
	public boolean InsertFriend(Friend friend) throws Exception{
			String sql = "insert into t_friend(xuid,yuid,xuname,yuname,uid) value(?,?,?,?,?)";
		    int result = update(sql, Friend.class, friend.getXuid(),friend.getYuid(),friend.getXunane(),friend.getYuname(),friend.getUid());
		    if(result != -1){
		    	return true;
		    }else{
		    	return false;
		    }
	}
	/**
	 * 
	 * @param value
	 * @param choice
	 * @return
	 * @throws Exception 
	 */
	public ArrayList<Friend> QueryFriendMessage(String value,String choice) throws Exception{
		ArrayList<Friend> list = new ArrayList<Friend>();
		String sql = "select * from t_friend where ? = ?";
		list = (ArrayList<Friend>)queryToList(sql, Friend.class, choice,value);
		return list;
	}
}
