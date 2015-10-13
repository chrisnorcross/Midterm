package com.cisc181.core;

public class PersonException extends Exception {
	private Person person;
	public PersonException(){
		super();
	}
	public PersonException(String message){
		super(message);
	}
}
