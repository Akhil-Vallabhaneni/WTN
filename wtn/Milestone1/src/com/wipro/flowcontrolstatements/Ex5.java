package com.wipro.flowcontrolstatements;

public class Ex5 {
public static void main(String[] args) {
	char s='s';
	if(s >='0' && s<= '9')
	{
		System.out.println("digit");
	}
	else if((s>='a' && s<='z')||(s>='A' && s<='Z'))
	{
		System.out.println("Alphabet");
	}
	else
	{
		System.out.println("Special Character");
	}
}
}
