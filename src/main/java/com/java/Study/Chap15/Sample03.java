package com.java.Study.Chap15;

public class Sample03 {
	public static void main(String[] args) {
		String[]str = {"ASDF12","123456","QWERTY","as45aa","567jkl"};
		String regex = "^[0-9A-Z]{6}$";
		for(String date : str) {
			System.out.println(date+" "+date.matches(regex));
		}
	}
}
