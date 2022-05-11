package com.java.Study.Chap10;

class Computer1 {
	//클래스에서 제네릭을 사용하지 않아서 제네릭 타입을 사용할 수 없음.
	private String componentClasName;
	
	public void toInfo() {
		System.out.println(componentClasName);
	}
	
	//생성자에 제네릭 타입을 선언
	public <T extends ComputerPart>Computer1(T component){
		this.componentClasName = component.getClass().getName();
	}
}

class ComputerPart1{}

class Memory1 extends ComputerPart{
	
}

public class Sample09{
	public static void main(String[] args) {
		Computer1 mem = new Computer1(new Memory1());
		mem.toInfo();
	}
}