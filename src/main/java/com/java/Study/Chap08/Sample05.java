package com.java.Study.Chap08;

public class Sample05 {
	//가변인자 현재의 자료형이 계솟해서 반복된다는 의미
	public static int total = 0;
	
	public static void main(String[] args) {
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
	}	
	
	public static int sum(int ... a) {
		for(int i : a) {
			total += i;
		}
		return total;
	}
	
}
