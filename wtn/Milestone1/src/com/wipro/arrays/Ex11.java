package com.wipro.arrays;

public class Ex11 {

	public static void main(String[] args) {
		int []a=new int[args.length];
		
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		
		boolean flag=true;
		for(int i=0;i<args.length;i++)
		{
			if(a[i]!=1 && a[i]!=4)
			{
			flag=false;
			break;
			}
		}
		if(flag==true)
			System.out.println("true");
		else
			System.out.println("false");
	}
	
}

