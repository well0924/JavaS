package com.java.Study.Chap14;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public class Sample03 {
	public static void main(String[] args) {
		@Sample03AnnoClass
		class C{}
		
		@sample03AnnoRuntime
		class R{}
		
		System.out.println(C.class.getName());
		System.out.println(C.class.getAnnotations().length);
		System.out.println(Arrays.toString(C.class.getAnnotations()));
		System.out.println();
		
		System.out.println(R.class);
		System.out.println(R.class.getAnnotations().length);
		System.out.println(Arrays.toString(R.class.getAnnotations()));
	}
}

@Retention(RetentionPolicy.CLASS)
@interface Sample03AnnoClass{
	
}

@Retention(RetentionPolicy.RUNTIME)
@interface sample03AnnoRuntime{}