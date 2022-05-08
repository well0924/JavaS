package com.java.Study.Chap08;

public class Sample01 {
	
		//필드 영역 시작
		String name = "맴버변수"; // 접근제어자가 생략된 맴버변수
		private int age; //접근제어자가 있는 맴버변수
//		var age  =10; //지역 변수인 타입추론변수는 사용할 수 없음.
		
		//메서드 영역 시작
		public void sayHello() {
			var friends = "친구야";
			System.out.println(friends);
		}
		
		public void sayHello(String friends) {
			System.out.println(friends);
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name; // 필드와 매개변수가 동일할 때 this로 구분
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		//생성자 영역 시작
		public Sample01() {
			
		}
}
