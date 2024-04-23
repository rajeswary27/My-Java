package abstraction;

public abstract class Abstract {
	public Abstract()
	{
		System.out.println("Abstract Constructor");
	}

	public abstract void display();//abstract class only declaration
	
	public static void display1()
	{
		System.out.println("Static Abstract method");
	}
	
	public void display2()
	{
		System.out.println("Abstract method");
	}
}
