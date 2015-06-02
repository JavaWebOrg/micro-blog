package com.weibo.dao;

import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import com.weibo.interf.PackageEntity;
import com.weibo.interf.PstmtSetter;
/**
 * 
 * @author lilei
 *
 */
public class BaseDao extends AbstractDao{
	/**
	 * 
	 * @param sql 结构化查询语句
	 * @param clazz 某实体类对应的反射
	 * @param args SQL语句相对应的参数
	 * @return object 返回的数据封装成object类型
	 * @throws Exception
	 */
	public Object queryToList(String sql,final Class<?> clazz,final Object ...args)throws Exception{
		Object object = null;
		//获取对象
		object = queryForObject(sql, new PstmtSetter(){
			public PreparedStatement setForPstmt(PreparedStatement ps) throws Exception {
				// 设置参数
				if(args != null && args.length>0){
					for(int i = 0 ; i < args.length ; i++){
							ps.setObject(i+1, args[i]);
					}
				}
				return ps;
			}
			
		}, new PackageEntity(){

			public List<Object> packageEntity(ResultSet rs) throws Exception {
				// TODO Auto-generated method stub
				List<Object> list = null;
				if(rs!=null){
					list = new ArrayList<Object>();
					//获取对象方法
					Method[] methods = clazz.getMethods();
					//获取结果集的元数据
					ResultSetMetaData metaData = rs.getMetaData();
					//遍历整个结果集	
					while(rs.next()){
						//实例化该对象
							Object object = clazz.newInstance();
							for(int i = 0 ; i < metaData.getColumnCount(); i++){
								//获取列名
								String columnName = metaData.getColumnName(i+1);
								//获取对应列名的值
								Object columnValue = rs.getObject(columnName);
								//遍历整个对象方法，找到与columnName相对应的方法名，并调用相应的set方法
								for(Method method :methods){
									
									if(method.getName().equalsIgnoreCase("set"+columnName)){
										method.invoke(object, columnValue);
										break;
									}
								}
								
							}//把对象加入list中
							list.add(object);
						}
				}
				return list;
			}
			
		});
		return object;
	}
	/***
	 * 
	 * @param sql 结构化查询语句，包括更新，插入，删除
	 * @param clazz 某实体类对应的反射
	 * @param args 设置占位符的值
	 * @return int 影响的行数
	 * @throws Exception
	 */
	public int update(String sql,Class<?> clazz,final Object ...args)throws Exception{
		int result = -1;
		result = doUpdate(sql, new PstmtSetter(){
			
			public PreparedStatement setForPstmt(PreparedStatement ps)throws Exception{
				if(args!=null && args.length>0){
					for(int i = 0 ; i < args.length; i++){
						ps.setObject(i+1, args[i]);
					}
				}
				return ps;
			}
		});
		return result ;
	}
}
