package com.java.Study.Chap08;

public class Sample19 {
	public static void main(String[] args) {
		Wallet well = new Wallet(10000);
		
//		well.myMoney -= 2200;
		well.pay(2000);
		well.checkMoney();
	}
}

class Wallet{
	int myMoney;
	
	public Wallet(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void pay(int payMoney) {
		this.myMoney -= (int)(payMoney *1.1);
	}
	
	public void checkMoney() {
		System.out.println("남은 돈:"+ this.myMoney);
	}
}
