package com.javaex.ex24;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape[] sArray = new Shape[4];
		
		Drawable[] dArray = new Drawable[4];
		
		Drawable dp = new Point(5,5);
		
//		dp.draw();
//		((Point)dp).getY();
		
		Drawable dt = new Triangle("빨강","빨강",10,20);
//		dt.draw();
//		System.out.println(((Triangle)dt).getHeight());
//		System.out.println(((Triangle)dt).getFillColor());
		
		Drawable dr = new Rectangle("초록","초록",20,200);
		Drawable dc = new Circle("파랑","파랑",15);
		
		//배열에 넣기
		dArray[0] = dt;
		dArray[1] = dr;
		dArray[2] = dc;
		dArray[3] = dp;
		
		//한번에 그리기
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
//		System.out.println(dp instanceof Drawable);
//		System.out.println(dp instanceof Point);
//		System.out.println(dp instanceof Shape);
//		System.out.println(dt instanceof Shape);
		
		//한번에 면적구하기
		for(int i=0; i<dArray.length; i++) {
			
			if(dArray[i] instanceof Shape) {
				((Shape)dArray[i]).area();
			}else {
				System.out.println("면적 구할 수 없음");
			}
			
		}
	}

}
