package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sample34 {
	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(10,4,5,67,45,99);
		Integer minNumber = list.stream().min(Integer::compare).get();
		System.out.println("최솟값:"+minNumber);
		
		List<Score>scorenum = Arrays
				.asList(
						new Score("test1",54,67,88),
						new Score("test2",84,97,48),
						new Score("test3",78,100,90));
		
		scorenum
		.stream()
		.collect(Collectors
				.minBy(Comparator
						.comparing(Score::getMat))).ifPresent(System.out::println);
		
		scorenum
		.stream()
		.min(Comparator
				.comparing(Score::getMat))
		.ifPresent(System.out::println);
		
		Score maxMathScore = scorenum
				.stream()
				.max(Comparator
						.comparing(Score::getMat))
				.get();
		
		System.out.println("수학점수가 최고점수인 사람:"+maxMathScore);
	}
}
