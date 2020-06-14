package com.wipro.flowcontrolstatements;

public class Ex19 {
	
	public static void main(String[] args) {
		int i=1,first=0;
		while(true)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				first++;
				System.out.println(i);
			}
			if(first==5)
			{
				break;
			}
			i++;
		}
	}

}
