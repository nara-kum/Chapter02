package com.javaex.ex10;

public class SongApp {
	
	public static void main(String[] args) {
		
		Song list01 = new Song();
		list01.setTitle("좋은날");
		list01.setArtist("아이유");
		list01.setAlbum("Real");
		list01.setComposer("이민수");
		list01.setYear(2010);
		list01.setTrack(3);
		list01.showInfo();
		
		Song list02 = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007);
		list02.showInfo();
		
		Song list03 = new Song("벚꽃엔딩","버스커버스커","버스커버스커 1집","장범준",2012,4);
		list03.showInfo();
		
	}

}
