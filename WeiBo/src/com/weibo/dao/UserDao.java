package com.weibo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.weibo.entity.User;
import com.weibo.jdbc.DbUtil;

public class UserDao {
	DbUtil dbutil = new DbUtil();
	//插入一条数据
	public boolean Insert(User user) {
		Connection conn;
		try {
			conn = dbutil.GetCon();
			String sql ="insert into t_user(uname,upwd,usex,uage,utel,uaddress)" +
					"values(?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUname());
			pstmt.setString(2, user.getUpwd());
			pstmt.setString(3, user.getUsex());
			pstmt.setInt(4, user.getUage());
			pstmt.setString(5, user.getUtel());
			pstmt.setString(6, user.getUaddress());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	//搜索
	public User SearchUser(String choice,String action) {
		try {
			Connection conn = dbutil.GetCon();
			String sql = "select * from t_user where ? = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,action);
			pstmt.setString(2,choice);
			ResultSet rs =pstmt.executeQuery();
			User curUser = null;
			if(rs.next()){
				curUser = new User();
				curUser.setUid(rs.getInt("uid"));
				curUser.setUname(rs.getString("uname"));
				curUser.setUpwd(rs.getString("upwd"));
				curUser.setUage(rs.getInt("uage"));
				curUser.setUtel(rs.getString("utel"));
				curUser.setUaddress(rs.getString("uaddress"));
				curUser.setUsex(rs.getString("usex"));
			}
			rs.close();
			pstmt.close();
			conn.close();
			return curUser;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//更新
	public boolean UpdateUser(User user){
		try {
			Connection conn = dbutil.GetCon();
			String sql = "update t_user set uname = ?,upwd = ?,usex=?," +
					"uage=?,utel=?,uaddress=? where uid = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,user.getUname());
			pstmt.setString(2,user.getUpwd());
			pstmt.setString(3,user.getUsex());
			pstmt.setInt(4,user.getUage());
			pstmt.setString(5,user.getUtel());
			pstmt.setString(6,user.getUaddress());
			pstmt.setInt(7,user.getUid());
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
}
