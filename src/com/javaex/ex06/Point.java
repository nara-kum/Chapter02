package com.javaex.ex06;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	
	//메소드gs
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	//메소드 일반
	public void draw() {
		System.out.println("[x="+x+", y="+y+"]을 그렸습니다.");
	}
	
}
