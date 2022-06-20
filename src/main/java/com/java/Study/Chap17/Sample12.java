package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.stream.Stream;

public class Sample12 {
	public static void main(String[] args) {
		Stream.of("빵형 ","상도 ","타노스").forEach(name-> System.out.print(name));
		System.out.println();
		Arrays.asList("빵형 ","상도 ","타노스").stream().forEach(name->System.out.print(name));
	}
}
