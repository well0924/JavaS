package com.java.Study.Chap09;

public class Sample09 {
	public static void main(String[] args) {
		String legacykey = Util.getRandom();
		System.out.println("레거시 시스템에서 처리될 키값은"+legacykey+"입니다.");
		
		//5개의 임의의 키값을 가져와서 데이터를 처리한다.
		for(int i=0;i<5;i++) {
			String key = Util.getRandom();
			System.out.println("새로운 시스템에서 처리될 키값은"+key+"입니다.");
		}
	}
}

class Util{
	public static String getRandom() {
		return ""+ (int)(Math.random()*10+1);//1~10까지 출력
	}
}
