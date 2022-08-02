package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;

public class Sample38 {
	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(4,6,2,8,10);
		
		list.stream().findAny().ifPresent(System.out::println);
		
		list.stream().findFirst().ifPresent(System.out::println);
		
		list
		.parallelStream().
		filter(x->x > 2).//중간 연산을 통해서 2보다 큰 수만 요소로 걸러낸다.
		findAny().//순서와 상관없이 요소를 찾는다.
		ifPresent(System.out::println);
		
		list
		.stream()
		.filter(x->x > 2)
		.findFirst()//요소 중에서 첫번째것만 찾는다.
		.ifPresent(System.out::println);
		
		list
		.stream()
		.filter(x->x > 2)
		.findFirst()
		.ifPresent(System.out::println);
		
		list.parallelStream()
		.filter(x->x>2)
		.findFirst()
		.ifPresent(System.out::println);
		
	}
}
