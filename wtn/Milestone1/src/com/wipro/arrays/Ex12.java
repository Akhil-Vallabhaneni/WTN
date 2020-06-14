package com.wipro.arrays;

public class Ex12 {
public static void main(String[] args) {
	int []a=new int[args.length-3];
	
	for(int i=0;i<args.length-3;i++)
	{
		a[i]=Integer.parseInt(args[i]);
	}
	
	int []b=new int[3];
	int []c=new int[3];
int j=0;
	for(int i=3;i<args.length;i++)
	{
		b[j]=Integer.parseInt(args[i]);
		j++;
	}
	j=0;
	for(int i=0;i<args.length-3;i++)
	{
		if(i%2!=0)
		{
			c[j]=a[i];
			j++;
			c[j]=b[i];
		}
	}
	
	
	for(int i=0;i<2;i++)
	{
		System.out.println(c[i]);
	}
	
	
}
	
}
