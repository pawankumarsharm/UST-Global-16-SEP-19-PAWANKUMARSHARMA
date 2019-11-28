package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(101,"ankita",45.55);
		Student s2=new Student(123,"pawan",56.88);
		Student s3=new Student(456,"anushka",78.99);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i=0;i<al.size();i++) {
			Student s=al.get(i);
			System.out.println("Id is"+s.id);
			System.out.println("Name is"+s.name);
			System.out.println("percentage is"+s.percentage);
		}
		
		System.out.println("==for each==");
		for (Student student : al) {
			System.out.println(student);
		}
	}
}

//Id is101
//Name isankita
//percentage is45.55
//Id is123
//Name ispawan
//percentage is56.88
//Id is456
//Name isanushka
//percentage is78.99
//==for each==
//Student [id=101, name=ankita, percentage=45.55]
//Student [id=123, name=pawan, percentage=56.88]
//Student [id=456, name=anushka, percentage=78.99]

