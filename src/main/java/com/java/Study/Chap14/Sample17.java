package com.java.Study.Chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Friend01({"둘리","구미호","스누피"})
public class Sample17 {
	public static void main(String[] args) {
		Sample17 sample = new Sample17();
		Friend01 friend1 = sample.getClass().getAnnotation(Friend01.class);
		for(String friend:friend1.value()) {
			System.out.println(friend);
		}
	}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Friend01{
	String[]value();
}