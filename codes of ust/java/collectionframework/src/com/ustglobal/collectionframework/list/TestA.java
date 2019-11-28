package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(22.5);
		al.add("chinnu");
		al.add(true);
		al.add(null);
		al.add('A');
		
		Object ol=al.get(2);
		System.out.println(ol);
		
		for(int i=0;i<6;i++) {
			Object obj=al.get(i);
			System.out.println(obj);
		}
	}

}
/*chinnu
12
22.5
chinnu
true
null
A

*/