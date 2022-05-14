package com.java.Study.Chap11;

import java.util.HashMap;
import java.util.TreeMap;

public class Sample13 {
	public static void main(String[] args) {
		var hashmap = new HashMap<String, String>();
		hashmap.put("1902893", "선풍기");
		hashmap.put("1801438", "신문지");
		hashmap.put("1803962", "고무신");
		hashmap.put("1722761", "강속구");
		hashmap.put("1912449", "동백꽃");
		hashmap.put("1804367", "솔까말");
		System.out.println(hashmap);
		
		var map = new TreeMap<String, String>();
		map.putAll(hashmap);
		
		System.out.println(map);
		
		System.out.println();
		
		System.out.println(map.ceilingEntry("1803959"));
		System.out.print(map.ceilingKey("1803959"));
		System.out.println(", "+map.get(map.ceilingKey("1803959")));
		
		String no = "1803962";
		if(map.containsKey(no)) {
			System.out.println("학번"+no+"인 학생의 이름은"+map.get(no));
		}else {
			System.out.println("학번"+no+"인 학생은 재학생이 아닙니다.");
		}
	}
}
