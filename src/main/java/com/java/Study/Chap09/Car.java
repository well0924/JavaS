package com.java.Study.Chap09;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car {
	protected String color;
	protected String manufacturer;
	
	public abstract String fillUp();//
	
	public void printInfo() {
		System.out.println("이 차의 색은"+this.color);
		System.out.println("이차는"+fillUp());
		System.out.println("이 차의 제조사는"+this.manufacturer);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
}
