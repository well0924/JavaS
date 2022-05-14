package com.java.Study.Chap11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample12 {
	public static void main(String[] args) {
		var map = new HashMap<String, Integer>();
		map.put("Java", 1);
		map.put("C", 2);
		map.put("C++", 3);
		map.put("C#", 4);
		map.put("Python", 5);
		map.put("JavaScript", 6);
		map.put("PHP", 7);
		map.put("Visual Basic     .NET", 8);
		map.put("Pearl", 9);
		map.put("Dalphi", 10);
		
		Map beforeMap = (Map)map.clone();
		Set<String>keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(key);
		}
		
		keys.forEach((s)->System.out.println(s));
		
		map.keySet().forEach(System.out::println);
		
		System.out.println(map.size());
		
		if(map.containsKey("Delphi")) {
			map.remove("Delphi");
		}else {
			System.out.println("Delphi가 없습니다.");
		}
		map.put("Ruby", 10);
		System.out.println(map.toString());
		
		map.computeIfPresent("Java", (String key,Integer value)-> ++value);
		
		map.computeIfPresent("C",(String key,Integer value)-> --value);
		System.out.println(map.toString());
		System.out.println(beforeMap);
	}
}
