package com.java.Study.Chap08;

public class Sample11 {
	
	void localMathod() {
		int age =23; 
		class LocalClass{
			public void howOldAreYou() {
				System.out.println("๋นตํ์"+age+"์ด");
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
