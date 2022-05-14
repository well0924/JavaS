package com.java.Study.Chap11;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		
		arr.add("하나");
		arr.add("둘");
		arr.add("이쩜오");
		arr.add("셋");
		arr.add("넷");
		arr.add("다섯");
		
		for(int i=0;i< arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
