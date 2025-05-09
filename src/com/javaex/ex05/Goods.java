package com.javaex.ex05;

//클래스를 만든다
public class Goods {
	
	//필드(추상화)
	private String name;
	private int price;
	
	
	//생성자
	
	//메소드(함수)
	//name 등록
	public void setName(String name) {
		this.name = name;
	}
	
	//name 읽어오기
	public String getName() {
		return name;
	}
	
	//price 등록
	public void setPrice(int price) {
		this.price = price;
	}
	
	//price 읽어오기
	public int getPrice() {
		return price;
	}

	//정보출력
	public void showInfo() {
		System.out.println("================");
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("================");
	}
	
	
}
