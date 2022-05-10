package com.java.Study.Chap08;

public class Sample18 {
	public static void main(String[] args) {
		Student[] students  = new Student[3];
		students[0] = new Student("빵형", 21, 1);
		students[1] = new Student("빵형친구", 20, 3);
		students[2] = new Student("빵친구", 21, 1);
		
		//향상된 for문
		for(Student student : students) {
			System.out.println(student.toString());
		}
		//for문으로 출력
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].toString());
		}
	}
}
