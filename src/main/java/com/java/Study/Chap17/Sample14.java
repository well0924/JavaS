package com.java.Study.Chap17;

import java.util.stream.IntStream;

public class Sample14 {
	//reduce():스트림 요소를 합이나 최댓값등을 구할 때 사용
	public static void main(String[] args) {
		int sum1  =0;
		int sum2 = 0;
		for(int i=0;i<=10;i++) {
			sum1 +=i;
		}
		System.out.println("for문 결과:"+sum1);
		
		sum2 = IntStream.rangeClosed(7, 10).reduce(6, Integer::sum);
		System.out.println("reduce문 결과:"+sum2);
	}
}
