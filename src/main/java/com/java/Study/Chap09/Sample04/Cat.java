package com.java.Study.Chap09.Sample04;

public class Cat extends Pet{

	@Override
	public void run(String name) {
		System.out.println(name+"는 조용하게 뜁니다.");
	}

	public Cat(boolean wing, int legCount) {
		super(wing, legCount);
	}
}
