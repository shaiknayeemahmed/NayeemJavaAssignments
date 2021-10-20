package basics;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println("What is length of an array? ");
		Scanner sc = new Scanner(System.in);
		int sizeOfAnArray = sc.nextInt();
		int [] array = new int [sizeOfAnArray];
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<sizeOfAnArray;i++) {
			array[i] = sc.nextInt();
		}
		
		for(int var:array) {
			System.out.println(Math.sqrt(var));
		}
		sc.close();
	}

}
