package com.ustglobal.lmbdaexpression;

public class TestMultiply {

	public static void main(String[] args) {
		MultipleInterface multi=(a,b)->a*b;
		int product=multi.multiply(20,10);
		System.out.println("Product is"+product);
	}

}
