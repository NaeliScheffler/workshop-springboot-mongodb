package com.naeli.workshopmongo.services.exceptions;

public class ObjectNotFondException extends RuntimeException {

	private static final long serialVersionUID = 1L; 
	
	public ObjectNotFondException(String msg) {
		super(msg);
	}

}
