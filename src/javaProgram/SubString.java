package javaProgram;

public class SubString 
{
	public static void main(String[] args) 
	{
		String a="nilesh";
		
		String b="selenium";
		
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		System.out.println(b);
		
		a=a.substring(b.length());
		
		System.out.println(a);
		
	}
	

}
