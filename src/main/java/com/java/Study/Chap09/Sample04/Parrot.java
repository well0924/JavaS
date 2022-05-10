package com.java.Study.Chap09.Sample04;

public class Parrot extends Pet{

	public Parrot(boolean wing, int legCount) {
		super(wing, legCount);
	}

	@Override
	public void run(String name) {
		System.out.println(name+"는 두발로 뜁니다.");
	}
	
	public void fly(String name) {
		System.out.println(name+"는 뛰지 않고 날라갑니다.");
	}
}
