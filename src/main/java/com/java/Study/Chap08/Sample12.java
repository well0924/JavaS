package com.java.Study.Chap08;

public class Sample12 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("익명 내부 클래스 실행");
			}
		};
		r.run();
	}
}
