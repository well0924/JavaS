package com.java.Study.Chap10;

public class Sample05 {
	public static void main(String[] args) {
		Sample04 age = new Sample04();
		Sample04 name = new Sample04();
		
		age.setA(18);
		name.setA("๋นตํ");
		
		int PersonAge = (int)age.getA();
		String PersonName = (String)name.getA();
		
		System.out.println(PersonName+"์ "+PersonAge+"์ด");
	}
}
