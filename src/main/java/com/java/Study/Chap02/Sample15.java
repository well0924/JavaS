package com.java.Study.Chap02;

public class Sample15 {
	public static void main(String[] args) {
		final float PI1;//정의하지 않고 PI상수를 선언했다.
		PI1 =3.14f; //최초 값을 선언한다. 이 후 PI값을 변경하면 오류가 발생.
		
//		final var PI2;//오류 발생.
		
		final var PI3 = 3.14f;
	}
}
