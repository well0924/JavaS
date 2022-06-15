package com.java.Study.Chap17;

import java.util.Arrays;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample03 {
	public static void main(String[] args) {
		DataObj[] data = {new DataObj(1,"빵형"),new DataObj(2,"상도"),new DataObj(3,"타노스")};
		
		Stream<DataObj> dataObj = Arrays.stream(data);
		
		Arrays.stream(data).forEach(System.out::println);
		dataObj.forEach(System.out::println);
	}
}

@Data
@AllArgsConstructor
class DataObj{
	int no;
	String name;
}