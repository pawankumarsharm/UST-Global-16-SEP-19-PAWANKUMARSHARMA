package com.ustglobal.arrays;

public class TestB {

	public static void main(String[] args) {
		int[] nums= {10,20,30,40};
//		System.out.println(nums[10]);ArrayIndexOutOfBoundException
		
		recieve(nums);
		int values[]=getArray();
		
		for (int i : values) {
			System.out.println(i);
		}
		
	}
	String[] s=stringArray();
		static void recieve(int[] numbers) {
		for (int i : numbers) {
			System.out.println(i);
		}
	}
	
	
	static int[] getArray() {
		int[] values= {20,30,40,50};
		return values;
	}


static String[] stringArray() {
	String[] s= {"priya","pawan","abhi"};
	return s;
}
}