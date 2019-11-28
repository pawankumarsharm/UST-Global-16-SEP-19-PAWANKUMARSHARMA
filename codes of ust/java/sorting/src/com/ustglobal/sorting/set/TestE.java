package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestE {
public static void main(String[] args) {
	TreeSet ls=new TreeSet();
	ls.add(34);
	ls.add(45);
	ls.add(89);
	ls.add(39);
	ls.add(9);//treeset only store generics means same type of data
//	ls.add("deepika");//class cast exception
//	ls.add(null);//null pointerexception
	System.out.println("************using for each*******");
	for (Object o : ls) {
		System.out.println(o);
	}
	
	System.out.println("******using iterator******");
	Iterator it=ls.iterator();
	while(it.hasNext()) {
		Object p=it.next();
		System.out.println(p);
	}

}
}
