package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Sample24 {
	public static void main(String[] args) {
		List<FreeBoard> list = Arrays.asList(
				new FreeBoard(1,"test1","hello?"),
				new FreeBoard(1,"test1","hello??"),
				new FreeBoard(1,"test1","hello???"));
		
		List<FreeBoard> reverselist = 
				 list.stream()
		.collect(Collectors
				.collectingAndThen(Collectors.toList(), contents ->{
					Collections.reverse(contents);
					return contents.stream();}
				)).collect(Collectors.toList());
		//counting()은 스트림의 요소를 하나하나 세어 최종 스트림 요소의 수를 말한다
		long cnt = list.stream().collect(Collectors.counting());
		
		reverselist.stream().forEach(System.out::println);
		System.out.println(cnt);
	}
}

@Getter
@Setter
@Data
@AllArgsConstructor
class FreeBoard{
	private Integer no;
	private String title;
	private String contents;
}
