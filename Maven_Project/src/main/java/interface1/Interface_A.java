package interface1;

public class Interface_A implements Interface_B {

	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

	public void display1() {
		System.out.println("interface");
	}
	
	public static void main(String[] args) {
		
		Interface_A ob=new Interface_A();
		ob.display();
		ob.display1();
		
		Interface_B ob1=new Interface_A();
		ob1.display();
		ob1.display1();
	}

}
    