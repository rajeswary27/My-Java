package polymorphism;

public class Child extends Parent {
	
	public void display() {
		super.display();
		System.out.println("In Child Class");
	}

	public static void main(String[] args) {
		Child ob=new Child();
		ob.display();
				
	}

}
