package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample33 {
	public static void main(String[] args) {
		List<FreeBoard>list = Arrays
				.asList(
						new FreeBoard(1,"test1","content1"),
						new FreeBoard(2,"test2","content2"),
						new FreeBoard(3,"test3","content3"));
		
		long count1 = list.stream().collect(Collectors.counting());
		
		System.out.println(count1);
		
		long count2 = list.stream().count();
		System.out.println(count2);
		
		
	}
}
