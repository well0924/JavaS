package com.java.Study.Chap08.Sample09;

public class Data {
	String name; 
	int age;
	
	public Data() {
		this("무명",0);
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
