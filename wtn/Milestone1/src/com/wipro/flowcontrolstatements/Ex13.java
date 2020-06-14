package com.wipro.flowcontrolstatements;

public class Ex13 {
public static void main(String[] args) {
	
	for(int j=10;j<99;j++)
	{
		boolean prime=false;
	for(int i=2;i<j/2;i++)
	{
		if((j%i)==0)
			prime=true;
			
	}
	if(prime==false)
		System.out.println(j);

	}
	

}
}
