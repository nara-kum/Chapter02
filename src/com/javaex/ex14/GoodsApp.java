package com.javaex.ex14;

public class GoodsApp {
	//static 변수조사 -->static 영역에 올림
	//static메모리에서 main() 메소드를 실행한다
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
//		camera.showInfo();
		
		Goods cup = new Goods("머그",20000);
//		cup.showInfo();
		
		System.out.println(camera.getCount());

	}

}
