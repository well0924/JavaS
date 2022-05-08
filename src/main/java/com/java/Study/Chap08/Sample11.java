package com.java.Study.Chap08;

public class Sample11 {
	
	void localMathod() {
		int age =23; 
		class LocalClass{
			public void howOldAreYou() {
				System.out.println("빵형은"+age+"살");
			}
		}
		LocalClass innerClass = new LocalClass();
		innerClass.howOldAreYou();
	}
	public static void main(String[] args) {
		Sample11 outer = new Sample11();
		outer.localMathod();
	}
}
