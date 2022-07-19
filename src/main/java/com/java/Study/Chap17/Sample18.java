package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample18 {
	public static void main(String[] args) {
		String[][] level = {{"빵형","초급"},{"타노스","중급"},{"상도","고급"}};
		//배열이 중복된 값이 있는 경우 에러가 발생
		//중복된 값이 있는 경우에는 mergeFunction을 넣어야한다.
//		String[][] level= {{"빵형","초급"},{"빵형","중급"},{"타노스","중급"},{"상도","고급"}};

		Map map = Arrays
				.stream(level)
				.collect(Collectors.toMap(x ->x[0],x->x[1]));
		System.out.println(map.toString());
	}
}
