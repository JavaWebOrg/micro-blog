package com.weibo.entity;

import java.sql.Date;

public class DynamicInformation {
	private int did;
	private Date ddate;
	private String dcontext;
	private int uid;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public Date getDdate() {
		return ddate;
	}
	public void setDdate(Date ddate) {
		this.ddate = ddate;
	}
	public String getDcontext() {
		return dcontext;
	}
	public void setDcontext(String dcontext) {
		this.dcontext = dcontext;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
}
