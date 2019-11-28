package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestF {
public static void main(String[] args) {
	
	TreeSet<String> ls=new TreeSet<String>();
	ls.add("roopa");
	ls.add("jaya");
	ls.add("sushma");
	ls.add("munni");
	ls.add("sheela");
	
	System.out.println("************using for each*******");
	for (String s : ls) {
		System.out.println(s);
	}
	
	System.out.println("******using iterator******");
	Iterator<String> it=ls.iterator();
	while(it.hasNext()) {
		String p=it.next();
		System.out.println(p);
	}

}
}
