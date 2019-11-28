package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void displayAllStudent(ArrayList<Student> al) {
		Iterator<Student> it=al.iterator();
		while(it.hasNext()) {
			
			Student s=it.next();
			System.out.println("id is"+s.id);
			System.out.println("name is"+s.name);
			System.out.println("percentage is"+s.percentage);
			System.out.println("++++++++++++++++++++");
		}
	}
	
	void displayFailedStudent(ArrayList<Student> al) {
	List<Student> l1=al.stream().filter(student -> student.percentage<40).collect(Collectors.toList());
	
	Iterator<Student> it=l1.iterator();
	while(it.hasNext()) {
		
		Student s=it.next();
		System.out.println("id is"+s.id);
		System.out.println("name is"+s.name);
		System.out.println("percentage is"+s.percentage);
		System.out.println("++++++++++++++++++++");
	}
}
	void displayPassedStudent(ArrayList<Student> al) {
		List<Student> l2=al.stream().filter(student -> student.percentage>40).collect(Collectors.toList());
		
		Iterator<Student> it=l2.iterator();
		while(it.hasNext()) {
			
			Student s=it.next();
			System.out.println("id is"+s.id);
			System.out.println("name is"+s.name);
			System.out.println("percentage is"+s.percentage);
			System.out.println("++++++++++++++++++++");
		}
		}
	void topperOfTheClass(ArrayList<Student> al) {

	Comparator<Student> cmp=(m1,m2) ->{
		if(m1.percentage>m2.percentage) {
			return 1;
	}
		else if(m1.percentage<m2.percentage) {
			return -1;
		}
		else
		{
			return 0;
		}
};
		
	System.out.println("topper is");

		Student s=al.stream().max(cmp).get();
		System.out.println("id is"+s.id);
		System.out.println("name is"+s.name);
		System.out.println("percentage is"+s.percentage);
		System.out.println("++++++++++++++++++++");
	}
	
	
	
	
}
