package java8;

import java.util.function.Consumer;

public class TestF {
public static void main(String[] args) {
	
	Consumer<Student> c = (s) ->{
	System.out.println("Id is"+s.id);
	System.out.println("Name is"+s.name);
	System.out.println("Percentage is"+s.percentage);
	
	
	};
	
	
	Student s1=new Student(2,"bhawani",67.9);
	c.accept(s1);
	}
}
