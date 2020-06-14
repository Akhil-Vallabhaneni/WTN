package com.wipro.arrays;

public class Ex2 {
	
	public static void main(String[] args) {
		
		int []a=new int[args.length];
		
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int min=a[0],max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("min and max is "+min+" and "+max);
	
}
}
