package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		
		Triangle t01 = new Triangle("검정","주황",5,4);
//		System.out.println(tri.toString());
		t01.draw();
		
		Rectangle r01 = new Rectangle("빨강","보라",10,4);
//		System.out.println(rect.toString());
		r01.draw();

		Circle c01 = new Circle("검정","파랑",10);
//		System.out.println(cc.toString());
		c01.draw();
	}

}
