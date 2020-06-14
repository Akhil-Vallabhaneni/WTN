package com.wipro.arrays;

public class Ex9 {
	public static void main(String[] args) {
		int []a=new int[args.length];
		
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int i=0;
		 while(i<a.length && a[i] != 10)
		        i++;
		              
		    for(int j=i+1; j<a.length;j++) {
		        if(a[j]!=10) {
		            a[i]=a[j];
		            a[j]=10;
		            i++;
		        }
		    }
		    
		    	while(i<a.length)
		    	{
		        a[i] = 0;
		        i++;
		        }
		    	for(i=0;i<a.length;i++)
				{
					System.out.println(a[i]);
				}
	}

}
