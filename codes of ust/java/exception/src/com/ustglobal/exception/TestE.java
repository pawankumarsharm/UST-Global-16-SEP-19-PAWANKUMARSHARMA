package com.ustglobal.exception;

public class TestE {

	public static void main(String[] args) {
		System.out.println("main started");
		int a[]= {10,20,30};
		String s="hello";
		int b=10;
		try {
			String s2=null;
			String s1=s2.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		} catch (NullPointerException npe) {
			System.out.println("dont play with null");
		
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("index not present");
		}catch(ArithmeticException ae) {
			System.out.println("not devide by zero");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("main ended");
	}

}
