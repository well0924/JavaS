package com.java.Study.Chap17;

import java.util.stream.IntStream;

public class Sample08 {
	public static void main(String[] args) {
		//range
		IntStream.range(12, 18).forEach(System.out::println);
	}
}
