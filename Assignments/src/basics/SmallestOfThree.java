package basics;

import java.util.Scanner;

public class SmallestOfThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] array = new int [3];
		for(int i=0; i<3;i++) {
			array[i] = sc.nextInt();
		}
		
		String result = (array[0]<array[1]) && (array[0]<array[1])?array[0] +" is Smaller":(array[1]<array[2])?array[1] +" is Smaller":array[2] +" is Smaller";
		System.out.println(result);
		sc.close();

	}

}
