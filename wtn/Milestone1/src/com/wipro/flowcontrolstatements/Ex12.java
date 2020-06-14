package com.wipro.flowcontrolstatements;

public class Ex12 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	boolean prime=false;
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
			prime=true;
			
	}
	if(prime==true)
		System.out.println("not a prime number");
	else
		System.out.println("given number is prime");
}
}
