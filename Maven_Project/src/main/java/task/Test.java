package task;

public class Test {
	
	int a;
	int b;
	int c;
	
	public Test(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		 System.out.println(c);
		
	}
	public int display()
	{
		
		int d=c/2;
		
		//System.out.println(d);
		return d;
	
	}
	
	public static void main(String[] args) {
	Test ob =new Test(10,5);
	//ob.display();
	int d=ob.display();
	//System.out.println(ob.display());
	System.out.println(d);
	
	
	}

}
