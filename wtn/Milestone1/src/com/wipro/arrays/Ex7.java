package com.wipro.arrays;

import java.util.Arrays;

public class Ex7 {
	
	
	public static void main(String[] args) {
		
		int []a=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(a);
		
		int[] temp = new int[args.length];  
        int j = 0;  
        for (int i=0; i<a.length-1; i++){  
            if (a[i] != a[i+1]){  
                temp[j++] = a[i];  
            }  
         }  
        temp[j++] = a[a.length-1];     
       
        for (int i=0; i<j; i++){  
            a[i] = temp[i];  
            System.out.println(a[i]);
        }  
	}

}
