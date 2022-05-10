package com.java.Study.Chap09;

public class Sample02 {
	public static void main(String[] args) {
		Car car = new ElectricCar("red","Hyundai");
		car.printInfo();
		car.setColor("Gray");
		car.printInfo();
	}
}
