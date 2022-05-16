package com.java.Study.Chap12;

import java.util.Scanner;

public class Sample07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(CITY city : CITY.values()) {
			System.out.println(city.ordinal()+""+city.getDestination()+" "+city.name());
		}
		
		int selectNum = sc.nextInt();
		
		CITY retCity = CITY.valueOf(selectNum);
		if(retCity == null) {
			System.out.println("목적지를 확인하세요.");
		}else {
			switch(retCity) {
			case SEOUL ->System.out.println(CITY.SEOUL.getDestination());
			case DAEJEON -> System.out.println(CITY.DAEJEON.getDestination());
			case DAEGU -> System.out.println(CITY.DAEGU.getDestination());
			case GWANGJU ->System.out.println(CITY.GWANGJU.getDestination());
			case BUSAN -> System.out.println(CITY.BUSAN.getDestination());
			}
		}
	}
}

enum CITY{
	SEOUL("서울"),DAEJEON("대전"),DAEGU("대구"),BUSAN("부산"),GWANGJU("광주");
	
	private final String destination;
	
	private CITY(String destination) {
		this.destination = destination;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public static CITY valueOf(int selectNum) {
		CITY returnCity = null;
		for(CITY city : CITY.values()) {
			if(selectNum == city.ordinal()) {
				returnCity = city;
			}
		}
		return returnCity;
	}
}