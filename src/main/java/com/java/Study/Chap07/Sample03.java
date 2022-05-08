package com.java.Study.Chap07;

import java.util.Scanner;

public class Sample03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in;
		System.out.println("숫자를 입력해주세요.");
		while(sc.hasNext()) {
			in = sc.nextInt();
			
			if(in %2 ==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
			System.out.println("\n 숫자를 입력해주세요.");
		}
	}
}
