package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sample25 {
	public static void main(String[] args) {
		List<Score>list =Arrays.asList(
				new Score("빵형",61,71,100),
				new Score("타노스",65,90,60),
				new Score("상도",89,100,91));
		
		System.out.println("국어점수가 최저점인 학생");
		list
		.stream()
		.collect(
				Collectors
				.minBy(
						Comparator
						.comparing(Score::getKor)
						)
				)
		.ifPresent(System.out::println);
		
		System.out.println("영어점수가 최고점인 학생");
		list
		.stream()
		.collect(
				Collectors
				.maxBy(
						Comparator
						.comparing(Score::getEng)
						)
				)
		.ifPresent(System.out::println);
		
		System.out.println("이름순으로 제일 빠른학생");
		list
		.stream()
		.collect(
				Collectors
				.minBy(
						Comparator
						.comparing(Score::getName)
						)
				)
		.ifPresent(System.out::println);
		
		System.out.println("이름순으로 제일 느린 학생");
		list
		.stream()
		.collect(
				Collectors
				.maxBy(
						Comparator
						.comparing(Score::getName)
						)
				)
		.ifPresent(System.out::println);
	}
}
