package com.javaex.ex07;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	
	//메소드 gs
	//제목
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	//가수
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	//앨범
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return artist;
	}
	//작곡가
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getComposer() {
		return composer;
	}
	//연도
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	//트랙
	public void setTrack(int track) {
		this.track = track;
	}
	public int getTrack() {
		return track;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+"번 track, "+composer+" 작곡)");
	}
}
