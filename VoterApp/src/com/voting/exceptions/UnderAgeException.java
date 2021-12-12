package com.voting.exceptions;

public class UnderAgeException extends NotEligibleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnderAgeException() {

	}

	public UnderAgeException(String message) {
		super(message);

	}

}
