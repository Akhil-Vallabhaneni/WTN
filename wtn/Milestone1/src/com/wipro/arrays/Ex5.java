package com.wipro.arrays;

public class Ex5 {
	public static void main(String[] args) {
int []a=new int[args.length];
		
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int min=a[0],max=a[0],min2,max2;
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
		max2=min;
		min2=max;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>min && a[i]>max2 && a[i]!=max)
			{
				max2=a[i];
			}
			
			if(a[i]<max && a[i]!=min && a[i]<min2)
			{
				min2=a[i];
			}
		}
		System.out.println("first min value and second min value "+min+" "+min2);
		System.out.println("first max and second max values "+max+" "+max2);
	}

}
