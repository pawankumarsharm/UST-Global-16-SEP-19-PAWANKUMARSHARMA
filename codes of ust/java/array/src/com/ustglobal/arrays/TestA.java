package com.ustglobal.arrays;

public class TestA {

	public static void main(String[] args) {
		int[] nums=new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("================");
		for(int i:nums)
		{
			System.out.println(i);
		}
		System.out.println("================");
		char ch[]= {'a','b','c','d','e'};
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("=================");
		for (int c : ch) {
			System.out.println(c);
		}
		
		System.out.println("===============");
		boolean[] b= {true,false,true,false,true,true};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b);
		}
		for (boolean c : b) {
			System.out.println(b);
		}
		System.out.println("=================");
		byte[] d= {0,1,12,3,6,9};
		for (int i = 0; i < d.length; i++) {
			System.out.println(d);
		}
		for (byte c : d) {
			System.out.println(d);
		}
		System.out.println("================");
		
		double d1[]= {12.32,434.232,7.3,9.5};
		for (int i = 0; i < d1.length; i++) {
			System.out.println(d1);
		}
		
		for (double e : d1) {
			System.out.println(d1);
		}
		System.out.println("================");
	
	String names[]= {"abc","ef","defg","pawan","priya"};
	for(String s:names) {
	System.out.println(names);
	}
	}
}
