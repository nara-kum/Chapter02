package com.javaex.ex08;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {//기본생성자
//		System.out.println("생성자 작동!");
//		System.out.println("--------------");
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메소드
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("--------------");
	}
	

}
