package com.shristi.basic;

import java.util.Scanner;

public class PyramidStar1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String pattern ="";
		for (int i=1;i<=number;i++) {
			pattern += "*".repeat(i) + " ";
		}
		System.out.println(pattern);

	}

}
