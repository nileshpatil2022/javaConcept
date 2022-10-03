package javaProgram;

public class Exception01 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=12;
			
			int b=0;
			
			int c=a%b;
		}
		
		catch(Exception e)
		{
			System.out.println("we can not devide any integer number by zero");
		}
		
		finally
		{
			System.out.println("hiiii");
		}
	}

}
