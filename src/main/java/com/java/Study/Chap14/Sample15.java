package com.java.Study.Chap14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Sample15 {
	public static void main(String[] args) {
		System.out.println();
	}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface notInheritClass{}

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface InheritClass{}

@InheritClass
@notInheritClass
class SuperClass{}

class TargetClass extends SuperClass{}