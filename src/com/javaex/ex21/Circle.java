package com.javaex.ex21;

public class Circle {
	//필드
	private String lineColor;
	private String fillColor;
	private int radius;
	
	//생성자
	public Circle() {
		super();
	}
	public Circle(String lineColor, String fillColor, int radius) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.radius = radius;
	}
	
	//메소드-gs
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public int getRadios() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Circle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", radios=" + radius + "]";
	}
	
	public void draw() {
		System.out.println("======원이 그려집니다=====");
		System.out.println("반지름:"+radius);
		System.out.println("선색:"+lineColor);
		System.out.println("면색:"+fillColor);
		System.out.println("======================");
	}
	
}
