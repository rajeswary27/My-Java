package abstraction;

public class Abstract_Class2 extends Abstract {
	
	
	public void display2()
	{
		System.out.println("Abstract method");
	}
	
	public static void main(String[] args) {
		
		Abstract_Class2 ob=new Abstract_Class2();
		ob.display();
		ob.display2();
		Abstract.display1();
	}

	@Override
	public void display() //abstract class implementation
	{
		System.out.println("Abstract method2");		
	}
}
