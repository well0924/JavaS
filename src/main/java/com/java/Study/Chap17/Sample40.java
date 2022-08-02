package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.List;

public class Sample40 {
	public static void main(String[] args) {
		List<Score>scores = Arrays
				.asList(
						new Score("test1",32,56,45),
						new Score("test2",84,65,78),
						new Score("test3",41,40,91));
		
		scores.stream().map(x->{
			if(x.getKor() <40 || x.getEng() <40 || x.getMat() <40) {
				x.setMsg("과락입니다.");
			}else if((x.getKor() + x.getEng() + x.getMat())/3 <60) {
				x.setMsg("불합격입니다.");
			}else {
				x.setMsg("합격입니다.");
			}
			return x;
		
		}).forEach(System.out::println);
	}
}
