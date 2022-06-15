package com.java.Study.Chap17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class Sample05 {
	public static void main(String[] args) {
		List list1 = new ArrayList<String>();
		list1.add("dog");
		list1.add("dog");
		list1.add("cat");
		list1.add("cat");
		
		HashSet list2 = new HashSet<Integer>();
		list2.add(3);
		list2.add(3);
		list2.add(2);
		list2.add(2);
		list2.add(6);
		list2.add(6);
		
		Stream<String>arrStrm1 = list1.stream();
		Stream<Integer>arrStrm2 = list2.stream();
		
		arrStrm1.forEach(System.out::println);
		arrStrm2.forEach(System.out::println);
		
		list1.stream().forEach(System.out::println);
		list2.stream().forEach(System.out::println);
	}
}
