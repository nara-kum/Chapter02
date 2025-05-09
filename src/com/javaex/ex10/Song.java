package com.javaex.ex10;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	public Song() {
//		System.out.println("Song()");
	}
	
	public Song(String title, String artist, String album, String composer, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
//		System.out.println("Song(5)");
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
//		this(5)-->Song(5)를 호출함
		this(title, artist, album, composer, year);
		this.track = track;
//		System.out.println("Song(6)");
	}
	
	//메소드-gs
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getComposer() {
		return composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public int getTrack() {
		return track;
	}
	
	//메소드-일반
	public void showInfo() {
		
		System.out.println(artist+", "+title+"("+album+", "+year+", "+track+"번 track, "+composer+" 작곡)");
	}
	
}
