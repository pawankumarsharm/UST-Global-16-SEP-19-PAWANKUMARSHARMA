package com.ustglobal.exception;

public class TestC {

	public static void main(String[] args) {
		System.out.println("main started");
		
		int[] a= {10,20,30};
		int b=10;
		
		try {
			System.out.println(a[4]);
			
			System.out.println(b/0);
		} catch (ArithmeticException e) {
			System.out.println("number divided by zero");
		
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Array index not present");
		}
		
		System.out.println("main ended");
	}

}
