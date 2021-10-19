package com.shristi.basic;

import java.util.Scanner;

public class GreatestInAnArray {

	public static void main(String[] args) {
		System.out.println("What is length of an array? ");
		Scanner sc = new Scanner(System.in);
		int sizeOfAnArray = sc.nextInt();
		int [] array = new int [sizeOfAnArray];
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<sizeOfAnArray;i++) {
			array[i] = sc.nextInt();
		}
		
		int greaterValue = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i] > greaterValue) {
				greaterValue = array[i];
			}
		}
		System.out.println("Greater In An Array is "+ greaterValue);
		sc.close();
	}

}
