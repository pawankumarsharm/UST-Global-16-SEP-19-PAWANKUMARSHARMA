package com.ustglobal.exception.custamizeduncheckedexception;

public class Validator {
	void verify(int age) {
		if(age<18) {
			throw new InvalidAgeException("Better luck next time!!!!!");
		}
	}

	public void verify1(int age) {
		
	}
}
