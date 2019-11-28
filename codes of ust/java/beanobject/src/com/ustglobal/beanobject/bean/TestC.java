package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		System.out.println("Scanner class");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println( "Age is "+age);
		
		System.out.println("are you male?");
		boolean b=sc.nextBoolean();
		System.out.println(b);
		
		
	}

}
