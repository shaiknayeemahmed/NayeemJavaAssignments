package com.shristi.basic;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		System.out.println("What is length of an array? ");
		Scanner sc = new Scanner(System.in);
		int sizeOfAnArray = sc.nextInt();
		int [] array = new int [sizeOfAnArray];
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<sizeOfAnArray;i++) {
			array[i] = sc.nextInt();
		}
		int arrLen = array.length;
		int Sum =0;
		for (int i= 0;i<arrLen;i++) {
			Sum += array[i];
		}
		
		System.out.println("Sum of numbers : "+ Sum);
		System.out.println("Average of numbers : "+ Sum/arrLen);
		sc.close();

	}

}
