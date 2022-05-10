package com.java.Study.Chap09;

public class Sample05 {
	public static void main(String[] args) {
		ICompute a = new Apartment();
		float area = a.compute(30);//30평
		System.out.println(area);
	}
}

class Apartment implements ICompute{

	@Override
	public float compute(int area) {
//		pyung++;//에러!
		
		return area*pyung;
	}
	
}

abstract interface ICompute{
	//abstract는 생략이 된다.
	float pyung = 3.3f;
	
	float compute(int area);
}
