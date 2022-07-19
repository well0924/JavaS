package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sample20 {
	public static void main(String[] args) {
		//CollectingAndThen():다른 자료형으로 반환하여 반환한 후에 추가 작업을 할 때 사용.
		//collectingAndThen(Collectior<T,A,R> downstream,Function<R,RR>finisher)
		//에서 downstream 인자에 list나 set등으로 변환한뒤에 finisher인자에 최종작업을 수행한다.
		List<String>locals = Arrays.asList("서울","대전","대구","광주","부산","제주");
		
		List<String>reversedLocals = locals
									.stream()
									.collect(Collectors
										.collectingAndThen(
												Collectors.toList(),//리스트자료형 
												city ->{
													//locals을 역방향으로 변환 
													Collections.reverse(locals);
													//변환된 city를 스트림으로 반환.
													return city.stream();
													
									}))
									//최종연산은 list형으로 
									.collect(Collectors.toList());
		
		System.out.println(locals.toString());
		System.out.println(reversedLocals.toString());
	}
}
