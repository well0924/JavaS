package com.java.Study.Chap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Sample01 {
	public static void main(String[] args) {
		var list = Arrays.asList(1,2,3,4,5,2,4);
		System.out.println(list.toString());
		//hashset을 활용해서 중복을 제거
		var<Integer> list2 = new ArrayList(new HashSet<Integer>(list));
		list2.forEach(System.out::println);
		//스트림의 distinct를 활용해서 중복을 제거
		list.stream().distinct().forEach(System.out::print);
	}
}
