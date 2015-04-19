package com.weibo.entity;

import java.util.Date;

public class Message {
	private int lid;
	private Date ldate;
	private String lcontext;
	private int uid;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public Date getLdate() {
		return ldate;
	}
	public void setLdate(Date ldate) {
		this.ldate = ldate;
	}
	public String getLcontext() {
		return lcontext;
	}
	public void setLcontext(String lcontext) {
		this.lcontext = lcontext;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
}
