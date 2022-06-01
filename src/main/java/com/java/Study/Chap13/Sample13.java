package com.java.Study.Chap13;

import java.time.LocalTime;
import java.time.ZoneId;

public class Sample13 {
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		System.out.println("현재 시간은"+time1.getHour());
		System.out.println("현재 분은"+time1.getMinute());
		System.out.println("현재 초는"+time1.getSecond());
		
		LocalTime time2 = LocalTime.of(13, 59,10);
		System.out.println(time2);
		
		LocalTime time3 = LocalTime.now(ZoneId.of("Asia/Colombo"));
		System.out.println(time3+" - Asia/Colombo");
		
	}
}
