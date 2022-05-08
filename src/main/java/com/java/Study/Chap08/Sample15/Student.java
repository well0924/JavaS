package com.java.Study.Chap08.Sample15;

public class Student {
	static String name;//정적 내부 클래스는 static 멤버변수만 접근이 가능
	
	public Student(String name) {
		this.name = name;
	}
	
	public  static class Score{
		int eng;
		int mat;
		
		public Score(String name) {
			Student.name = name;
		}
		
		public void showInfo() {
			System.out.println("이름:"+name);
			System.out.println("영어:"+eng);
			System.out.println("수학:"+mat);
		}
	}
}
