package com.shristi.basic;

import java.util.Scanner;

public class SmallestInAnArray {

	public static void main(String[] args) {
			System.out.println("What is length of an array? ");
			Scanner sc = new Scanner(System.in);
			int sizeOfAnArray = sc.nextInt();
			int [] array = new int [sizeOfAnArray];
			System.out.println("Enter array elements: ");
			
			for(int i=0; i<sizeOfAnArray;i++) {
				array[i] = sc.nextInt();
			}
			 
			int smallerValue = array[0];
			for(int i=0;i<array.length;i++) {
				if(array[i] < smallerValue) {
					smallerValue = array[i];
				}
			}
			System.out.println("Smallest number is "+ smallerValue);
			sc.close();
		}

	

}
