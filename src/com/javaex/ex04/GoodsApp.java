package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		
		//메모리에 올리고
		Goods camera =  new Goods();
		Goods cup =  new Goods();
		Goods computer =  new Goods();
		
		//니콘세팅
		camera.setName("nickon");
		camera.setPrice(400000);
		
		//머그컵세팅
		cup.setName("mug");
		cup.setPrice(5000);
		
		//LG그램셋팅
		computer.setName("LGgram");
		computer.setPrice(1000000);
		
		
		//니콘출력
		String name01 = camera.getName();
		int price01 = camera.getPrice();
		System.out.println("이름 : " + name01);
		System.out.println("가격 : " + price01);
		
		//머그컵출력
		String name02 = cup.getName();
		int price02 = cup.getPrice();
		System.out.println("이름 : " + name02);
		System.out.println("가격 : " + price02);
		
		//LG그램출력
		String name03 = computer.getName();
		int price03 = computer.getPrice();
		System.out.println("이름 : " + name03);
		System.out.println("가격 : " + price03);
		

	}

}
