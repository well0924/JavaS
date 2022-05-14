package com.java.Study.Chap11;

import java.util.Stack;

public class Sample06 {
	public static void main(String[] args) {
		var stack = new Stack<String>();
		
		stack.push("dog");
		stack.push("cat");
		stack.push("lion");
		System.out.println(stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("총"+stack.size()+"개의 자료가 있습니다.");
	}
}
