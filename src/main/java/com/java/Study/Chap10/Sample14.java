package com.java.Study.Chap10;

public class Sample14 {
	public static void main(String[] args) {
		Wallet mywallet = new Wallet();
		
		Money<Integer> m1 = new Money<>();
		m1.getMoney(10000);
		
		Money<Integer>m2 = new Money<>();
		m1.getMoney(600000);
		
		mywallet.insertMoney(m1);//용돈을 넣는다.
		mywallet.insertMoney(m2);//알바비를 받는다.
		
		//지갑을 확인한다.
		System.out.println(mywallet.totalMoney);
	}
}

class Wallet{
	double totalMoney = 0;
	
	public void insertMoney(Money<?>myMoney) {
		totalMoney += myMoney.getMoney();
	}
	
	public double checkWalletMoney() {
		return totalMoney;
	}
}

class Money<E extends Number>{
	double myMoney;
	
	public void getMoney(E info) {
		this.myMoney = info.doubleValue();
	}
	
	public double getMoney() {
		return myMoney;
	}
}