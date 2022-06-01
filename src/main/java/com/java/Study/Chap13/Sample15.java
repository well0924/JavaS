package com.java.Study.Chap13;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Sample15 {
	public static void main(String[] args) {
		printInfo(ZoneId.systemDefault());
		printInfo(ZoneId.of("America/Los_Angeles"));
	}
	
	public static void printInfo(ZoneId zone) {
		System.out.println(zone);
		LocalDateTime ldt = LocalDateTime.now(zone);
		System.out.println(ldt);
		System.out.println(ldt.toLocalDate());
		System.out.println(ldt.toLocalTime());
		System.out.println(ldt.plusYears(10));
	}
}
