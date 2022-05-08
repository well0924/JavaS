package com.java.Study.Chap06;

public class Sample06 {
	public static void main(String[] args) {
		//1단 부터 9단까지
		for(int i =1;i<10;i++) {
			for(int j =1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j);
				break;
			}
			System.out.println();//단이 끝날때마다 개행
		}
	}
}
