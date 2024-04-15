package hierarcialInheritence;

public class ChildB extends Parent{

	
	String name="Raji";
	long a=102;
	char b='r';
	
	public void details() {
		System.out.println(name);
		System.out.println(a);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		
		
		ChildB ob1=new ChildB();
		ob1.details();
		ob1.diff();
		ob1.details1();
		

	}

}
