package com.java.Study.Chap06;

public class Sample04 {
	public static void main(String[] args) {
		//1단부터 9단까지
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();//단이 끝날때마다 개행
		}
	}
}
