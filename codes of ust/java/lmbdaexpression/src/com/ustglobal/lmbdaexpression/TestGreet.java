package com.ustglobal.lmbdaexpression;

public class TestGreet {

	public static void main(String[] args) {
		GreeteInterface gt=(msg)->{
			System.out.println("Hello");
			System.out.println(msg);
		};
		gt.greet("pawan");
	}

}
