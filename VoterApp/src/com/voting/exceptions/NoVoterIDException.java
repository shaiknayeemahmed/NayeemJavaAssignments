package com.voting.exceptions;

public class NoVoterIDException extends NotEligibleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoVoterIDException() {

	}

	public NoVoterIDException(String message) {
		super(message);

	}

}
