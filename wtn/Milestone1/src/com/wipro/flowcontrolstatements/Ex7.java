package com.wipro.flowcontrolstatements;

public class Ex7 {
	
	public static void main(String[] args) {
		char s='a';
		if(s>='a' && s<='z')
		{
			System.out.println(s+"->"+Character.toUpperCase(s));
		}
		else if(s>='A' && s<='Z')
		{
			System.out.println(s+"->"+Character.toLowerCase(s));
		}
	}

}
