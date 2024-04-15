package aggregation;

public class Student {
	
	String student_name;
	int rollno;
	
	Address add;
	
	public Student(String student_name,int rollno,Address add)
	{
		this.student_name=student_name;
		this.rollno=rollno;
		this.add=add;
	}
	
	public void display()
	{
		System.out.println("Student name= "+ student_name);
		System.out.println("Student roll no= "+ rollno);
		System.out.println("Student house no= "+ add.house_no);
		System.out.println("Student house name= "+ add.house_name);
		System.out.println("Student city= "+ add.city);
		System.out.println("Student pincode= "+ add.pincode);
	}

	public static void main(String[] args) {
		Address ob=new Address(240,"Palm villa","London",457125);
		Student ob1=new Student("Rose",24,ob);
		ob1.display();
		

	}

}
