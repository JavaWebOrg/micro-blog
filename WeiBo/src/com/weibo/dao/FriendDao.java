package com.weibo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.weibo.entity.Friend;
import com.weibo.jdbc.DbUtil;

public class FriendDao {
	DbUtil dbutil = new DbUtil();
	public boolean InsertFriend(Friend friend){
		try {
			Connection conn = dbutil.GetCon();
			String sql = "insert into t_friend(xuid,yuid,xuname,yuname,uid) value(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, friend.getXuid());
			pstmt.setInt(2, friend.getYuid());
			pstmt.setString(3, friend.getXunane());
			pstmt.setString(4, friend.getYuname());
			pstmt.setInt(5, friend.getUid());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<Friend> QueryFriendMessage(String value,String choice){
		ArrayList<Friend> list = new ArrayList<Friend>();
		try {
			Connection conn = dbutil.GetCon();
			String sql = "select * from t_friend where ? = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, choice);
			pstmt.setString(2, value);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				Friend friend = new Friend();
				friend.setHid(rs.getInt(1));
				friend.setXuid(rs.getInt(2));
				friend.setYuid(rs.getInt(3));
				friend.setXunane(rs.getString(4));
				friend.setYuname(rs.getString(5));
				friend.setUid(rs.getInt(6));
				list.add(friend);
			}
			rs.close();
			pstmt.close();
			conn.close();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
