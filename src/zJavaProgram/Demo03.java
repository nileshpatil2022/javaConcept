package zJavaProgram;

import java.util.ArrayList;
import java.util.List;

public class Demo03 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4};
		
		int b[]= {2,3,4,14,55};
		
		boolean contains=false;
		List<Integer> results=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
				 contains=true;
				 break;
				}
			}
				if(!contains)
				{
					results.add(a[i]);
				}
				else
				{
					contains=false;
				}
				
		}
		System.out.println(results);
		}
		
	}


