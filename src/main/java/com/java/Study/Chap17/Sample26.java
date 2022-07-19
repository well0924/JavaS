package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample26 {
	public static void main(String[] args) {
		List<String>list = Arrays.asList("py","java","c");
		
		String a = list.stream().collect(Collectors.joining());
		System.out.println(a);
		
		String b = list.stream().collect(Collectors.joining(","));
		System.out.println(b);
	}
}
