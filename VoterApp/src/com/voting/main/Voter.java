package com.voting.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.voting.exceptions.LocalityNotFoundException;
import com.voting.exceptions.NoVoterIDException;
import com.voting.exceptions.NotEligibleException;
import com.voting.exceptions.UnderAgeException;
import com.voting.service.ElectionBooth;

public class Voter {

	public static void main(String[] args) throws NotEligibleException {
		ElectionBooth booth = new ElectionBooth();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
booth.checkAge(age);
		
		try {
			booth.checkAge(age);
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
			System.exit(0);

		}

		System.out.println("Enter Locality: ");
		String locality = sc.next();
		
		try {
			booth.checkLocality(locality);
		} catch (LocalityNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);

		}
		
		System.out.println("Enter VoterID no. ");
		int voterId = sc.nextInt();

		try {
			booth.checkVoterId(voterId);
		} catch (NoVoterIDException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

		try {
			booth.checkEligibility(age, locality, voterId);
		} catch (NotEligibleException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		sc.close();
	}

}
