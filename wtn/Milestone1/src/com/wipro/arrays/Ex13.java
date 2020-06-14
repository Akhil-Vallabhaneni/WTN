package com.wipro.arrays;

public class Ex13 {
	public static void main(String[] args) {
		
	int n=2;
	int []a[]=new int[n][n];
	int k=0;
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
		a[i][j]=Integer.parseInt(args[k]);
		k++;
	}
	}

	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
		System.out.print(a[i][j]+" ");

	}
		System.out.println();
	}
System.out.println("after reversing");

	int temp1=0;
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			if(i==0)
			{
		temp1=0;
			temp1=a[i][j];
			a[i][j]=a[n-1-i][n-1-j];
			a[n-1-i][n-1-j]=temp1;
		
			
		}
		}
	}
	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
		System.out.print(a[i][j]+" ");

	}
		System.out.println();
	}
	
}
}