package com.java.Study.Chap08;

interface Greeting{
	public String sayHello(String name);
}

public class Sample13 {
	public static void main(String[] args) {
		Greeting greeting  = new Greeting() {
			
			@Override
			public String sayHello(String name) {
				// TODO Auto-generated method stub
				return name+"μλ!";
			}
		};
		
		System.out.println(greeting.sayHello("λΉ΅ν"));
	}
}
