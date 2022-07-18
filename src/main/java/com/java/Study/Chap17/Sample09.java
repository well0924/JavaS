package com.java.Study.Chap17;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Sample09 {
	public static void main(String[] args) {
		List<Board>boardList = new ArrayList<>();
		//1부터 100까지 반복문으로 게시글을 저장.
		IntStream.range(1, 100).forEach(i -> {boardList.add(
										new Board(i,"title_"+i,"user"+i,
												LocalDateTime.now())
										);
									}
								);
		boardList.stream().forEach(System.out::println);
	}
}

@Setter
@Getter
@ToString
@AllArgsConstructor
class Board{
	int no;
	String title;
	String user;
	LocalDateTime createTime;
}
