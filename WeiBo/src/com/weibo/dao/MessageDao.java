package com.weibo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.weibo.entity.Message;
import com.weibo.jdbc.DbUtil;

public class MessageDao {
	static DbUtil dbutil = new DbUtil();
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
	public ArrayList<Message> QueryInfor(String value,String choice){
		ArrayList<Message> list = new ArrayList<Message>();
		try {
			Connection conn = dbutil.GetCon();
			String sql = "select * from t_message where ? = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, choice);
			pstmt.setString(2, value);
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
	
	/**
	 * 获取数据库的总留言条数
	 * @return 留言总条数
	 * @throws Exception
	 */
	public static int getCount()throws Exception{
		Connection conn = dbutil.GetCon();
		String sql = "select count(*) from t_message;";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
			return rs.getInt(1);
		}
		return 0;
	}
	
	/**
	 * 分页查询数据并显示
	 * @param sql 查询插入的sql语句
	 * @param start 查询开始的位置 
	 * @param number 查询显示的留言条数
	 * @return
	 */
	public static ArrayList<Message> QueryInfo(int start,int number){
		ArrayList<Message> list = new ArrayList<Message>();
		try {
			Connection conn = dbutil.GetCon();
			String sql="SELECT * FROM t_message LIMIT ?,?;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, number);
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
