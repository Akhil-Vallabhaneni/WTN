package com.wipro.arrays;

public class Ex4 {
	
	
		public static void main(String[] args) {
		
			int []a=new int[args.length];
			
			for(int i=0;i<args.length;i++)
			{
				a[i]=Integer.parseInt(args[i]);
			}
			for(int i=0;i<a.length;i++)
			{
				char ch=(char)a[i];
				System.out.println(ch);
			}
			
}
}