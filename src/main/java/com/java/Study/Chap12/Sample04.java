package com.java.Study.Chap12;

public class Sample04 {
	public static void main(String[] args) {
		System.out.println("허수아비가"+Size2.LARGE+"의 "+Color2.RED+"티를 입고 있습니다.");
	}
}

enum Color2{
	RED{
		@Override
		public String toString() {
			return "빨간색";
		}	
	},BLUE{

		@Override
		public String toString() {
			return "파란색";
		}
		
	},OARNGE{

		@Override
		public String toString() {
			return "오랜지색";
		}
		
	}
}

enum Size2{
	SMALL{
		@Override
		public String toString() {
			return "작은 사이즈";
		}	
	},MEDIUM{

		@Override
		public String toString() {
			return "중간 사이즈";
		}
		
	},LARGE{

		@Override
		public String toString() {
			return "큰 사이즈";
		}
		
	};
}