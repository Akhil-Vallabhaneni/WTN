package com.wipro.flowcontrolstatements;

public class Ex14 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	if(args.length==0)
	{
		System.out.println("please enter a number");
	}
	else if(n<2)
		System.out.println(n+" is neither prime nor composite number");

	else
	{
		boolean prime=false;
	for(int i=2;i<n/2;i++)
	{
		if((n%i)==0)
			prime=true;
			
	}
	if(prime==false)
		System.out.println(n+" is a prime number");
		else
		System.out.println(n+" is composite number");

	}
	

}
}
