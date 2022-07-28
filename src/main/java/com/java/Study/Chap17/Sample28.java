package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample28 {
	public static void main(String[] args) {
		List<Score>scores = Arrays.asList(
				new Score("빵형",61,71,81),
				new Score("상도",62,72,89),
				new Score("타노스",89,100,41));
		
		Map<String,List<Score>>result = 
				scores.
				stream().
				collect(Collectors.groupingBy(s ->{
					return (s.getMat() >90) ? "A" : 
								(s.getMat() > 80) ? "B" :
									(s.getMat()>70) ? "C" :
										(s.getMat() >60) ? "D" : "F";
				}));
		result.keySet().forEach(key -> {
			System.out.println("수학"+key+"학점");
			List<Score> score = result.get(key);
			score.
			stream().
			forEach(s -> System.out.println(s.getName()));
		});
	}
}
