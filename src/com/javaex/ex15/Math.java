package com.javaex.ex15;

public class Math {
	
	//필드(생략가능)
//	private int x;
//	private int y;
	private static final double PI = 3.141592;
	
	//생성자(필드가 없어서 다른 생성자 생성 불가하므로 생략)
//	public Math() {메모리 올리기}
	
	//메소드-gs
	
	//메소드-일반
	public static int plus(int a, int b) {
		return a+b;
	}
	public static double plus(int a, double b) {
		return a+b;
	}
	public static double plus(double a, int b) {
		return a+b;
	}
	public static double plus(double a, double b) {
		return a+b;
	}
	public static double circleArea(int r) {
		double result = PI*r*r;
		return result;
	}

}
