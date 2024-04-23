package interface1;

public class Interface_D implements Interface_B,Interface_C {

	public static void main(String[] args) {
		Interface_D obj=new Interface_D();
		obj.display();
		obj.display1();
		obj.show();

	}

	public void show() {
		System.out.println("Multiple Inheritance acheive in interface");
		
	}

	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("interface1");		
	}

	public void display1() {
		System.out.println("Interface 2");
		
	}

}
