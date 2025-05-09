package com.javaex.ex19;

public class PersonApp {

	public static void main(String[] args) {
		
		//Student의 extends Person이 없을경우 가져다 쓸 수 없다 
//		Student s01 = new Student();
//		s01.setSchoolName("제주고등학교");
//		s01.setName("이효리");
//		s01.setAge(20);
		
		//부모 생성 먼저하고 자식 생성
		Student s02 = new Student();
		s02.setSchoolName("서울고등학교");
		s02.setName("정우성");
		s02.setAge(22);

		System.out.println("---------------------------");
		
		Student s03 = new Student("이효리", 20, "제주");

		System.out.println("---------------------------");
		
		System.out.println(s03.getSchoolName());
		System.out.println(s03.getName());
		System.out.println(s03.getAge());
		
		s03.showInfo();
		
	}

}
