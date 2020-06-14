package com.wipro.arrays;

public class Ex14 {
public static void main(String[] args) {
int []a[]=new int[3][3];
	int k=0;
	if(args.length<9)
	{
		System.out.println("please enter 9 numbers");
	}
	else
	{
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		a[i][j]=Integer.parseInt(args[k]);
		k++;
	}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		System.out.print(a[i][j]+" ");
	
	}
		System.out.println();
	}
	}
	int sum=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			sum=sum+a[i][j];
		}
}
	System.out.println("sum is "+sum);
}
}
