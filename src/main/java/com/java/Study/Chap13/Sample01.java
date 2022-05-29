package com.java.Study.Chap13;

import java.util.Calendar;
import java.util.Date;

public class Sample01 {
	public static void main(String[] args) {
		//calendat클래스는 추상클래스로 제공되고 있어서 생성자를 사용해서 인스턴스를 생성해서 
		//static 메서드로 제공하고 있는 getInstance()메서드를 통해서 인스턴스를 생성합니다.
		Calendar cal = Calendar.getInstance();
		//getTime()메서드의 반환자료는 Date이고 Calendar의 시간을 반환합니다.
		Date date = cal.getTime();
		System.out.println(date);
	}
}
