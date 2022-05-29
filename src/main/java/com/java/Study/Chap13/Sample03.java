package com.java.Study.Chap13;

import java.text.DecimalFormat;

public class Sample03 {
	//DecimalFormat클래스는 NumberFormat으로부터 상속받아서 구현된 클래스
	public static void main(String[] args) {
		int myMoney = -5000;
		System.out.println(myMoney);
		DecimalFormat df = new DecimalFormat("#,###.##");
		System.out.println(df.format(myMoney));
	}
}
