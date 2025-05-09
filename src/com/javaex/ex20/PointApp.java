package com.javaex.ex20;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p = new Point(10,10);
		p.showInfo();
		
		ColorPoint cp1 = new ColorPoint("red");
		
		
		ColorPoint cp2 = new ColorPoint(4,4,"red");
		cp1.setX(4);
		cp1.setY(4);
		System.out.println(cp1.getX());
		System.out.println(cp1.getY());
		System.out.println(cp1.getColor());
		
		cp2.showInfo();
		
	}

}
