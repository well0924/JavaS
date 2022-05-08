package com.java.Study.Chap08.Sample02;

public class Sample2 {
	public static void main(String[] args) {
		VO vo = new VO();
		vo.name = "빵형";
		vo.age = 21;
		
		System.out.println(vo.name+"은"+" "+vo.age+"살 입니다.");
		System.out.println(VO.ONE+"+"+VO.TWO+"="+VO.THREE);
	}
}
