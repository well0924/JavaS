package com.java.Study.Chap10;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Sample11 {
	public static void main(String[] args) {
		Student1<Integer,Integer> younghee = new Student1<>(2,5);
		younghee.printInfo("영희");
	}
}

@Getter
@AllArgsConstructor
class Student1<G extends Integer, C extends Integer>{
	G g;
	C c;
	
	public void printInfo(String name) {
		System.out.println(name+"은"+g+"학년"+c+"반");
	}
}