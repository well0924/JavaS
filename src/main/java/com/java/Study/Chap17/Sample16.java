package com.java.Study.Chap17;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Sample16 {
	public static void main(String[] args) {
		int sum1 = 0;
		OptionalInt sum2;
		
		sum1 = IntStream.range(7, 10).reduce(6, Integer :: sum);
		System.out.println(sum1);
		
		sum2 = IntStream.range(6, 10).reduce(Integer::sum);
		System.out.println(sum2.getAsInt());
		
		OptionalInt sum3 = OptionalInt.empty();
		if(sum3.isEmpty()) {
			System.out.println("sum3은 값이 없어요.");
		}
		System.out.println("OptionalInt는 OptionalInt.of(value)로 값을 넣습니다.");
		sum3 = OptionalInt.of(6);
		
		if(sum3.isPresent()) {//값이 있을 경우에는 true를 반환하고 없으면 false를 반환한다.
			System.out.println(sum3.getAsInt());
			System.out.println(sum3);
		}else {
			System.out.println("값없다.");
			
			IntStream.rangeClosed(6, 10)
			.reduce(Integer::sum)
			.ifPresent(System.out::println);
		}
	}
}
