package com.shristi.basic;

import java.util.Scanner;

public class PatternOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int temp = 1;
		String pattern ="";
		for(int i=0;i<number;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(temp+" ");
				
			}
			temp++;
			System.out.println();
		}
	}

}
