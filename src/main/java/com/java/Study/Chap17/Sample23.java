package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.RequiredArgsConstructor;

public class Sample23 {
	public static void main(String[] args) {
		List<Score>scores = Arrays.asList(
				new Score("빵형",62,71,81),
				new Score("타노스",61,71,82),
				new Score("상도",100,100,61));
		
		double averageMat = scores
				.stream()
				.collect(
						Collectors
						.averagingInt(Score::getMat));
		
		System.out.println(averageMat);
	}
}

@Data
@RequiredArgsConstructor
class Score{
	private final String name;
	private final int kor;
	private final int eng;
	private final int mat;
	private String msg;
}
