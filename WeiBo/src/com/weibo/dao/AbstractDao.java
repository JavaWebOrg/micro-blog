package com.weibo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.weibo.interf.PackageEntity;
import com.weibo.interf.PstmtSetter;
import com.weibo.jdbc.*;
/**
 * 
 * @author lilei
 *
 */
public class AbstractDao {
	/**
	 * 
	 * @param sql
	 * @param pstmtSetter
	 * @param packageEntity
	 * @return object
	 * @throws Exception
	 */
	public final Object queryForObject(String sql,PstmtSetter pstmtSetter,PackageEntity packageEntity)throws Exception{
		Connection conn = DbUtil.GetCon();//获取数据库连接
		if(conn == null){
			throw new RuntimeException("连接数据库失败!");
		}
		if(sql == null){
			throw new RuntimeException("sql语句为空");
		}
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		//设置相关SQL语句的参数
		if(pstmtSetter != null){
			pstmtSetter.setForPstmt(ps);
		}
		//得到结果集
		ResultSet rs = ps.executeQuery();
		Object object = null;
		//对结果集进行封装
		if(packageEntity!=null){
			object = packageEntity.packageEntity(rs);
		}
		if(rs != null) {
			rs.close();
		}
		if(ps != null){
			ps.close();
		}
		if(conn != null){
			conn.close();
		}//关闭连接
		return object;
	}
	/**
	 * 
	 * @param sql
	 * @param pstmtSetter
	 * @param packageEntity
	 * @return 影响的行
	 * @throws Exception
	 */
	public final int doUpdate(String sql,PstmtSetter pstmtSetter)throws Exception{
		int result = -1;
		Connection conn = DbUtil.GetCon();//获取连接
		if(conn == null){
			throw new RuntimeException("没有获取到连接");
		}
		if(sql == null){
			throw new RuntimeException("sql语句为空");
		}
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		if(pstmtSetter != null){//设置相关参数
			pstmtSetter.setForPstmt(ps);
		}//更新
		result = ps.executeUpdate();
		if(ps != null){
			ps.close();
		}
		if(conn != null){
			conn.close();
		}
		return result;
	}
}
