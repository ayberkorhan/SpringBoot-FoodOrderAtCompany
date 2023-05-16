package com.example.foodDelivery.Exceptions;

import java.util.NoSuchElementException;

public class EmpNotFoundException extends NoSuchElementException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmpNotFoundException() {
		super("No employee found");
	}

}
