package com.java.Study.Chap10;

public class Sample07 {
	public static void main(String[] args) {
		Sample06<Integer>age = new Sample06<Integer>();
		Sample06<String>name = new Sample06<String>();
		
		age.setT(18);
		name.setT("빵형");
		
		int PersonAge = age.getT();
		String PersonName = name.getT();
		
		System.out.println(PersonName+"은 "+PersonAge+"살");
	}
}
