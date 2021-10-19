package com.shristi.basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		
		int copy = number;
		int last,len=0,sum = 0;
		
		while(copy>0) {
			copy = copy/10;
			len++;
		}
		
		int clone = number;
		while(clone>0) {
			last =  clone % 10;
			sum += (Math.pow(last, len));
			clone = clone/10;
		}
		
		if(sum == number) {
			System.out.println("It is an Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
		sc.close();
	}

}
