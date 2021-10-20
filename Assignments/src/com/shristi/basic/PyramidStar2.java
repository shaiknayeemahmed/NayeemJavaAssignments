package com.shristi.basic;

import java.util.Scanner;

public class PyramidStar2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int row=number;row>0;row--) {
			for(int col=row;col>0;col--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
