package com.java.Study.Chap09;

public class ElectricCar extends Car{
	
	public ElectricCar(String color, String manufacturer) {
		super(color, manufacturer);
	}

	public String fillUp() {
		return "전기를 충전합니다";
	}
	
}
