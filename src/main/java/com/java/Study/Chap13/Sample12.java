package com.java.Study.Chap13;

import java.time.LocalDate;

public class Sample12 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.parse("1945-08-15");
		System.out.println(date2);
		
		String result =(date1.isLeapYear() ? "윤년":"평년");
		System.out.println("2022년은 "+result+"입니다.");
		
		String result1 = (date2.isLeapYear()?"윤년":"평년");
		System.out.println("1945년은 "+result1+"입니다.");
		
		System.out.println(date1+"에서" +" 오늘은 "+date1.getDayOfMonth()+"일 입니다.");
		System.out.println(date1+"에서" +" 오늘은 "+date1.getDayOfWeek()+"일 입니다.");
		System.out.println(date1+"에서" +" 오늘은 "+date1.getMonth()+"일 입니다.");
		System.out.println(date1+"에서" +" 오늘은 "+date1.getMonthValue()+"일이 지났습니다.");
		System.out.println(date1+"에서" +" 오늘은 "+date1.getYear()+"일 입니다.");
		System.out.println(date1+"에서" +" 1945-01-01로부터"+date2.getDayOfYear()+"이 지났습니다.");
		System.out.println();
		
		System.out.println("1년전의 날짜는 "+date1.minusYears(1));
		System.out.println("6개월전의 날짜는 "+date1.minusMonths(6));
		System.out.println("3일전의 날짜는 "+date1.minusDays(3));
		System.out.println("3주전의 날짜는 "+date1.minusWeeks(3));
		System.out.println();
		
		System.out.println("1년후의 날짜는 "+date1.plusYears(1));
		System.out.println("6개월후의 날짜는 "+date1.plusMonths(6));
		System.out.println("3일후의 날짜는 "+date1.plusDays(3));
		System.out.println("3주후의 날짜는 "+date1.plusWeeks(3));
	}
}
