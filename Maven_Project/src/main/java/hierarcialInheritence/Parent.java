package hierarcialInheritence;

public class Parent {

	
	int a=20;
	int b=10;
	int c=a+b;
	
	String name="Ram";
	String place="TVM";
	int age=28;
	long num=987456321;
	String qualification="btech cs";
	
	public void diff()
	{
		System.out.println("a+b= "  +c);
		
	}
	
	public void details1()
	{
		System.out.println(name);
		System.out.println(place);
		System.out.println(age);
		System.out.println(num);
		System.out.println(qualification);
	}
}
