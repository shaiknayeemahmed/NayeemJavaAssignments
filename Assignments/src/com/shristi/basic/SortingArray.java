package com.shristi.basic;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		System.out.println("What is length of an array? ");
		Scanner sc = new Scanner(System.in);
		int sizeOfAnArray = sc.nextInt();
		int [] array = new int [sizeOfAnArray];
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<sizeOfAnArray;i++) {
			array[i] = sc.nextInt();
		}
		
		int temp = 0;
		int n = array.length;
		for (int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int var:array) {
			System.out.println(var);
		}

	}

}
