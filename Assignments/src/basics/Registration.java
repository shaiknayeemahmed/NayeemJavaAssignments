package basics;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String [] users = new String[] {"nayeem","Ahmed","shaik"};
		System.out.println("Enter name to register");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		boolean isPresent = false;
		for(String var:users) {
			if(var.equalsIgnoreCase(input)) {
				isPresent = true;
			}
			
		}
		if(isPresent==false) {
			System.out.println("You are registered");
			
		}
		else {
			System.out.println("Name is not unique");
			
		}
		sc.close();
		

	}

}
