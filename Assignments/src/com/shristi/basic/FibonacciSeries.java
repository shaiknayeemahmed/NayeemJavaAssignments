package com.shristi.basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int number1 = 0, number2=1, number3 = 0;
		while(input>0){
			if(input>0) {
				number3 = number1 + number2;
				number1 = number2;
				number2 = number3;
				System.out.println(number3);
			}
			input--;
			
		}
		
		
		sc.close();
		

	}

}
