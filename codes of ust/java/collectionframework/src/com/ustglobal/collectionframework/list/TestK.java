package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(34.5);
		al.add(23.5);
		al.add(87.5);
		al.add(12.5);
		al.add(34.5);
		al.add(null);
		al.add(null);
	
	System.out.println(al);
	al.add(2,54.6);
	System.out.println("after add in 2nd index"+al);
	al.remove(0);
	System.out.println("after removed 0th index"+al);
	al.remove(null);
	System.out.println("after removing null"+al);
	Double val=al.get(4);
	System.out.println("Object at 4th index"+al);
	al.set(2, 77.6);
	System.out.println("after replacing 2nd index"+al);
	al.clear();
	System.out.println("after clear method"+al);
	al.contains(54.6);
	
	List<Double> al1=new ArrayList<>();
	al1.add(12.3);
	al1.add(23.4);
	al1.add(34.5);
	
	al.addAll(al1);
	System.out.println("after addAll"+al);
	
	boolean contain=al.containsAll(al1);
	System.out.println("contains all of al1"+contain);
	
 boolean res=al.removeAll(al1);
 System.out.println("Removed All of al1"+res);
 System.out.println("after remove"+al);
	}
}

//[34.5, 23.5, 87.5, 12.5, 34.5, null, null]
//after add in 2nd index[34.5, 23.5, 54.6, 87.5, 12.5, 34.5, null, null]
//after removed 0th index[23.5, 54.6, 87.5, 12.5, 34.5, null, null]
//after removing null[23.5, 54.6, 87.5, 12.5, 34.5, null]
//Object at 4th index[23.5, 54.6, 87.5, 12.5, 34.5, null]
//after replacing 2nd index[23.5, 54.6, 77.6, 12.5, 34.5, null]
//after clear method[]
//after addAll[12.3, 23.4, 34.5]
//contains all of al1true
//Removed All of al1true
//after remove[]

