package zJavaProgram;

import java.util.ArrayList;
import java.util.List;

public class ArrayProgram01 
{
	public static void main(String[] args)
	{
		int a[]= {12,56,45,78,22};
		
		int b[]= {45,55,56,78,74};
		
		boolean contain=false;
		List<Integer> result=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
			
				if(a[i]==b[j])
				{
					contain=true;
					break;
				}
			}
			if(!contain)
			{
			result.add(a[i]);
			}
			else
			{
				contain=false;
			}
			
		}
		System.out.println(result);
		
	}

}
