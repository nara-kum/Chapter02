package com.javaex.ex17;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point[] point = new Point[3];
		
		Point point01= new Point(5,5);
		Point point02= new Point(10,10);
		Point point03= new Point(20,20);
		
		point[0]=point01;
		point[1]=point02;
		point[2]=point03;
		
		for(int i=0; i<point.length; i++) {
			point[i].draw();
		}
		
//		point[0].draw();
//		point[1].draw();
//		point[2].draw();
		
	}

}
