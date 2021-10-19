package com.shristi.basic;

import java.util.Scanner;

public class PatternTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
//		int temp = 1;
		String pattern ="";
		for(int i=1;i<=number;i++) {
			pattern += " ";
			for(int j=1; j<=number;j++) {
				pattern += j;
			}
		}
	System.out.println(pattern);	
	}

}
