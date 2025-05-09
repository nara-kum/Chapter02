package com.javaex.ex13;

public class Tv {
	
	//필드
	private boolean power;
	private int channel;
	private int volume;
	
	//생성자
	public Tv() {}
	public Tv(boolean power, int channel, int volume) {
		this.power = false;
		this.channel = 7;
		this.volume = 20;
	}
	
	//메소드 -gs
	public boolean getPower() {
		return power;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	//메소드 - 일반
	//파워 on/off
	public void setPower(boolean on) {
		if(on==true) {
			power = true;
		}else {
			power = false;
		}
	}
	
	//채널 최대/최소
	public void setChannel(int channel) {
		if(power==true) {
			if(channel>=255) {
				channel = 255;
			}else if(channel<=1) {
				channel = 1;
			}else {
				this.channel = channel;
			}
		}
	}
	//채널 up/down
	public void setChannel(boolean up) {
		if(power==true) {
			if(up==true) {
				if(channel>=255) {
					channel = 255;
				}else {
					channel = channel +1;
				}
			}else {
				if(channel<=1) {
					channel = 1;
				}else {
					channel = channel -1;
				}
			}
		}
	}
	
	//볼륨 최대/최소
	public void setVolume(int volume) {
		if(power==true) {
			if(volume>=100) {
				volume = 100;
			}else if(volume<=0) {
				volume = 0;
			}else {
				this.volume = volume;
			}
		}
	}
	//볼륨up/down
	public void setVolume(boolean up) {
		if(power==true) {
			if(up==true) {
				if(volume>=100) {
					volume = 100;
				}else {
					volume = volume +1;
				}
			}else {
				if(volume<=0) {
					volume = 0;
				}else {
					volume = volume -1;
				}
			}
		}
	}
	
	//tv정보 출력
	public void status() {
		System.out.println("power:"+power+"  "+"channel:"+channel+"  "+"volume:"+volume);
	}
	
	
	
	
	
	
	
	
}
