package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		SortByName2 sc=new SortByName2();
		//SortByPin sp=new SortByPin();
		//SortByMicr sm=new SortByMicr();
		TreeSet<Customer> ts=new TreeSet<Customer>(sc);

		Customer b1=new Customer("pawan",56,150000);
		Customer b2=new Customer("priyanka",71,45000);
		Customer b3=new Customer("soumen",54,454000);
		Customer b4=new Customer("anushka",65,676822);
		Customer b5=new Customer("reshu",76,67682);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
	
		System.out.println("**using Iterator******");
		Iterator<Customer> it=ts.iterator();
		while(it.hasNext()) {
			Customer b=it.next();
			System.out.println("Nmae is "+b.name);
			System.out.println("Pincode is "+b.id);
			System.out.println("micr  is "+b.salary);
			System.out.println("************");
		}
	
	}

}
