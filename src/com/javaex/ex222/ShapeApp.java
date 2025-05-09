package com.javaex.ex222;

public class ShapeApp {

	public static void main(String[] args) {
		
//		Triangle t01 = new Triangle("빨강","보라",10,10);
//		System.out.println(t01.toString());
//		t01.draw();
//		
//		Rectangle r01 = new Rectangle("검정","파랑",15,20);
//		System.out.println(r01.toString());
//		r01.draw();
//		
//		Circle c01 = new Circle("초록","주황",5);
//		System.out.println(c01.toString());
//		c01.draw();
		
		Shape st = new Triangle("빨강","보라",10,10);
		Shape sr = new Rectangle("검정","파랑",15,20);
		Shape sc = new Circle("초록","주황",5);
		
		Shape[] sArray = new Shape[3];
		
		sArray[0] = st;
		sArray[1] = sr;
		sArray[2] = sc;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		
	}

}
