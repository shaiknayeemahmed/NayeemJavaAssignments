package com.shristi.basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		boolean result = false;
		
		if (input == 0 || input == 1) {
			System.out.println("Not a prime Number");
		} else {

			for (int i = 2; i <= (input/2); i++) {
				
				if (input % i == 0) {
					System.out.println("Not a Prime Number");
					result = true;
					break;
				}
			
			}
		}
		if (result == false) {
			System.out.println("Prime Number");
		}
		
		sc.close();

	}

}
