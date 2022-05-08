package com.java.Study.Chap08.Sample10;

public class Sample10 {
	public static void main(String[] args) {
		Student stu = new Student("빵형");
		Student.Score score = stu.new Score();
		score.eng = 23;
		score.mat = 21;
		
		score.showInfo();
	}
}
