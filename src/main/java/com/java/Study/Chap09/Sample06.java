package com.java.Study.Chap09;

public class Sample06 {
	public static void main(String[] args) {
		Villa vi = new Villa();
		float area = vi.compute(30);
		System.out.println("빌라의 면적은"+area+"제곱미터입니다.");
		
		area = vi.toPyung(area);
		System.out.println("빌라의 면적은"+area+"평입니다.");
	}
}

class Villa implements IExcute{

	@Override
	public float compute(int area) {
		// TODO Auto-generated method stub
		return area* pyung;
	}
	
}

abstract interface IExcute{
	float pyung = 3.3f;
	
	float compute(int area);
	
	default float toPyung(float area) {
		return area/pyung;
	}
}