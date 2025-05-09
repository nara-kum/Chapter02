package com.javaex.ex11;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메소드-gs
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//메소드-일반
	public void draw() {
		System.out.println("["+x+","+y+"]"+"에 점이 그려집니다.");
	}

	public void draw(boolean action) {
		if(action==true) {
			System.out.println("["+x+","+y+"]"+"에 점이 그려집니다.");
		}else {
			System.out.println("["+x+","+y+"]"+"점이 지워집니다.");
		}
		
	}

	public void remove() {
		System.out.println("["+x+","+y+"]"+"점이 지워집니다.");
	}
}
