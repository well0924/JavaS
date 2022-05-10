package com.java.Study.Chap08;

public class Sample17 {
	public static void main(String[] args) {
		Student st = new Student("빵형", 21, 1);
		System.out.println(st.toString());
	}
}

class Student{
	String name;
	int age;
	int grade;
	
	public Student(String name, int age, int grade) {
		this.age = age;
		this.grade = grade;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [name="+name+", age="+age+", grade="+grade+" ]";
	}
	
	
}
