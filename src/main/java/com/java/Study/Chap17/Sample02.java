package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample02 {
	public static void main(String[] args) {
		//배열
		String[]strArr = {"빵형","타노스","상도"};
		int[]intArr = {3,6,9};
		double[]floatArr = {3.1,4.2,5.3};
		//스트림
		Stream<String>strStream = Arrays.stream(strArr);
		IntStream     intStream = Arrays.stream(intArr);
		DoubleStream  douStream = Arrays.stream(floatArr);
		//출력
		strStream.forEach(System.out::println);
		intStream.forEach(System.out::println);
		douStream.forEach(System.out::println);
	}
}
