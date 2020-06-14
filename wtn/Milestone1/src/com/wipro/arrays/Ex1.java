package com.wipro.arrays;

public class Ex1 {
	public static void main(String[] args) {
	
		int []a=new int[args.length];
		int avg=0;
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<args.length;i++)
		{
			avg=avg+a[i];
		}
		
	System.out.println("avg="+avg/args.length);
		
	}

}
