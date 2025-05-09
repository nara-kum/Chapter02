package com.javaex.ex11;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point point01 = new Point();
		point01.setX(5);
		point01.setY(10);
		point01.draw();
		
		Point point02 = new Point(10,20);
		point02.draw();
		
		System.out.println("***********************");
		point02.draw();//그린다
		
		point02.draw(true);//그린다
		point02.draw(false);//지운다
		
	}

}
