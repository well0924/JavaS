package com.java.Study.Chap13;

import java.util.Calendar;
import java.util.Date;

public class Sample01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
	}
}
