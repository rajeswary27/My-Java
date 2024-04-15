package multilevelinheritance;

public class ChildA extends Child{
	
	int e=a/b;
	
	public void div() {
		
		System.out.println(e);
	}

	public static void main(String[] args) {
		
		ChildA ob=new ChildA();
		ob.add();
		ob.sub();
		ob.div();
	}

}
