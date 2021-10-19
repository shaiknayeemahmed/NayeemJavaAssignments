package com.shristi.basic;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		System.out.println("What is length of an array? ");
		Scanner sc = new Scanner(System.in);
		int sizeOfAnArray = sc.nextInt();
		int [] array = new int [sizeOfAnArray];
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<sizeOfAnArray;i++) {
			array[i] = sc.nextInt();
		}
		
		int firstLargestValue,secondLargestValue;
		firstLargestValue = secondLargestValue= array[0];
		
		for(int i=0;i<array.length;i++) {
			if (array[i] > firstLargestValue)
            {
				secondLargestValue = firstLargestValue;
				firstLargestValue = array[i];
            }
 
            else if (array[i] > secondLargestValue && array[i] != firstLargestValue)
            	secondLargestValue = array[i];
			
		}
		System.out.println("Second Largest number is "+ secondLargestValue);
		sc.close();
		
	}

}
