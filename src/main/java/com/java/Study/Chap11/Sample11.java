package com.java.Study.Chap11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Sample11 {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		
		list.add("사자");
		list.add("호랑이");
		list.add("원숭이");
		
		var trs = new TreeSet<String>();
		trs.addAll(list);
		System.out.println(trs);
		
		String addString = "토끼";
		if(trs.contains(addString)) {
			System.out.println(addString);
		}else {
			trs.add(addString);
		}
		System.out.println(trs);
		
		System.out.println(trs.ceiling("자"));
		System.out.println(trs.floor("자"));
		System.out.println(trs.higher("토끼"));
		System.out.println(trs.lower("토끼"));
		System.out.println(trs.first());
		System.out.println(trs.last());
		Iterator<String> it = trs.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(trs.pollFirst());
		System.out.println(trs);
		
		System.out.println(trs.pollLast());
		System.out.println(trs);
	}
}
