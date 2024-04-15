package hierarcialInheritence;

public class ChildA extends Parent {
	
	String a="abc";
	char b='e';
	
	public void place() {
		
		System.out.println(a);
		System.out.println(b);
	}
	
	

	public static void main(String[] args) {
	ChildA ob=new ChildA();
	ob.place();
	ob.diff();
	ob.details1();

	}

}
