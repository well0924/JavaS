package com.java.Study.Chap10;

public class Sample13 {
	public static void main(String[] args) {
		NumberBox box = new NumberBox();
		box.setNumber(2002);
		box.setNumber(43567.3);
//		box.setNumber("1234");에러 발생
	}
}

class NumberBox{
	public <E extends Number>void setNumber(E e){
		System.out.println("입력된 값은:"+e.toString()+"입니다.");
	}
}
