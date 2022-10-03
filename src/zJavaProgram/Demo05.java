package zJavaProgram;

import java.util.ArrayList;
import java.util.List;

public class Demo05 
{
	public static void main(String[] args) 
	{
		int a[]= {12,13,45,23,74};
		
		int b[]= {11,45,23,75,98};
		
		
		boolean contain=false;
		
		List<Integer> ls=new ArrayList<Integer>();
		
		
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
				
			}
		}
		
				
				
		
		
	}

}
