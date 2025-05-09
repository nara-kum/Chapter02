package com.javaex.ex20;

public class ColorPoint extends Point {
	
	//필드
	private String color;


	//생성자
	public ColorPoint() {}
	
	public ColorPoint(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	//메소드-gs
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//메소드-일반
	public void showInfo() {
//		System.out.println(color+"색");
		System.out.println("점 ["+getX()+","+y+"] 에 "+color+"색으로 그려집니다.");
	}
}
