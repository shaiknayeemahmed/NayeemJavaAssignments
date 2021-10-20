package com.shristi.basic;

import java.util.Scanner;

public class PyramidStar1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int row=0;row<number;row++) {
			for(int col=0;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
