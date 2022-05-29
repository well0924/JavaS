package com.java.Study.Chap13;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Sample09 {
	public static void main(String[] args) {
		int user = 14638;
		int views = 1500;
		
		Locale lo = new Locale("ko","KR");
		NumberFormat nf = CompactNumberFormat.getCompactNumberInstance(lo,NumberFormat.Style.SHORT);
		System.out.println(nf.format(user));
		System.out.println(nf.format(views));
		
		lo = Locale.KOREA;
		nf = CompactNumberFormat.getCompactNumberInstance(lo,NumberFormat.Style.SHORT);
		System.out.println(nf.format(user));
		System.out.println(nf.format(views));
		
		lo = new Locale("en","US");
		nf = CompactNumberFormat.getCompactNumberInstance(lo,NumberFormat.Style.SHORT);
		System.out.println(nf.format(user));
		System.out.println(nf.format(views));
		
		lo = Locale.US;
		nf = CompactNumberFormat.getCompactNumberInstance(lo,NumberFormat.Style.SHORT);
		System.out.println(nf.format(user));
		System.out.println(nf.format(views));
	}
}
