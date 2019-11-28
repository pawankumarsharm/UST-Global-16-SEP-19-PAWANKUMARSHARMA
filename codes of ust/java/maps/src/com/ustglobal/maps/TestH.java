package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
public static void main(String[] args) {
	Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
	ht.put(101, "ajay");
	ht.put(102, "vijay");
	ht.put(103, "sonu");
	ht.put(104, "monu");
	ht.put(101, "sriram");
	//ht.put(108, null);//nullpointerexception
	//ht.put(null, "john");//nullpointer exception
	
	
	System.out.println("Data"+ht);
}
}
