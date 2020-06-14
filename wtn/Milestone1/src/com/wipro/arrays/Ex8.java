package com.wipro.arrays;

public class Ex8 {
public static void main(String[] args) {
	int []a=new int[args.length];

	for(int i=0;i<args.length;i++)
	{
		a[i]=Integer.parseInt(args[i]);
	}
	int flag=0,n1=6,n2=7,flag2=0,v1=0,v2=0;
	for(int i=0;i<a.length;i++)
	{
		flag=0;
		flag2=0;
		if(n1==a[i])
		{
			flag=1;
		}
		if(n2==a[i])
		{
			flag2=1;
		}
		if(flag>0)
		{
			if(i>v1)
			v1=i;
	}
		if(flag2>0)
		{
			if(i>v2)
				v2=i;
		
		}
	}
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		if(i>=v1 && i<=v2)
			continue;
		else
			sum=sum+a[i];
			
	}
	System.out.println("sum of array excludin the values between 6 and 7 is "+sum);
}
}
