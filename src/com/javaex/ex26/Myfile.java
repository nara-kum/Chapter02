package com.javaex.ex26;

import java.io.IOException;

//구글
//하드디스크에 있는 파일을 읽는 클래스
public class Myfile {
	
	//필드
	
	//생성자
	
	//메소드-gs
	
	//메소드일반
	public String read(String path) {
		//path의 파일을 찾는다 C:\javaStudy\java\노래.txt
		//파일의 내용을 읽어서 변수에 담는다
		
		String result = "학교종이 땡땡땡";
		
		return result;
	}

	//파일이 없을경우 예외처리
	public String read2(String path) {
		
		try {
			//path의 파일을 찾는다 C:\javaStudy\java\노래.txt
			//파일의 내용을 읽어서 변수에 담는다
			//정상이면 진행
			
			//예외발생
			throw new IOException(); //파일이 없는 상황을 강제로 만듦
			
		} catch (IOException e) {
			System.out.println("no file");
		}
		
		return "";
	}
	
	//파일이 없을경우 예외처리 하지 않고 알려만 줌
	public void read3(String path) throws IOException {
	
		throw new IOException(); //파일이 없는 상황을 강제로 만듦
		
	}

}
