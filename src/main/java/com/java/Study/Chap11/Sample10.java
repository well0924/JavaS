package com.java.Study.Chap11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Spliterator;

public class Sample10 {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		
		list.add("dog");
		list.add("dog");
		list.add("cat");
		list.add("cat");
		list.add("lion");
		list.add("lion");
		
		System.out.println("<<ArrayList>>");
		System.out.println(list);
		
		var hs = new HashSet<String>();
		hs.addAll(list);
		System.out.println(hs);
		
		hs.add("lion");
		hs.forEach(System.out::println);
		
		System.out.println("dog가 포함되었는가요?:"+hs.contains("dog"));
		
		System.out.println("<<Spliterator>>");
		Spliterator<String>namesSpliterator = hs.spliterator();
		namesSpliterator.forEachRemaining(System.out::println);
	}
}
