package com.javaex.ex04;

//클래스를 만든다
public class Goods {
	
	//필드(추상화)
	private String name;
	private int price;
	
	
	//생성자
	
	//메소드(함수)
	//name 등록
	public void setName(String n) {
		name = n;
	}
	
	//name 읽어오기
	public String getName() {
		return name;
	}
	
	//price 등록
	public void setPrice(int p) {
		price = p;
	}
	
	//price 읽어오기
	public int getPrice() {
		return price;
	}

}
