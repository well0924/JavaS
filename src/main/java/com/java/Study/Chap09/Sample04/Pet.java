package com.java.Study.Chap09.Sample04;

public abstract class Pet {
	private boolean wing;
	private int legCount;
	
	public String isWing() {
		String str;
		if(this.wing) {
			str ="날수 있다.";
		}else {
			str="날 수 없다.";
		}
		return str;
	}
	
	public int getLegCount() {
		return legCount;
	}

	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}

	public void setWing(boolean wing) {
		this.wing = wing;
	}
	
	public abstract void run(String name);
	
	
	public Pet(boolean wing,int legCount) {
		this.legCount = legCount;
		this.wing = wing;
	}
}
