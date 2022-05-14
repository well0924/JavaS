package com.java.Study.Chap11;

import java.util.ArrayList;
import java.util.List;

public class Sample05 {
	static List<String> list1= new ArrayList<>();
	static List<String> list2= new ArrayList<>();
	
	public static void main(String[] args) {
		list1.add("dog");
		list1.add("dog");
		list1.add("dog");
		
		list2.add("dog");
		list2.add("dog");
		list2.add("dog");
		toString("1.순차입력");
		
		list1.add(2,"tiger");
		list2.add(2,"tiger");
		toString("2. 중간삽입");
		
		list1.remove(2);
		list2.remove(2);
		toString("3.중간삭제");
	}
	
	public  static void toString(String title) {
		System.out.println(title);
		System.out.println(list1);
		System.out.println(list2);
	}
}
