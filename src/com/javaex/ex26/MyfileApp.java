package com.javaex.ex26;

import java.io.IOException;

public class MyfileApp {
	public static void main(String[] args) {
		
		Myfile mf= new Myfile();
//		String str = mf.read2("C:\\javaStudy\\java\\노라.txt");
//		System.out.println(str);

		try {
			mf.read3("C:\\javaStudy\\java\\노라.txt");
			
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
		
		
	}

}
