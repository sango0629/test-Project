package edu.study.vo;

public class BoardVO {
	private String title;
	private String wdate;
	private String content;
	private String writer;
	private int bidx;
	
	public BoardVO() {
		
	}
	
	public BoardVO(String title, String wdate) {
		this.title = title;
		this.wdate = wdate;
	}
	
	public BoardVO(String title, String wdate, String content, String writer) {
		this.title = title;
		this.wdate = wdate;
		this.content = content;
		this.writer = writer;
	}
	
	public int getBidx() {
		return bidx;
	}

	public void setBidx(int bidx) {
		this.bidx = bidx;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
}
