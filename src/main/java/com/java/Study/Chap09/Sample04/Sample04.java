package com.java.Study.Chap09.Sample04;

public class Sample04 {
	//업캐스팅: 자식 클래스의 객체가 부모 클래스의 타입으로 형 변환하는 것
	//다운캐스팅: 부모 클래스 타입인 객체가 자식 클래스의 타입으로 형 변환하는 것
	public static void main(String[] args) {
		Pet cat = new Cat(false,4);
		cat.run(getPetName(cat));
		
		Pet parrot = new Parrot(true,2);
		parrot.run(getPetName(parrot));
		
		Parrot pr = (Parrot)parrot;//다운캐스팅
		pr.fly(getPetName(parrot));
	}
	
	public static String getPetName(Pet pet) {
		String str = "";
		if(pet instanceof Cat) {
			str = "고양이";
		}else if( pet instanceof Parrot) {
			str = "앵무새";
		}
		return str;
	}
}
