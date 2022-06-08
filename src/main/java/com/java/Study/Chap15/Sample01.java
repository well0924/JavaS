package com.java.Study.Chap15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample01 {
	public static void main(String[] args) {
		String str = "1234567890";
		Pattern p = Pattern.compile("^[0-9]*$");
		Matcher m = p.matcher(str);
		
		System.out.println(m.find());
	}
}
