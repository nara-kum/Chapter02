package com.javaex.ex16;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		//Goods를 관리할 배열 3칸을 만든다
		Goods[] goodsArr = new Goods[3];
		
		//상품을 메모리에 올린다
		Goods camera = new Goods("니콘",400000);
		Goods cup = new Goods("머그컵",20000);
		Goods computer = new Goods("LG그램",200000);
		
		//배열에 상품의 !!!주소!!!를 대입한다
		goodsArr[0] = camera;
		goodsArr[1] = cup;
		goodsArr[2] = computer;
		
		//모든상품의 이름을 출력해라
		
		for(int i=0; i<goodsArr.length; i++) {
			System.out.println("이름:"+goodsArr[i].getName()+" 가격:"+goodsArr[i].getPrice());
		}
		
		for(int i=0; i<goodsArr.length; i++) {
			goodsArr[i].showInfo();
		}
	}

}
