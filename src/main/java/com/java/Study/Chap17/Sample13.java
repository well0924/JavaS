package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Sample13 {
	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(2,4,6,8);
		//직렬 스트림 forEach()로 출력
		IntStream.range(65, 69).forEach(x->System.out.print((char)x));
		System.out.println();
		//병렬 스트림 forEach()로 출력
		IntStream.range(65, 69).parallel().forEach(x->System.out.print((char)x));
		System.out.println();
		//병렬 스트림 forEachOrdered()로 출력
		IntStream.range(65, 69).parallel().forEachOrdered(x->System.out.print((char)x));
	}
}
