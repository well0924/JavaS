package com.java.Study.Chap13;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Sample19 {
	public static void main(String[] args) {
		DateTimeFormatter formate1 = DateTimeFormatter.ofPattern("yyyy年 MM月 dd日 HH時 mm分 - vvvv");
		DateTimeFormatter formate2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm - VV");
		DateTimeFormatter formate3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm - VV");
		
		System.out.println(formate1.format(ZonedDateTime.now(ZoneId.of("Asia/Seoul"))));
		System.out.println(formate2.format(ZonedDateTime.now(ZoneId.of("Asia/Seoul"))));
		System.out.println(formate3.format(ZonedDateTime.now(ZoneId.of("Australia/Sydney"))));
	}
}
