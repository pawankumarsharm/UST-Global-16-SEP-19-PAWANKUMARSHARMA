package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
public static void main(String[] args) {
	Employee e1=new Employee(1,"pawan", 1000000);
	Employee e2=new Employee(2,"priyanka", 2000000);
	Employee e3=new Employee(3,"anushka", 3000000);
	Employee e4=new Employee(4,"reshu", 4000000);
	Employee e5=new Employee(5,"saumen", 5000000);
	Employee e6=new Employee(6,"priya", 6000000);
	Employee e7=new Employee(7,"abhinav", 7000000);
	Employee e8=new Employee(8,"swati", 8000000);
	Employee e9=new Employee(9,"swatima", 9000000);
	Employee e10=new Employee(10,"shama",10000000);
	
	
	ArrayList<Employee> al=new ArrayList<Employee>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	
	ArrayList<Employee> al1=new ArrayList<Employee>();
	al.add(e4);
	al.add(e5);
	al.add(e6);
	
	ArrayList<Employee> al2=new ArrayList<Employee>();
	al.add(e7);
	al.add(e8);
	al.add(e9);
	al.add(e10);
	
	
	HashMap<String, ArrayList<Employee>> hm=new HashMap<>();
	hm.put("first", al);
	hm.put("second", al1);
	hm.put("third", al2);
	
	ArrayList<Employee> second=hm.get("second");
	
	Iterator<Employee> it=second.iterator();
	while(it.hasNext()) {
		Employee e=it.next();
		System.out.println("id is"+e.id);
		System.out.println("name is"+e.name);
		System.out.println("id is"+e.salary);
		System.out.println("============================");
		
	}
	
	
	
}
}
