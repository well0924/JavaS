package com.java.Study.Chap08.Sample08;

public class Data {
	String name; 
	int age;
	
	public Data() {
		System.out.println("Data를 초기화합니다.");
		this.age = 22;
		this.name = "빵형";
	}
	
	public Data(String name ,int age) {
		System.out.println("Data를 초기화합니다.");
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Data [name="+name+", age="+age+"]";
	}
}
