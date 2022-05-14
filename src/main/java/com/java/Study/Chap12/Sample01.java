package com.java.Study.Chap12;

public class Sample01 {
	public static void main(String[] args) {
		final int RED = 1;
		final int BLUE = 2;
		final int ORANGE = 3;
		
		final int SMALL = 1;
		final int MEDIUM =2;
		final int LARGE = 3;
		
		int inputColor = RED;
		
		System.out.println(inputColor ==RED ? "Red":"Not Red");
		System.out.println(inputColor ==SMALL ? "Red":"Not Red");
	}
}
