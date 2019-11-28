package com.ustglobal.objectclass;

public class TestA {

	public static void main(String[] args) {
		Student s=new Student(10,"pawan",79.89);
		int hash=s.hashCode();
		System.out.println("overriden hashcode is"+hash);
		System.out.println(s);
	}

}
