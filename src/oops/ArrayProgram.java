package oops;

import java.util.ArrayList;
import java.util.List;

public class ArrayProgram 
{
	public static void main(String01[] args) 
	{
		
		int a[]= {12,56,45,11,63};
		
		int b[]= {10,45,44,11,67,69};
		
		
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
