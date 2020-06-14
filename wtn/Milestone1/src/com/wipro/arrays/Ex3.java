package com.wipro.arrays;

public class Ex3 {
public static void main(String[] args) {
		
		int []a=new int[args.length-1];
		
		for(int i=0;i<args.length-1;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int n=Integer.parseInt(args[args.length-1]);
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			flag=0;
			if(n==a[i])
			{
				flag=1;
			}
			if(flag>0)
			{
			System.out.println("it is present at index"+i);
		}
		}
		if(flag==0)
		{
			System.out.println("-1");
		}

		
}
}
