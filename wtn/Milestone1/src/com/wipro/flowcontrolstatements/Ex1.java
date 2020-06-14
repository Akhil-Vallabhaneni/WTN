package com.wipro.flowcontrolstatements;

public class Ex1 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a>0)
		{
		System.out.println("The given number is positive");
		}
		else if(a<0)
		{
			System.out.println("The given number is negative");			
		}
		else
		{
			System.out.println("The given number is zero");
		}

}
}
