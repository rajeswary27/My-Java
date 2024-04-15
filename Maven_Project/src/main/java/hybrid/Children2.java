package hybrid;

public class Children2 extends Parent{
	
	public void display3()
	{
	System.out.println("Children2");
	}
	
	public static void main(String[] args) {
		
		Children2 ob=new Children2();
		ob.display();
		ob.display1();
		ob.display3();
		
		
		Children ob1=new Children();
		ob1.display2();

	}

}
