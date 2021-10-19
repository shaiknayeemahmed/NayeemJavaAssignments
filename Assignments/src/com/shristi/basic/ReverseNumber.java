package com.shristi.basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		String Num = String.valueOf(number);
		StringBuffer result = new StringBuffer(Num);
		result.reverse();
		System.out.println(result);
		sc.close();
	}

}
