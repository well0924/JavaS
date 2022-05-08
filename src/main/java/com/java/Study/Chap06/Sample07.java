package com.java.Study.Chap06;

public class Sample07 {
	public static void main(String[] args) {
		//1단부터 9단까지
		for(int i=1; i<=9; i++) {
			for(int j=1;j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j);
				break;
			}
			System.out.println();
			if(true) continue;
		}
	}
}
