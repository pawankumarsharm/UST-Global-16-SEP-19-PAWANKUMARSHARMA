package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("anupama");
		al.add("sabita");
		al.add("kavita");
		al.add("sunita");
		
		String name=al.get(0);
		System.out.println(name.toUpperCase());

		System.out.println("===using iterator====");
		Iterator<String> li=al.iterator();
		while(li.hasNext()) {
			String s=li.next();
			System.out.println(s);
		}

		System.out.println("==========using list iterator====");
		ListIterator<String> l=al.listIterator();
		while(l.hasNext()) {
			String s=l.next();
			System.out.println(s);
		}
		
		System.out.println("===using for each loop");
		for(String n:al) {
			System.out.println(n);
		}
	}
}

//ANUPAMA
//===using iterator====
//anupama
//sabita
//kavita
//sunita

//==========using list iterator====
//anupama
//sabita
//kavita
//sunita

//===using for each loop
//anupama
//sabita
//kavita
//sunita

