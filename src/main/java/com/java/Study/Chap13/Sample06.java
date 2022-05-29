package com.java.Study.Chap13;

import java.text.DecimalFormat;

public class Sample06 {
	public static void main(String[] args) {
		double myMoney1 = 20000000;
		double myMoney2 = -500000000;
		
		DecimalFormat df = new DecimalFormat("(수익)##,###,##0;(손실)##,###,##0");
		System.out.println(df.format(myMoney1));
		System.out.println(df.format(myMoney2));
	}
}
