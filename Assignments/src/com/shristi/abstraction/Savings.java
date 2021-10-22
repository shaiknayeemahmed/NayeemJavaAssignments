package com.shristi.abstraction;

public class Savings extends Bank {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		
		balance -=amount * 1.01;
	}

	@Override
	void deposit(double amount) {
		balance +=amount;
		
	}
	
	
	

}
