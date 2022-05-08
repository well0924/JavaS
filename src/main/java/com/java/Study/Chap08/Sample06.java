package com.java.Study.Chap08;

public class Sample06 {
	//메서드 내에서 스스로를 반복적으로 호출하여 처리하는 방식
	static int sum;
	
	public static void main(String[] args) {
		System.out.println(sum(10));
	}
	
	public static int sum(int a) {
		sum += a;
		if(a==0) {
			return sum;
		}else {
			a--;
			return sum(a);
		}
	}
}
