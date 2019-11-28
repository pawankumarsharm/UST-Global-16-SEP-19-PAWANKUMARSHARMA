package com.ustglobal.java8.predicate1;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		Predicate<Integer> p=age->{
			if(age>18) {
				return true;
			}
			else {
				return false;
			}
		};
		boolean res=p.test(22);
		System.out.println("Result "+res);
	}

}
