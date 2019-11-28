
public class TestG {
	final void add() {
		System.out.println("add() method");
	}
	public static void main(String[] args) {
		SuperClass sup=new SuperClass();
		
		System.out.println("***********************");
		
		SubClass sub=new SubClass();
		sub.getsData();
	}

}
