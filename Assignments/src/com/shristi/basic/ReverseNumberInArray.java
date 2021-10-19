package com.shristi.basic;

import java.util.Scanner;

public class ReverseNumberInArray {

	public static void main(String[] args) {
		System.out.println("What is length of an array? ");
		Scanner sc = new Scanner(System.in);
		int sizeOfAnArray = sc.nextInt();
		int [] array = new int [sizeOfAnArray];
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<sizeOfAnArray;i++) {
			array[i] = sc.nextInt();
		}
		int n = array.length;
		int[] result = new int[n];
		int temp = n;
		for (int i=0;i<n;i++) {
			result[temp - 1] = array[i];
			temp--;
		}
		
		for(int var:result) {
			System.out.println(var);
		}
		sc.close();
	}

}
