package com.wipro.flowcontrolstatements;

public class Ex4 {
	public static void main(String[] args) {
		if(args[0].compareTo(args[1])>0)
		{
			System.out.println(args[1]+","+args[0]);
		}
		else
		{
			System.out.println(args[0]+","+args[1]);
		}
	}
}
