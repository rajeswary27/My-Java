package exception;

public class Exception_Eg {
	
	int a=25   ;
	public void eligibility()
	{
		if(a>=18)
		{
			System.out.println("you are eligible to vote");
		}
		
		else
		{
			System.out.println("you are not eligible to vote");
		}
	}

	public static void main(String[] args) {
		Exception_Eg ob=new Exception_Eg();
		ob.eligibility();
		
	}

}
