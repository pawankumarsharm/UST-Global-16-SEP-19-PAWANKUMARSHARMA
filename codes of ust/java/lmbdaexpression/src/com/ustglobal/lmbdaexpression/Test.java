package com.ustglobal.lmbdaexpression;

public class Test {

	public static void main(String[] args) {
		Mysingleton ms=Mysingleton.getDbConnection();
		ms.s="Hello";
		System.out.println("HashCode of ms"+ms.hashCode());
		Mysingleton mx=Mysingleton.getDbConnection();
		mx.s="Hi";
		System.out.println("HashCode of mx"+mx.hashCode());
		
		System.out.println(ms.s);
		System.out.println(mx.s);
	}

}
