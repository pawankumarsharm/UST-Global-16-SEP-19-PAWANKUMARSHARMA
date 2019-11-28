package com.ustglobal.arrays;

public class TestC {

	public static void main(String[] args) {
		Student s1=new Student(1,"abc",76.89);
		Student s2=new Student(2,"def",87.99);
		Student s3=new Student(3,"ghi",45.56);
		
		Student[] student=new Student[3];
		
		student[0]=s1;
		student[1]=s2;
		student[2]=s3;
		
		for (Student s : student) {
			System.out.println(s);
		}
	}
	static void receive(Student[] stu) {
		for (Student s : stu) {
			System.out.println(s);
		}
	}

}
