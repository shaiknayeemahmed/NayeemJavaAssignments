package com.voting.service;

import com.voting.exceptions.*;

public class ElectionBooth {
	String localities[] = { "GandhiNagar", "RKPuram","Madhapur","Ameerpet" };

	// if age is less than 18 throw exception
	public boolean checkAge(int age) throws UnderAgeException {
		if (age >= 18) {
			return true;
		}
		else {
			throw new UnderAgeException("Under Age Exception: you are not eligible");
		}
		
	}

	// check if the locality matches with the array
	public boolean checkLocality(String locality) throws LocalityNotFoundException {
		for (String area : localities) {
			if (locality.equalsIgnoreCase(area)) {
				return true;
			}
			else {
				throw new LocalityNotFoundException("Locality not Found Exception: your locality not found");
			}
		}
		
		
		return false;
	}

	// check if id is within 1000 - 9000
	public boolean checkVoterId(int voterId) throws NoVoterIDException {
		if (voterId >= 1000 && voterId <= 9000) {
			return true;
		}
		else {
			throw new NoVoterIDException("No Voter Id Exception: your voter Id is invalid");
		}
		

	}

	public boolean checkEligibility(int age, String locality, int voterId) throws NotEligibleException {
		// call all three methods
		// handle the exception
		// throw it to the voter
		
		
		if(
			checkAge(age)&&
			checkLocality(locality)&&
			checkVoterId(voterId)) {
			
			System.out.println("You are eligible to cast vote");
		}
		else {
			throw new NotEligibleException("Not Eligible to vote");
		}
		
		return true;
	}

}
