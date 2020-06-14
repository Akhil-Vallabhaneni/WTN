package com.wipro.flowcontrolstatements;

public class Ex18 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int d=n;
		int rev=0,r=0;
		for(int i=n;i>0;i=i/10)
		{
			r=(i%10);
			rev=rev*10+r;
			
		}
		if(rev==d)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("not a polindrome");
		}
	}
	}


