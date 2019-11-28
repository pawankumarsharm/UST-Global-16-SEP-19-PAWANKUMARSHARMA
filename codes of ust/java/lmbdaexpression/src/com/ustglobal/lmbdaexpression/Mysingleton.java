package com.ustglobal.lmbdaexpression;

public class Mysingleton {
	private static Mysingleton instance=null;
	public String s;
	
	private Mysingleton() {
		
	}
	
	public static Mysingleton getDbConnection() {
		if(instance==null) {
			instance=new Mysingleton();
			return instance;
		}
		else {
			return instance;
		}
	}
}
