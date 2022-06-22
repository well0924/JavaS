package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample17 {
	public static void main(String[] args) {
		String[]animals = {"토끼","호랑이","고양이","강아지","고양이","고양이"};
		System.out.println("***기본 배열 출력");
		System.out.println(Arrays.deepToString(animals));
		
		System.out.println("List로 변환후 출력");
		List<String>ani1 = Arrays.stream(animals).toList();
		System.out.println(ani1.toString());
		
		System.out.println("set으로 변환후 출력");
		Set<String>ani2 =ani1.stream().collect(Collectors.toSet());
		System.out.println(ani2.toString());
		
		System.out.println("TreeSet으로 변환후 출력");
		TreeSet<String>ani3 = ani1.stream().collect(Collectors.toCollection(TreeSet::new));
		System.out.println(ani3.toString());
		
		System.out.println("HashMap으로 변환후 출력");
		Map<String,Integer>ani4 = 
					ani1.stream().collect(
							Collectors.toMap(Function.identity(), String::length,(x1,x2)-> x1+x2));
		System.out.println(ani4.toString());
	}
}
