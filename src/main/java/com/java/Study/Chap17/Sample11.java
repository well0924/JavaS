package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sample11 {
	public static void main(String[] args) {
		//스트림을 다시 배열로 만드는 메서드
		//Stream을 활용해서 1부터 100까지의 배열 출력
		int[]numbers = IntStream.range(1, 100).toArray();
		//Stream을 활용해서 배열 출력
		Arrays.stream(numbers).forEach(System.out::println);
	}
}
