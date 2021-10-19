package com.shristi.basic;

import java.util.Scanner;

public class PyramidStar2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String pattern = "";
		for (int i = number; i >0; i--) {
			pattern += "*".repeat(i) + " ";
		}
		System.out.println(pattern);

	}

}
