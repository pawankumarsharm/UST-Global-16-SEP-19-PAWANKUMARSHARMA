package com.ustglobal.exception;

public class TestG {

	public static void main(String[] args) {
		System.out.println("main started");
		
		PayTm p=new PayTm();
		
		try {
			
			p.book();
		} 
		catch (ArithmeticException ae) {
			
			System.out.println("exception caught in main");
		}
		
		finally {
			
			System.out.println("executing finnaly");
		}
		
		System.out.println("main ended");
	}

}
