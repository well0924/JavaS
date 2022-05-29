package com.java.Study.Chap13;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;

public class Sample08 {
	public static void main(String[] args) {
		int users = 14638;
		int views = 1500;
		//CompactNumberFormat는 숫자를 모두 표시하지 않고 반올림하거나 소수점을 이용해서 짧은 숫자를 표시하는 api이다.
		NumberFormat nf = CompactNumberFormat.getCompactNumberInstance();
		System.out.println(nf.format(users));
		System.out.println(nf.format(views));
	}
}
