package com.java.Study.Chap17;

import java.util.stream.Stream;

public class Sample07 {
	public static void main(String[] args) {
		
		String[]strArr = null;
		Stream<Object>stream = Stream.of(strArr == null ? Stream.empty() : strArr);
	}
}
