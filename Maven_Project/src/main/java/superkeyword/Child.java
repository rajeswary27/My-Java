package superkeyword;

public class Child extends Parent{

	
	String s="Rajasree";
	
	public Child(int p,int q)
	{
		super(12,20);
		int r=p-q;
		System.out.println("diff r= "+r);
		System.out.println("Child class consructor");
		
	}
	
	public void show()
	{
		System.out.println(s);
		System.out.println(super.s);
		System.out.println("Child class Method");
	}
	
	public void display()
	{
		super.display();
		System.out.println("display child class");
	}
	
	
	public static void main(String[] args) {
		
		Child ob=new Child(30,20);
		ob.show();
		ob.display();
		
}

}
