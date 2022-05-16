package com.java.Study.Chap12;

public class Sample05 {
	public static void main(String[] args) {
		FLOWER flower = FLOWER.ROSE;
		
		System.out.println(flower.getName());
	}
}

enum FLOWER{
	SUNFLOWER("sunflower"),ROSE("rose");
	private final String name;
	
	private FLOWER(String flowerName) {
		this.name = flowerName;
	}
	
	public String getName() {
		return name;
	}
}
