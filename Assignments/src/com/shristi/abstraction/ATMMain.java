package com.shristi.abstraction;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {

		Bank bank;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("For Savings Account PRESS 1 " + '\n' + "For current Account PRESS 2");
		int accType = sc.nextInt();

		switch (accType) {
		case 1:
			System.out.println("Savings Account");

			break;
		case 2:
			System.out.println("Current Account");
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
		System.out.println();

		System.out.println("Your Balance : Rs. 1,00,000");

		System.out.println("For Withdrawal PRESS 3" + '\n' + "For Deposit PRESS 4");
		int mode = sc.nextInt();

		switch (mode) {
		case 3:
			System.out.println();
			System.out.println("Selected Withdrawal");
			break;
		case 4:
			System.out.println();
			System.out.println("Selected Deposit");
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}

		if (accType == 1 && mode == 3) {
			System.out.println("Saving Account Withdrawal Request");
			System.out.println("Enter Your Withdrawal Amount");
			double amt = sc.nextDouble();
			bank = new Savings(100000);
			bank.withdraw(amt);
			System.out.println("Current Bal :" + bank.getBalance());

		} else if (accType == 2 && mode == 3) {
			System.out.println("Current Account Withdrawal");
			System.out.println("Enter Your withdraw Amount");
			double amt = sc.nextDouble();
			bank = new Savings(100000);
			bank.withdraw(amt);
			System.out.println("Current Bal :" + bank.getBalance());
		}

		else if (accType == 1 && mode == 4) {
			System.out.println();
			System.out.println("Savings Account Deposit");
			System.out.println("Enter Your Deposit Amount");
			double amt = sc.nextDouble();
			bank = new Current(100000);
			bank.deposit(amt);
			System.out.println("Current Bal :" + bank.getBalance());
		}

		else if (accType == 2 && mode == 4) {
			System.out.println("Current Account Deposit Request");
			System.out.println("Enter Your Deposit Amount");
			double amt = sc.nextDouble();
			bank = new Current(100000);
			bank.deposit(amt);
			System.out.println("Current Bal :" + bank.getBalance());
		}

		sc.close();
	}

}
