package com.ssafy.prj.board.vo;

public class Board {
	private int no;
	private int viewCnt;
	private String title;
	private String writer;
	private String content;
	
	public int getNo() {
		return no;
	}
	
	public Board setNo(int no) {
		this.no = no;
		return this;
	}
	
	public int getViewCnt() {
		return viewCnt;
	}
	
	public Board setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
		return this;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Board setTitle(String title) {
		this.title = title;
		return this;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public Board setWriter(String writer) {
		this.writer = writer;
		return this;
	}
	
	public String getContent() {
		return content;
	}
	
	public Board setContent(String content) {
		this.content = content;
		return this;
	}
	
	@Override
	public String toString() {
		return "Board [no=" + no + ", viewCnt=" + viewCnt + ", title=" + title + ", writer=" + writer + ", content="
				+ content + "]";
	}
}
