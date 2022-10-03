package zJavaProgram;

import java.util.ArrayList;
import java.util.List;

public class ArrayProgram 
{
	public static void main(String[] args) 
	{
		int a[]= {40,45,46,50,55};
		
		int b[]= {41,45,55,79};
		
		boolean c=false;
		
		List<Integer> result=new ArrayList<Integer>();
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c=true;
					break;
				}
			}
			if(!c)
			{
				result.add(a[i]);
			}
			else
			{
				c=false;
			}
		}
		System.out.println(result);
	}

}
