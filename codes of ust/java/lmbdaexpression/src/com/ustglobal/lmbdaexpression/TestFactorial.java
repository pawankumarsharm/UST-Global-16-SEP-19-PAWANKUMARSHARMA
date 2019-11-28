package com.ustglobal.lmbdaexpression;

public class TestFactorial {

	public static void main(String[] args) {
		FactorialInterface f=(x)->{
			int fac=1;
			for(int i=1;i<=x;i++) {
				fac=fac*i;
			}
			return fac;
			};
			int factorial=f.fact(5);
			System.out.println("factorial is "+factorial);
	}

}
