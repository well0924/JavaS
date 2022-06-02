package com.java.Study.Chap13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Sample16 {
	public static void main(String[] args) {
		LocalDateTime ldt1 = LocalDateTime.now();
		
		System.out.println(ldt1);
		
		ZoneId seoulTime = ZoneId.of("Asia/Seoul");
		ZoneId bangkokZone = ZoneId.of("Asia/Bangkok");
		ZoneId sydneyZone  = ZoneId.of("Australia/Sydney");
		
		LocalDateTime ldt2 = LocalDateTime.now(seoulTime);
		System.out.println(ldt2);
		
		LocalDateTime ldt3 = LocalDateTime.now(bangkokZone);
		System.out.println(ldt3);
		
		LocalDateTime ldt4 = LocalDateTime.now(sydneyZone);
		System.out.println(ldt4);
		
		ZonedDateTime zdt1 = ZonedDateTime.now(seoulTime);
		System.out.println(zdt1);
		
		ZonedDateTime zdt2 = ZonedDateTime.now(bangkokZone);
		System.out.println(zdt2);
		
		ZonedDateTime zdt3 = ZonedDateTime.now(sydneyZone);
		System.out.println(zdt3);
		
		ZonedDateTime nationalLiberationDay = Year
												.of(1945)
												.atMonth(8)
												.atDay(15)
												.atTime(10,30)
												.atZone(ZoneId.of("Asia/Seoul"));
		
		System.out.println(nationalLiberationDay);
		
		ZonedDateTime zdt4 = zdt1.plusHours(10).withZoneSameInstant(sydneyZone);
		System.out.println(zdt4);
		
	}
}
