package com.java.Study.Chap12;

import java.util.EnumSet;

import lombok.Getter;

public class Sample06 {
	public static void main(String[] args) {
		System.out.println(BIRD.SPARROW.getName()+" "+BIRD.SPARROW.getCount());
		System.out.println(BIRD.PARROT.getName()+" "+BIRD.PARROT.getCount());
		System.out.println(BIRD.EAGLE.getName()+" "+BIRD.EAGLE.getCount());
		System.out.println(BIRD.FALCON.getName()+" "+BIRD.FALCON.getCount());
		
		EnumSet<BIRD>birds = EnumSet.allOf(BIRD.class);
		
		for(BIRD bird :birds) {
			System.out.println(bird.getName()+" "+bird.getCount());
		}
		
		for(BIRD bird : BIRD.values()) {
			System.out.println(bird.getName()+" "+bird.getCount());
		}
		
		birds.remove(BIRD.EAGLE);
		for(BIRD bird :birds) {
			System.out.println(bird.getName()+" "+bird.getCount());
		}
		
		birds.add(BIRD.EAGLE);
		for(BIRD bird :birds) {
			System.out.println(bird.getName()+" "+bird.getCount());
		}
	}
}


@Getter
enum BIRD{
	SPARROW("참새",33),PARROT("앵무새",27),EAGLE("독수리",2),FALCON("매",9);
	
	private final String name;
	private final int count;
	
	private BIRD(String name,int count) {
		this.count = count;
		this.name= name;
	}
	
}