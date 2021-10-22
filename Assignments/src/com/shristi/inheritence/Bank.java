package com.shristi.inheritence;

public class Bank {
	double balance;

	public Bank(double balance) {
		this.balance = balance;
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	void deposit(double amount) {
		balance += amount;
	}
	
	double getBalance() {
		return balance;
	}
}
