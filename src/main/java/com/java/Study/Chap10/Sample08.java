package com.java.Study.Chap10;

class Computer <T extends ComputerPart>{
	private T component;
	
	public void toInfo() {
		System.out.println(component.getClass().getName());
	}
	
	public Computer() {}
	
	public Computer(T component) {
		this.component = component;
	}
	
	public void setComponent(T component) {
		this.component = component;
	}
}

class ComputerPart{}

class Graphics extends ComputerPart{}

class Memory extends ComputerPart{}

class Monitor{}


public class Sample08{
	public static void main(String[] args) {
		Computer<ComputerPart>vga = new Computer<ComputerPart>();
		
		vga.setComponent(new Graphics());
//		vga.setComponent(new Monitor());
		vga.toInfo();
		
		//생성자를 통한 객체 생성
		Computer<ComputerPart>mem = new Computer<>(new Memory());
		mem.toInfo();
	}
}