package com.java.Study.Chap17;

import java.util.stream.IntStream;

public class Sample36 {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100).average().ifPresent(System.out::println);
		
		double avg= IntStream.
				rangeClosed(1, 100).
				average().
				getAsDouble();//int형을 double형으로 바꾸기.
		System.out.println(avg);
	}
}
