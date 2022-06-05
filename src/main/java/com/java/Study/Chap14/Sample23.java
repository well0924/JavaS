package com.java.Study.Chap14;

public class Sample23<T> {
	@SafeVarargs
	public final void safe(T... toAdd) {}
	
	@SafeVarargs
	public static void safe(int...toAdd) {}
	
	@SafeVarargs
	private void safe2(T...toAdd) {}
}
