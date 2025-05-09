package com.javaex.ex08;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods();		
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();

		Goods cup = new Goods("머그",2000);
		cup.showInfo();

		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(1000000);
		computer.showInfo();
		
	}

}
