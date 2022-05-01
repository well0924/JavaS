package com.java.Study.Chap02;

import java.util.Scanner;

public class Sample11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String i1 = sc.nextLine();
		System.out.printf("입력한 값:[%s]\n글자 수: %d\n",i1.toUpperCase().trim(),i1.toUpperCase().trim().length());
		
		sc.close();
	}
}
