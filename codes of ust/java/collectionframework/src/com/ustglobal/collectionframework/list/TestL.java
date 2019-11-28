package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
public static void main(String[] args) {
	LinkedList<Integer> l=new LinkedList<Integer>();
	l.add(12);
	l.add(13);
	l.add(34);
	l.add(3);
	l.add(10);
	//l.add(null);//null pointer exception
	
	System.out.println("before sort"+l);
	Collections.sort(l);
	System.out.println("after sort"+l);

	Collections.reverse(l);
	System.out.println("after reverse"+l);
	
	Collections.shuffle(l);//it randamoly shuffle the elements
	System.out.println("after shuffle"+l);

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

