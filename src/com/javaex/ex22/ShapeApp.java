package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
//		Shape sh = new Shape("빨강","보라");
//		System.out.println(sh.toString());
		
		Triangle t01 = new Triangle("주황","검정",10,10);
//		System.out.println(tri.toString());
//		t01.draw();
		
		Rectangle r01 = new Rectangle("보라","빨강",5,10);
//		System.out.println(rect.toString());
//		r01.draw();
		
		Circle c01 = new Circle("파랑","검정",5);
//		System.out.println(cc.toString());
//		c01.draw();
		
		//섞어쓰기~~ 하나로 관리하려는 목적
		Shape st = new Triangle("초록","초록",100,100);
		st.getFillColor();
		
		Shape sc = new Circle("빨강","빨강",50);
		sc.getLineColor();
		
		Shape sr = new Rectangle("노랑","노랑",33,33);
		
		//하나의 배열에 모든 도형을 담는다 --> 자식쪽의 기능을 사용할 수 없다
		//모든 도형을 담을 수 있는 배열
		Shape[] sArray = new Shape[3];
		
//		업캐스팅
//		sArray[0] = t01;  //자식 클래스를 넣을경우 자동을 부모클래스로 변환
		sArray[0] = st;
		sArray[1] = sc;
		sArray[2] = sr;
		
		//전체 draw() 출력
		for(int i=0; i<sArray.length;i++) {
			sArray[i].draw();
		}
		
//		다운캐스팅
		//첫번째 방의(자식클래스값) 가로값을 읽고싶어
		System.out.println(((Triangle)sArray[0]).getWidth());
		System.out.println(((Rectangle)sArray[2]).getHeight());
		System.out.println(((Circle)sArray[1]).getRadius());
		
		
		
	}

}
