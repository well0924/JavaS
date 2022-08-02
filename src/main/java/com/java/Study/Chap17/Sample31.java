package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sample31 {
	public static void main(String[] args) {
		String[]animals = {"토끼","호랑이","고양이","강아지","고양이","고양이"};
		System.out.println("기본 배열 출력");
		System.out.println(Arrays.deepToString(animals));
		
		System.out.println("List로 변환 후 출력");
		List<String>test1 = Arrays.stream(animals).collect(Collectors.toList());
		System.out.println(test1.toString());
		
		System.out.println("set으로 변환 후 list로 출력->중복제거");
		Set<String>test2 = test1.stream().collect(Collectors.toSet());
		
		List<String>test3 = test2.stream().collect(Collectors.toList());
		System.out.println(test3.toString());
		
		System.out.println("distinct()로 중복 제거 후 list로 변환");
		List<String>test4 = Arrays.stream(animals).distinct().collect(Collectors.toList());
		System.out.println(test4.toString());
		
	}
}
