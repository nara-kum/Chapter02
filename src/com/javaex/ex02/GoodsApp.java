package com.javaex.ex02;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		
		//이름 저장
//		camera.name = "nickon";
		camera.setName("nickon");
		
		String name = camera.getName();
		System.out.println(name);
		
		//가격 저장
//		camera.price = 400000;
		camera.setPrice(400000);
		
		//가격 읽어오기
		int price = camera.getPrice();
		System.out.println(price);
		
	}

}
