package com.javaex.ex02;

//class(틀)
public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	
	/*동작의 개념(함수)*/
	//메소드
	//name에 값 입력
	public void setName(String n){
		//n은 니콘
		//위에 있는 name에 입력
		name = n;
		//return 필요없는 경우(void)
		//return 필요 있는 경우 리턴값의 자료형 기입
	}
	//name에 값 읽어오기
	public String getName() {
		//return 필요 있는 경우 리턴값의 자료형 기입
		return name;
	}
	
	//price 입력
	public void setPrice(int p) {
		price = p;
	}
	//price 읽어오기
	public int getPrice() {
		return price;
	}
	
}
