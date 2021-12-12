package com.voting.exceptions;

public class LocalityNotFoundException extends NotEligibleException {

	private static final long serialVersionUID = 1L;

	public LocalityNotFoundException() {

	}

	public LocalityNotFoundException(String message) {
		super(message);

	}

}
