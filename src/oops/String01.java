package oops;

public class String01 
{
	public static void main(String[] args) 
	{
	
		String a="nilesh";
		
		String b="patil";
		
		
		a=a+b;
		
		System.out.println(a);
		
		b=a.substring(0, a.length()-b.length());
		
		System.out.println("b "+b);
		
		a=a.substring(b.length());
		
		System.out.println("a "+a);
		
		
		
	}

}
