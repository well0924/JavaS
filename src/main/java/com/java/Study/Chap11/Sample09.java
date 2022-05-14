package com.java.Study.Chap11;

import java.util.ArrayList;
import java.util.Collections;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample09 {
	public static void main(String[] args) {
		var list = new ArrayList<Employee>();
		list.add(new Employee(1, "AAA"));
		list.add(new Employee(2, "BBB"));
		list.add(new Employee(3, "CCC"));
		list.add(new Employee(4, "DDD"));
		
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
	}
}

@Data
@AllArgsConstructor
class Employee implements Comparable<Employee>{
	private int sabun;
	private String name;
	
	@Override
	public int compareTo(Employee o) {
//		return this.name.compareTo(o.name);//순정렬
//		return o.name.compareTo(this.name);//역정렬
//		return this.sabun - o.sabun;//순정렬
		return o.sabun - this.sabun;// 역정렬
	}
	
	
}