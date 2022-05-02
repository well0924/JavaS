package com.java.Study.Chap02;

import java.util.Random;

public class Sample16 {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(3)+1;//1~3까지의 수 출력
		System.out.printf("난수 : %d",num);
	}
}
