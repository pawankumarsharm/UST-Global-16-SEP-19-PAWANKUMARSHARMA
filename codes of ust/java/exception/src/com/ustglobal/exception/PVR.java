package com.ustglobal.exception;

public class PVR {
	public void book() {
		System.out.println("booking started");
		
		try {
			System.out.println(10/0);
			System.out.println("looking for booking");
			System.out.println("booking confirmed");
		} catch (ArithmeticException ae) {
			System.out.println("booking failed");
			throw ae;
		}
		
	}

}
