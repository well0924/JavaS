package com.java.Study.Chap08;

import com.java.Study.Chap08.Sample21.service.DataServiceImpl;
import com.java.Study.Chap08.Sample21.service.PrintServiceImpl;

public class Sample021 {
	
	public static DataServiceImpl data = new DataServiceImpl();
	public static PrintServiceImpl print = new PrintServiceImpl();
	
	public static void main(String[] args) {
		String name;
		name = data.getName();
		
		print.printMessage(name);
	}
}
