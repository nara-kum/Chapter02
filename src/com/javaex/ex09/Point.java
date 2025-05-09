package com.javaex.ex09;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메소드
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("["+x+","+y+"]"+"에 그려집니다.");
	}

}
