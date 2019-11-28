package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestE {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Pen p=new Pen(23000,"abc","red");
		Pen p1=new Pen(28000,"def","yellow");
		Pen p2=new Pen(25000,"ghi","blue");
	}
	
	static void displayDetails(ArrayList<Pen> a) {
		Iterator<Pen> it=a.iterator();
		while(it.hasNext()) {
			Pen s=it.next();
			System.out.println("price is"+s.price);
			System.out.println("brand is"+s.brand);
			System.out.println("color is"+s.color);
		}
	}

}
