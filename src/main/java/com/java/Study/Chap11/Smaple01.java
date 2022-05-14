package com.java.Study.Chap11;

import java.util.ArrayList;
import java.util.List;

public class Smaple01 {
	public static void main(String[] args) {
		List<String> arr = new ArrayList();
		
		arr.add("하나");
		arr.add("둘");
		arr.add("셋");
		arr.add("넷");
		arr.add("다섯");
		//3번째에 둘쩜오를 삽입
		arr.add(2,"둘쩜오");
		
		//향상된 for문으로 출력
		for(String a : arr) {
			System.out.println(a);
		}
		
		
	}
}
