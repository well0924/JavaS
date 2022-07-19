package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample19 {
	public static void main(String[] args) {
		String[][] level= {{"빵형","초급"},{"빵형","중급"},{"타노스","중급"},{"상도","고급"}};
		//중복된 값이 있는 경우 mergeFunction을 넣는다.
		Map map = Arrays
				.stream(level)
				.collect(Collectors
						.toMap(x->x[0],x->x[1],(x,y)-> x+","+y));
		
		System.out.println(map.toString());
	}
}
