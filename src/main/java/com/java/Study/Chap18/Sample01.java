package com.java.Study.Chap18;

public class Sample01 {
	public static void main(String[] args) {
		int i= 1;
		try {
			int j = 1;
			//출력됨.
			System.out.println(i);
		} catch (Exception e) {
			// TODO: handle exception
		}
		//출력 안됨.
//		System.out.println(j);
	}
}
