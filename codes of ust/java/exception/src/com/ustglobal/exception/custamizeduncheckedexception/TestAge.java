package com.ustglobal.exception.custamizeduncheckedexception;

public class TestAge {

	public static void main(String[] args) {
		System.out.println("main started");
		
		Validator v=new Validator();
		try {
			v.verify(12);
		} catch (InvalidAgeException ie) {
			System.out.println("invalid age exception occured");
		}
		v.verify(13);
		System.out.println("main ended");
	}

}
