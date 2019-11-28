package java8;

import java.util.ArrayList;

public class TestG {
public static void main(String[] args) {
	
	
	
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student(5, "bikram", 56.7));
	al.add(new Student(3, "pawan",37.7));
	al.add(new Student(6, "yash", 35.7));
	al.add(new Student(2, "akshay", 96.7));
	al.add(new Student(1, "aishu", 26.7));


Helper h=new Helper();
//h.displayAllStudent(al);
//h.displayFailedStudent(al);
//h.displayPassedStudent(al);
h.topperOfTheClass(al); 
}
}
