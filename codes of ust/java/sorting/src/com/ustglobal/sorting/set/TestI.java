package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		//SortByName sb=new SortByName();
		//SortByPin sp=new SortByPin();
		SortByMicr sm=new SortByMicr();
		TreeSet<Bank> ts=new TreeSet<Bank>(sm);

		Bank b1=new Bank("HDFC",560068,6768689);
		Bank b2=new Bank("SBI",560071,67558689);
		Bank b3=new Bank("CITI",560054,676865689);
		Bank b4=new Bank("CANARA",560076,676822689);
		Bank b5=new Bank("CANARA",560076,676822689);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
	
		System.out.println("**using Iterator******");
		Iterator<Bank> it=ts.iterator();
		while(it.hasNext()) {
           Bank b=it.next();
			System.out.println("Nmae is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("micr  is "+b.micr);
			System.out.println("************");
		}
	
	}

}
