package com.java.Study.Chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//Type은 Class,Interface,Eunm상수 클래스에 적용할 수 있다.
@Sample04AnnoClass
public class Sample04 {
	private String test;
	
	public static void main(String[] args) {
		
	}
	
	public void testMethod() {
		
	}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Sample04AnnoClass{}