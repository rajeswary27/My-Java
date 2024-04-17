package task;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String s1=sc1.nextLine();
		
		System.out.println("Enter a number: ");
		int i1=sc1.nextInt();
		
		System.out.println("Enter a character: ");
		char a=sc1.next().charAt(0);
		
		System.out.println("Enter float number ");
		float t=sc1.nextFloat();//Don't u
		
		System.out.println("Are you above 18?  ");
	    boolean b=sc1.nextBoolean();
	    if(b==true)
	    {
	    	System.out.println("you are over 18");
	    }
	    
	    else
	    {
	    	System.out.println("you are under 18");
	    }
}
}