package com.ustglobal.objectclass;

public class TestD {

	public static void main(String[] args) {
		Car c=new Car(2000000,"bmw","yellow");
		int hashcode=c.hashCode();
		System.out.println("overridden is"+hashcode);
		System.out.println(c);
	}

}
