package com.javaex.ex14;

public class Goods {
	// 필드
	private String name;
	private int price;
	private static int count;

	// 생성자
	public Goods() {
		count = count+1;
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		count = count+1;
	}

	// 메소드
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	

	public void showInfo() {
		System.out.println("이름:" + name + " 가격:" + price);
	}

}
