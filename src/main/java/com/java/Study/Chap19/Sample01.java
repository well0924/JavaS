package com.java.Study.Chap19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample01 {
	public static void main(String[] args) {
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try {
			input = new FileInputStream("pom.xml");
			output = new FileOutputStream("test.xml");
			int i;
			while((i = input.read()) != -1) {
				output.write(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				input.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.getMessage();
			}
		}
	}
}
