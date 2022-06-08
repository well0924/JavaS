package com.java.Study.Chap15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample10 {
	public static void main(String[] args) {
		String str1= "나는 소년입니다.";
		String str2= "I am a boy";
		Pattern p = Pattern.compile("[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]");
		Matcher m = p.matcher(str1);
		Matcher m2= p.matcher(str2);
		
		System.out.println(m.find());
		System.out.println(m2.find());
	}
}
