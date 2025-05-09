package com.javaex.ex13;

public class TvApp {
	public static void main(String[] args) {
		
		Tv tv = new Tv(false,7,20);
		
		tv.status();
		
		tv.setPower(true);
		tv.setChannel(200);
		
		tv.status();
		
		tv.setChannel(true);
		tv.setChannel(true);
		tv.setChannel(true);
		
		tv.status();

		tv.setVolume(98);
		
		tv.status();
		
		tv.setVolume(true);
		tv.setVolume(true);
		tv.setVolume(true);
		tv.setVolume(true);
		
		tv.status();
		
		tv.setPower(false);
		tv.setVolume(false);
		tv.setVolume(false);
		tv.setVolume(false);
		
		tv.status();
	}

}
