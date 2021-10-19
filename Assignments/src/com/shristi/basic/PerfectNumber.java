package com.shristi.basic;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int count = 1;
		int sum = 0;
		while(count <= number/2) {
			if(number%count==0) {
				sum = sum + count;
			}
			
			count++;
		}
		
		if (sum == number) {
			System.out.println("It is a perfect number");
		}
		else {
			System.out.println("Not a perfect Number");
		}
		sc.close();
		
	}

}
