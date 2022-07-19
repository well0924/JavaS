package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample22 {
	public static void main(String[] args) {

		List<Integer>list = Arrays.asList(100,100,61,85,91);
		Double result = list.stream().collect(Collectors.averagingInt(i->i));
		System.out.println(result);
		
		List<Double>list1 = Arrays.asList(100.0,100.8,61.9,85.2,91.7);
		double result1 = list1.stream().collect(Collectors.averagingDouble(i->i));
		System.out.println(result1);
		
		List<Long>list3 = Arrays.asList(100L,100L,61L,85L,91L);
		Double result3 = list3.stream().collect(Collectors.averagingLong(i->i));
		System.out.println(result3);
	}
}
