package com.java.Study.Chap07;

public class Sample10 {
	public static void main(String[] args) {
		int in = 6;
		
		String season = switch(in) {
			case 12, 1, 2  : yield "겨울";
			case 3, 4, 5  : yield "봄";
			case 6, 7, 8  : yield "여름";
			case 9, 10,11  : yield "가을";
			default    : yield "기후온난화";
		};
		
		System.out.println(season);
	}
}
