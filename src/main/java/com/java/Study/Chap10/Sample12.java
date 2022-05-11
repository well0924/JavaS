package com.java.Study.Chap10;

public class Sample12 {
	public static void main(String[] args) {
		Data date = new Data();
		date.setValue(3);
		System.out.println(date.getValue());
	}
}

class Data{
	String value;
	
	public<T>void setValue(T t){
		this.value = t.toString();
	}
	
	public String getValue(){
		return this.value;
	}
}