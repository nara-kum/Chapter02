package com.javaex.ex23;

public class ShapeApp {

	public static void main(String[] args) {
		
//		도형을 하나로 관리하기 위해
		Shape[] sArray = new Shape[4];
		
		//섞어쓰기
		Shape t = new Triangle("빨강","빨강",5,3);
		Shape r = new Rectangle("노랑","노랑",10,10);
		Shape c = new Circle("파랑","파랑",5);
		
		sArray[0]=t;
		sArray[1]=r;
		sArray[2]=c;

		//포인트 추가
		Shape p = new Point(5,5);
		sArray[3]=p;
		
		//그리기
//		for(int i=0; i<sArray.length;i++) {
//			sArray[i].draw();
//		}
		
		//넓이
		for(int i=0; i<sArray.length; i++) {
			sArray[i].area(); //포인트는 면적을 구할 수 없는데 임의로 넣은 값이 출력됨
		}
		
		sArray[3].setFillColor("빨강");
	}

}
