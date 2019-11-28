package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestF {
public static void main(String[] args) {
	
	ArrayList<Marker> al=new ArrayList<Marker>();
	al.add(new Marker(23000,"red"));
	al.add(new Marker(25000,"yellow"));
	al.add(new Marker(27000,"black"));
	
	System.out.println("before sorting.......>");
	display(al);
	SortByPrice sb=new SortByPrice();
	Collections.sort(al,sb);
	System.out.println("after sorting based on price");
	display(al);
	SortByColor sc=new SortByColor();
	Collections.sort(al,sc);
	System.out.println("after sorting based on color");
	display(al);
}

static void display(ArrayList<Marker> al) {
	Iterator<Marker> it=al.iterator();
	while(it.hasNext()) {
		Marker m=it.next();
		System.out.println("price is"+m.price);
		System.out.println("color is"+m.color);
		System.out.println("========================");
	}
}
}
