package com.java.Study.Chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sample07 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("dog");
		list.add("cat");
		list.add("lion");
		
		System.out.println("1.forEach");
		list.forEach((String x )-> System.out.println(x));
		
		System.out.println("2.for문");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("3.향상된 for문");
		for(String a : list) {
			System.out.println(a);
		}
		
		System.out.println("4.Iterator");
		Iterator<String>it1 = list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("5.iterator를 활용한 람다식");
		Iterator<String>it2 = list.iterator();
		it2.forEachRemaining((n)->System.out.println(n));
		
		System.out.println("6.iterator를 활용한 출력(참조 메서드 활용)");
		Iterator<String>it3= list.iterator();
		it3.forEachRemaining(System.out::println);
		
		System.out.println("7.Collection 정렬");
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.toString());
	}
}
