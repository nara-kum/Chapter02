package com.javaex.ex25;

public class Ex03 {

	public static void main(String[] args) {
		
		Point p01 = new Point();
		p01.setX(5);
		p01.setY(10);
		
		try {
			Point p02 = null;
			p02.setX(100);
			
		} catch (NullPointerException e) {
//			System.out.println(e.toString());
			System.out.println("포인트가 생성되지 못했습니다");
		}
		

	}

}
