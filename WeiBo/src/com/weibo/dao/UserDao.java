package com.weibo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.weibo.entity.User;
import com.weibo.jdbc.DbUtil;

public class UserDao extends BaseDao{
	/**
	 * 
	 * @param user
	 * @return
	 * @throws Exception 
	 */
	public boolean Insert(User user) throws Exception {
			String sql ="insert into t_user(uname,upwd,usex,uage,utel,uaddress)" +
					"values(?,?,?,?,?,?)";
			int result = update(sql, User.class, user.getUname(),user.getUpwd(),user.getUsex(),user.getUage(),
					user.getUtel(),user.getUaddress());
			if(result!=-1){
				return true;
			}else {
				return false;
			}
	}
	
	/**
	 * 
	 * @param value
	 * @param action
	 * @return
	 */
	public User SearchUser(String value,String action) throws Exception{
			String sql = "select * from t_user where "+action+" = ?";
			System.out.println("action = "+action +" value = "+value);
		    ArrayList<User> list = new ArrayList<User>();
		    list = (ArrayList<User>)queryToList(sql, User.class, value);
		    return (User)list.get(0);
	}
	/**
	 * 
	 * @param user
	 * @return
	 * @throws Exception 
	 */
	public boolean UpdateUser(User user) throws Exception{
			String sql = "update t_user set uname = ?,upwd = ?,usex=?," +
					"uage=?,utel=?,uaddress=? where uid = ?";
			int result = update(sql, User.class,user.getUname(),user.getUpwd(),user.getUsex(),
					user.getUage(),user.getUtel(),user.getUaddress(),user.getUid());
			if(result != -1){
				return true;
			}else {
				return false;
			}
	}
}
