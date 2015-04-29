package com.weibo.entity;

public class Message {
	private int lid;
	private String ldate;
	private String lcontext;
	private int uid;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLdate() {
		return ldate;
	}
	public void setLdate(String ldate) {
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
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String ldate, String lcontext, int uid) {
		super();
		this.ldate = ldate;
		this.lcontext = lcontext;
		this.uid = uid;
	}
	
	
	
}
