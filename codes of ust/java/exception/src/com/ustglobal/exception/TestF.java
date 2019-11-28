package com.ustglobal.exception;

public class TestF
{

	public static void main(String[] args) {
		System.out.println("main started");
		int a[]= {10,20,30};
		String s="hello";
		int b=10;
		try {
			
			String s1=s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		} 
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception occured");
		}
		
		
		System.out.println("main ended");
	}

}
