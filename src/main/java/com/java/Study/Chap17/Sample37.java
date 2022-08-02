package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;

public class Sample37 {
	public static void main(String[] args) {
		List<Score>scores = Arrays.asList(new Score("상도",60,78,100),
				new Score("빵형",60,75,67),
				new Score("타노스",60,78,95));
		
		boolean result1 = scores.stream().anyMatch(x->x.getMat() > 39);
		System.out.println("수학 과락이 아닌 사람이 있나요?"+result1);
		
		boolean result2 = scores.stream().anyMatch(x->x.getKor()>39);
		System.out.println("국어 과락은 있나요?"+result2);
		
		boolean result3 = scores.stream().anyMatch(x->x.getEng() > 39);
		System.out.println("영어 과락은 있는가요?"+result3);
	}
}
