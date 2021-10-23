package com.voting.service;

import com.voting.exceptions.*;

public class ElectionBooth {
	String localities[] = { "GandhiNagar", "Urmilanagar", "RKPuram" };

	// if age is less than 18 throw exception
	boolean checkAge(int age) throws UnderAgeException {
		if (age >= 18) {
			return true;
		}
		return false;
		
	}

	// check if the locality matches with the array
	boolean checkLocality(String locality) throws LocalityNotFoundException {
		for (String var : localities) {
			if (locality.equalsIgnoreCase(var)) {
				return true;
			}
		}
		
		return false;
	}

	// check if id is within 1000 - 9000
	boolean checkVoterId(int vid) throws NoVoterIDException {
		if (vid >= 1000 && vid <= 9000) {
			return true;
		}
		return false; 

	}

	public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
		// call all three methods
		// handle the exception
		// throw it to the voter
		
		
		if(
			checkAge(age)&&
			checkLocality(locality)&&
			checkVoterId(vid)) {
			
			System.out.println("You are eligible to cast vote");
		}
		else {
			throw new NotEligibleException("Not Eligible to vote");
		}
		
		return true;
	}

}
