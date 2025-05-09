package com.javaex.ex01;

public class GoodsApp {
	
	//시나리오
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "nickon";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		Goods cup = new Goods();
		cup.name = "mug";
		cup.price = 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		Goods computer = new Goods();
		computer.name = "LgGram";
		computer.price = 1000000;

		System.out.println(computer.name);
		System.out.println(computer.price);
		
		System.out.println(camera.price);
	}
}
