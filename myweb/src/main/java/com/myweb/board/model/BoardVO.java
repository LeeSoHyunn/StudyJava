package com.myweb.board.model;

import java.sql.Timestamp;

public class BoardVO {
	private int num;
	private String name;
	private String title;
	private String content;
	private Timestamp regdate;
	private int hit;
	
	public BoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BoardVO(int num, String name, String title, String content, Timestamp regdate, int hit) {
		super();
		this.num = num;
		this.name = name;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}

	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", name=" + name + ", title=" + title + ", content=" + content + ", regdate="
				+ regdate + ", hit=" + hit + "]";
	}
	
	
	
}
