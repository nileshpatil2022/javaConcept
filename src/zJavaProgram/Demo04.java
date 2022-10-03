package zJavaProgram;

import java.util.ArrayList;
import java.util.List;

public class Demo04 
{
	public static void main(String[] args) 
	{
		int a[]= {3,4,5,6,7,8};
		
		int b[]= {4,11,5,42,78,7};
		
		
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
