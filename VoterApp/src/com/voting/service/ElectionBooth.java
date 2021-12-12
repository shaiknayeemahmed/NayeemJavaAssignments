package com.voting.service;

import com.voting.exceptions.*;

public class ElectionBooth {
	String localities[] = { "GandhiNagar", "RKPuram", "Madhapur", "Ameerpet", "HitechCity" };

	// if the age is less than 18 throws exception
	public boolean checkAge(int age) throws UnderAgeException {
		boolean isPresent = false;
		if (age >= 18) {
			isPresent = true;
		}
		if (isPresent == false) {
			throw new UnderAgeException("Under Age Exception: you are under age");
		}
		return isPresent;

	}

	// check if the locality matches with the array elements
	public boolean checkLocality(String locality) throws LocalityNotFoundException {
		boolean isPresent = false;
		for (String area : localities) {
			if (locality.equalsIgnoreCase(area)) {
				isPresent = true;
			}
		}
		if (isPresent == false) {
			throw new LocalityNotFoundException("Locality Not found Exception: locality not found");
		}
		return isPresent;
	}

	// check if id is between 1000 to 9000
	public boolean checkVoterId(int voterId) throws NoVoterIDException {
		boolean isPresent = false;
		if (voterId >= 1000 && voterId <= 9000) {
			isPresent = true;
		}
		if (isPresent == false) {
			throw new NoVoterIDException("No Voter Id Exception: your voter Id is invalid");
		}
		return isPresent;

	}

	public boolean checkEligibility(int age, String locality, int voterId) throws NotEligibleException {

		// call all three methods
		// handle the exception
		// show it to user
		boolean isPresent = false;

		if (checkAge(age) && checkLocality(locality) && checkVoterId(voterId)) {
			isPresent = true;
			System.out.println("You are eligible to cast vote");
		}

		if (isPresent == false) {
			throw new NotEligibleException("Not Eligible to vote");
		}
		return isPresent;
	}

}
