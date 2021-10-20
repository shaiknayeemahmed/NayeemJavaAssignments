package basics;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String [] users = new String[] {"nayeem","Ahmed","shaik"};
		System.out.println("Enter name to login");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		boolean isPresent = false;
		for(String var:users) {
			if(var.equalsIgnoreCase(input)) {
				isPresent = true;
			}
			
		}
		if(isPresent==false) {
			System.out.println("Invalid username");
			
		}
		else {
			System.out.println("You are logged in successfully");
			
		}
		sc.close();

	}

}
