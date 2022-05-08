package com.java.Study.Chap06;

public class Sample11 {
	public static void main(String[] args) {
		int i =1;
		
		do {
			for(int j =0;j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
			i++;//증감식
		}while(i<=5);//출력될 값이 5를 넘어가면 반복문을 종료한다.
	}
}
