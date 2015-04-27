package com.weibo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.weibo.entity.Message;
import com.weibo.jdbc.DbUtil;

public class MessageDao {
	DbUtil dbutil = new DbUtil();
	//插入动态信息
	public boolean InsertMessage(Message message){
		try {
			Connection conn = dbutil.GetCon();
			String sql = "insert into t_message(ldate,lcontext,uid) values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, message.getLdate());
			pstmt.setString(2, message.getLcontext());
			pstmt.setInt(3, message.getUid());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		return true;
	}
	//查询动态信息
	public ArrayList<Message> QueryInfor(String value,String action){
		ArrayList<Message> list = new ArrayList<Message>();
		try {
			Connection conn = dbutil.GetCon();
			String sql = "select * from t_message where +action+ = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, value);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				Message curMessage = new Message();
				curMessage.setLid(rs.getInt(1));
				curMessage.setLdate(rs.getString(2));
				curMessage.setLcontext(rs.getString(3));
				curMessage.setUid(rs.getInt(4));
				list.add(curMessage);
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
