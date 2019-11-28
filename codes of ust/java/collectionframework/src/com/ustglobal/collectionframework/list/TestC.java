package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(23);
		al.add(98.7);
		al.add(true);
		al.add("Good Evening");
		
		System.out.println("=========Iterator=======");
		Iterator it=al.iterator();
		Object ol=it.next();
		System.out.println("obj1"+ol);
		
		Object o2=it.next();
		System.out.println("obj2"+o2);
		
		Object o3=it.next();
		System.out.println("obj3"+o3);
		
		Object o4=it.next();
		System.out.println("obj4"+o4);
		
		boolean b=it.hasNext();
		System.out.println("Has Next"+b);
		
		/*
		 * Object o5=it.next();
		 *  System.out.println("obj5"+o5);//nosuchelementexception
		 */
		
		
		
		System.out.println("====using for loop=====");
		for(int i=0;i<al.size();i++) {
			Object o=al.get(i);
			System.out.println(o);
		}
		
		ArrayList al1=new ArrayList();
		al1.add(13);
		al1.add(233.4);
		al1.add(true);
		al1.add("momo");
		
		System.out.println("=====using iterator while loop");
		Iterator i=al.iterator();
		while(i.hasNext()) {
			Object o1=i.next();
			System.out.println(o1);
		}
		
		for(;it.hasNext();) {
			Object ob=i.next();
			System.out.println(ob);
		}
	}

}

//=========Iterator=======
//obj123
//obj298.7
//obj3true
//obj4Good Evening
//Has Nextfalse

//====using for loop=====
//23
//98.7
//true
//Good Evening

//=====using iterator while loop
//23
//98.7
//true
//Good Evening

