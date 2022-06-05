package com.java.Study.Chap14;

import static java.lang.annotation.ElementType.TYPE_USE;

import java.lang.annotation.Target;
import java.util.HashMap;

public class Sample13 {
	public static void main(String[] args) {
		var map = new HashMap<@UserTest String, @UserTest String>();
		
		//Sample12의 Person클래스
		Person<@UserTest String>person = new Person();
	}
}

@Target(TYPE_USE)
@interface UserTest{}