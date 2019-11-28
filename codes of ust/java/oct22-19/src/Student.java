
public class Student {
	String name;
	int sid;
	long contact;
	String email;
	String company;
	
	public Student(String name,int sid,long contact,String email,String company)
	{
		this.name=name;
		this.sid=sid;
		this.contact=contact;
		this.email=email;
		this.company=company;
	}
	void display() {
		System.out.println("student name "+name);
		System.out.println("student id "+sid);
		System.out.println("stuent contact "+contact);
		System.out.println("student email "+email);
		System.out.println("student company "+company);
	}
	public static void main(String[] args) {
		Student s1=new Student("pawan",101,7050589814l,"kumarsharmapawan190@gmail.com","ust global");
		s1.display();
		Student s2=new Student("priya",102,8945554455l,"priya@gmail.com","ust global");
		s2.display();
		Student s3=new Student("reshu",103,1234567890l,"reshu@gmail.com","ust global");
		s3.display();
		Student s4=new Student("anushka",104,8945554455l,"anushka@gmail.com","ust global");
		s4.display();
		Student s5=new Student("abhinav",105,8945554455l,"abhinav@gmail.com","ust global");
		s5.display();
		Student s6=new Student("saumen",106,8945554455l,"saumen@gmail.com","ust global");
		s6.display();
		Student s7=new Student("richi",107,8945554455l,"richi@gmail.com","capgemini");
		s7.display();
		Student s8=new Student("priyanka",108,8945554455l,"priyanka@gmail.com","ust global");
		s8.display();
		Student s9=new Student("swati",109,8945554455l,"swati@gmail.com","ust global");
		s9.display();
		Student s10=new Student("kaartik",110,8945554455l,"kaartik@gmail.com","ust global");
		s10.display();
	
	
	}

}
