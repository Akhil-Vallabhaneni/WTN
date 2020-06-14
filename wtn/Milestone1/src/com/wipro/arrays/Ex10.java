package com.wipro.arrays;

public class Ex10 {

	public static void main(String[] args) {
int []a=new int[args.length];
		
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int i=0;
		while(i<a.length && a[i]%2==0)
		{
			i++;
	    // System.out.println(i);
	     
		}
	              
	    for(int j=i+1; j<a.length;j++) {
	        if(a[j]%2==0) {
	            int temp=a[i];
	            a[i]=a[j];
	            a[j] = temp;
	            i++;
	        }
	    }
	    for(i=0;i<a.length;i++)
	    {
	    	System.out.print(a[i]);
	    }
	}
	
}
