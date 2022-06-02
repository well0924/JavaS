package com.java.Study.Chap13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sample20 {
	public static void main(String[] args) {
		//기본 parse 패턴
		LocalDate date = LocalDate.parse("2022-01-01");
		System.out.println(date);
		
		DateTimeFormatter datetimeformatter1 = DateTimeFormatter.ofPattern("uuuuMMdd");
		String inDate1 = "20221010";
		LocalDate date1 = LocalDate.parse(inDate1,datetimeformatter1);
		System.out.println(date1);
		
		DateTimeFormatter datetimeformatter2 = DateTimeFormatter.ofPattern("uuuuMMdd HH:mm");
		String inDate2 = "20220505 14:15";
		LocalDateTime date2 = LocalDateTime.parse(inDate2,datetimeformatter2);
		System.out.println(date2);
 		
	}
}
