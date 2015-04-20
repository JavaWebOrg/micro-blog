package com.weibo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.weibo.entity.DynamicInformation;
import com.weibo.jdbc.DbUtil;
public class DynamicInformationDao {
	DbUtil dbutil = new DbUtil();
	//插入动态信息
	public boolean InsertInfomation(DynamicInformation info){
		try {
			Connection conn = dbutil.GetCon();
			String sql = "insert into t_infor(ddate,dcontext,uid) values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, info.getDdate());
			pstmt.setString(2, info.getDcontext());
			pstmt.setInt(3, info.getUid());
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
	public ArrayList<DynamicInformation> QueryInfor(String value,String choice){
		ArrayList<DynamicInformation> list = new ArrayList<DynamicInformation>();
		try {
			Connection conn = dbutil.GetCon();
			String sql = "select * from t_infor where ? = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, choice);
			pstmt.setString(2, value);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				DynamicInformation curInfor = new DynamicInformation();
				curInfor.setDid(rs.getInt(1));
				curInfor.setDdate(rs.getString(2));
				curInfor.setDcontext(rs.getString(3));
				curInfor.setUid(rs.getInt(4));
				list.add(curInfor);
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
