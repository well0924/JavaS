package com.java.Study.Chap11;

import java.util.ArrayList;
import java.util.List;

public class Sample03 {
	public static void main(String[] args) {
		List<String>arr = new ArrayList<>();
		
		arr.add("하나");
		arr.add("둘");
		arr.add("이쩜오");
		arr.add("셋");
		arr.add("넷");
		arr.add("다섯");
		
		arr.remove(2);
		for (String string : arr) {
			System.out.println(string);
		}
		
		//둘,셋 삭제
		System.out.println();
		System.out.println("둘,셋 삭제");
		List<String>delArr = new ArrayList<>();
		delArr.add("하나");
		delArr.add("둘");
		arr.removeAll(delArr);
		for(String a : arr) {
			System.out.println(a);
		}
		
		//모두 삭제한다.
		System.out.println();
		arr.removeAll(delArr);
		for(String a : arr) {
			System.out.println(a);
		}
	}
}
