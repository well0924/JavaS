package com.java.Study.Chap09;

import java.util.UUID;

public class Sample10 {
	public static void main(String[] args) {
		String legacykey = LegacyUtil.getRandom();
		System.out.println(legacykey);
		
		//5개의 임의의 키값을 가져와서 데이터를 처리한다.
		for(int i=0;i<5;i++) {
			String key = NewUtil.getRandom();
			System.out.println("새로운 시스템에서 처리될 키값은"+key+"입니다.");
		}
	}
}

class LegacyUtil{
	public static String getRandom() {
		return ""+ (int)(Math.random()*10+1);//1~10까지 출력
	}
}

class NewUtil extends Util{
	public static String getRandom() {
		return ""+UUID.randomUUID();
	}
}