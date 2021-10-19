package com.shristi.basic;

import java.util.Scanner;

public class SecondSmallest {
    

	public static void main(String[] args) {
		System.out.println("What is length of an array? ");
		Scanner sc = new Scanner(System.in);
		int sizeOfAnArray = sc.nextInt();
		int [] array = new int [sizeOfAnArray];
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<sizeOfAnArray;i++) {
			array[i] = sc.nextInt();
		}
		 
		int firstSmallerValue,secondSmallerValue;
		secondSmallerValue = firstSmallerValue= array[0];
		
		for(int i=0;i<array.length;i++) {
			if (array[i] < firstSmallerValue)
            {
				secondSmallerValue = firstSmallerValue;
                firstSmallerValue = array[i];
            }
 
            else if (array[i] < secondSmallerValue && array[i] != firstSmallerValue)
            	secondSmallerValue = array[i];
			
		}
			
		System.out.println("Second Smallest number is "+ secondSmallerValue);
		sc.close();
	}

}
