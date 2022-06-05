package com.java.Study.Chap14;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Sample14 {
	public static void main(String[] args) {
		char j = 74;
		char a = 97;
		char v = 118;
		System.out.println(j+a+v+a);
	}
	/**
	 * <p>생성자의 설명을 적습니다.</p>
	 * <p>아직 생성자를 배우지 않아서 뭔지 모릅니다.</p>
	 * **/
	public Sample14() {
		
	}
	
	/**
	 * <p>뭔가를 처리합니다.</p>
	 * <p>반환값은 없습니다.</p>
	 * @since 1.0
	 * */
	public void doSomething() {
		
	}
}

@Documented
@Target(ElementType.TYPE)
@interface Sample14Anno1{}

@Target(ElementType.TYPE)
@interface Sample14Anno2{}