package com.weibo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class DbUtil {
	private static String jdbcName = "com.mysql.jdbc.Driver";
	private static String username = "root";
	private static String password = "123456";
	private static String dbUrl = "jdbc:mysql://localhost:3306/weibo?useUnicode=true&characterEncoding=UTF-8";
	public static Connection GetCon() throws Exception{
		Class.forName(jdbcName);//������
		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		return conn;
	}
	public void CloseCon(Connection conn) throws Exception{
		if(conn!=null){
			conn.close();
		}
	}
	/*public static void main(String[] args) throws Exception{
		DbUtil util = new DbUtil();
		Connection con = util.GetCon();
		if(con!=null){
			System.out.println("���ӳɹ���");
			util.CloseCon(con);
		}
	}*/
}
