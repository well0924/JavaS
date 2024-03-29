package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample29 {
	public static void main(String[] args) {
		List<String>list = Arrays
				.asList("출근","출근","지각","출근","출근",
						"지각","출근","출근","출근","출근",
						"지각","지각","결근","출근","출근",
						"지각","출근","출근","출근","출근");
		
		Map<String, Long>info = list.
								stream().
								collect(
										Collectors.
										groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(info);
	}
}
