package com.wipro.flowcontrolstatements;

public class Ex6 {
	public static void main(String[] args) {
		int age=Integer.parseInt(args[1]);
			if(args[0].equals("female"))
			{
				if(age>=1 && age<=58)
				{
					System.out.println("the percentage of interest is 8.2%");
				}
				else
				{
					System.out.println("the percentage of interest is 9.2%");
				}
			
			}
			else
			{
				if(age>=1 && age<=58)
				{
					System.out.println("the percentage of interest is 8.4%");
				}
				else
				{
					System.out.println("the percentage of interest is 10.5%");
				}
			}
		
		}
	}
