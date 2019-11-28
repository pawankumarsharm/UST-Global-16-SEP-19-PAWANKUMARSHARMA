package com.ustglobal.exception.second;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Age");
			int age=sc.nextInt();
		}
	}

}
