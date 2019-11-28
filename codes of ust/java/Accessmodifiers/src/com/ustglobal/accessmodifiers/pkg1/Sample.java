package com.ustglobal.accessmodifiers.pkg1;

public class Sample extends Demo{
public static void main(String[] args) {
	Demo d=new Demo();
	//System.out.println(d.a);
	//d.add();
	Sample s=new Sample();
	System.out.println(d.b);//default
	d.sub();//protected
	System.out.println(s.c);
	d.mul();//public
	System.out.println(d.name);
	d.div();
}
}
