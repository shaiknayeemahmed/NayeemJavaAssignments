package com.voting.main;

import java.util.Scanner;

import com.voting.exceptions.NotEligibleException;
import com.voting.service.ElectionBooth;

public class Voter {

	public static void main(String[] args) throws NotEligibleException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter Locality: ");
		String locality = sc.next();
		System.out.println("Enter VoterID no. ");
		int vid = sc.nextInt();
		
		ElectionBooth booth  = new ElectionBooth();
		
		
		try {
			booth.checkEligibility(age,locality,vid);
		}
		catch(NotEligibleException e) {
			System.out.println(e.getMessage());
		}
	}

}
