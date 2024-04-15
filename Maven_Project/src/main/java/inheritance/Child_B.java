package inheritance;

public class Child_B extends Child_A {
	
	
	int e;
	public void div()
	{
		int e=a/b;
		System.out.println(e);
		
	}

	public static void main(String[] args) {
		Child_B ob=new Child_B();
		ob.add();
		ob.sub();
		ob.div();
		

	}

}
