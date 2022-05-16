package com.java.Study.Chap12;

public class Sample02 {
	public static void main(String[] args) {
		Color inputColor = Color.RED;
		System.out.println(inputColor.equals(Color.RED)? "RED" : "Not red");
		System.out.println(inputColor.equals(Size.SMALL)? "RED" : "Not red");
	}
}

class Color{
	final static Color RED = new Color();
	final static Color BLUE = new Color();
	final static Color ORANGE = new Color();
}

class Size{
	final static Size SMALL = new Size();
	final static Size MEDIUM = new Size();
	final static Size LARGE = new Size();
}
