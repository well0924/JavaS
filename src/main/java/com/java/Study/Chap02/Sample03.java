package com.java.Study.Chap02;

public class Sample03 {
	public static void main(String[] args) {
		byte a1 = -128; //byte 최소값
		byte a2 = 127; //byte 최대값
		short b1 = -32768; //short 최소값
		short b2 = 32767; //short 최대값
		int c = 10000; //int는 그냥 숫자를 적는다.
		long d = 10000L;//long의 경우에는 숫자 뒤에 L이나 l을 붙인다.
		float e = 10.1f;//float형은 뒤에 F나 f를 붙인다.
		double f = 10.1;//double형은 소수점이 있는 숫자를 입력하면 자동으로 double
		
		System.out.printf("byte: %d,\t short: %d%n",a1,b1);
		System.out.printf("int: %d,\t long: %d%n",c,d);
		System.out.printf("float: %f,\t double: %f",e,f);
	}
}
