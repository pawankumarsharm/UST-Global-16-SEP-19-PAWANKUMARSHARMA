package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(12);
		pq.add(24);
		pq.add(35);
		pq.add(35);
		
		//pq.add(null);//nullpointerexception
		//pq.add("hello");//classcastexception only generics allowed
		pq.offer(1);
		
		System.out.println("before poll"+pq);
		System.out.println("*****using Iterator*********");
		Iterator<Integer> it=pq.iterator();
		while(it.hasNext()) {
 		}
		
		
	}

}
