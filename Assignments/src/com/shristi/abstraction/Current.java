package com.shristi.abstraction;

public class Current extends Bank {

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		balance -= amount;

	}

	@Override
	void deposit(double amount) {
		balance += amount;

	}

}
