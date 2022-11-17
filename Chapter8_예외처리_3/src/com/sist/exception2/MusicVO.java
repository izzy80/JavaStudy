package com.sist.exception2;
// Music과 관련된데이터시스템 만들어줌
public class MusicVO {
	private String title;
	private String singer;
	private String album;
	// getter-setter해주기
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
}
