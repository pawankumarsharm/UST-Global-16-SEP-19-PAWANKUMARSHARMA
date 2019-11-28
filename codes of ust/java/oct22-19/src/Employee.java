
public class Employee {
	String name;
	int eid;
	
	public Employee(String empname, int empid) {
		name=empname;
		eid=empid;
	}
	void printDetails() {
		System.out.println("Employeee name is"+name);
		System.out.println("Employeee id is"+eid);
	}
	public static void main(String[] args) {
		Employee e1=new Employee("anushka shethy",143);
		e1.printDetails();
		Employee e2=new Employee("deepika",420);
	e2.printDetails();
		Employee e3=new Employee("chacha",69);
		e3.printDetails();
	}

}
