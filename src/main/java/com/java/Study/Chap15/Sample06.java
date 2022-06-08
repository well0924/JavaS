package com.java.Study.Chap15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample06 {
	public static void main(String[] args) {
		String target = "sample@sample.com,test@test.co.kr,example@example.com,school@school.net,apple@apple.org";
		String regex = "([\\w]*@[\\w]*(.com|.net))";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(target);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
