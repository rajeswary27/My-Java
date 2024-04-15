package inheritance;

public class Child extends Parent{
	
	public void sub()
	{
		int sub=a-b;
		System.out.println(sub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child ob=new Child();
		ob.add();
		ob.sub();
		System.out.println(ob.a);
		System.out.println(ob.b);

	}

}
