package com.weibo.dao;

import java.util.ArrayList;
import com.weibo.entity.DynamicInformation;
import com.weibo.jdbc.DbUtil;
/**
 * 
 * @author lilei
 *
 */
public class DynamicInformationDao extends BaseDao{
	DbUtil dbutil = new DbUtil();
	/**
	 * 
	 * @param info
	 * @return -1表示 插入失败
	 * @throws Exception
	 */
	public boolean InsertInfomation(DynamicInformation info)throws Exception{
		String sql = "insert into t_infor(ddate,dcontext,uid) values(?,?,?)";
		int result = update(sql, DynamicInformation.class, info.getDdate(),info.getDcontext(),info.getUid());
		if(result!=-1){
			return true;
		}else {
			return false;
		}
	}
	/**
	 * 
	 * @param uid
	 * @return list 对象
	 * @throws Exception 
	 */
	public ArrayList<DynamicInformation> QueryInfor(int uid) throws Exception{
		ArrayList<DynamicInformation> list = new ArrayList<DynamicInformation>();
		String sql = "select * from t_infor where uid = ? order by ddate desc";
		list =(ArrayList<DynamicInformation>) queryToList(sql,DynamicInformation.class ,uid);
		return  list;
		
	}
}
