package com.java.Study.Chap18;

import java.util.stream.IntStream;

public class Sample04 {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 5).forEach(System.out::println);
		
		System.out.println(1/0);
		IntStream.range(1, 50000).forEach(System.out::println);
	}
}
