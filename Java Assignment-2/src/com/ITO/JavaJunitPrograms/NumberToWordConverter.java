/* WAP To convert any number to into words. The program will take input n as number (can be anything between 0 to 100000000) and print the words equivalent of it.
	input: 125
	output: One hundred twenty five
	
	input 2074
	output: Two thousand seventy four */



package com.ITO.JavaJunitPrograms;

import java.util.Scanner;

public class NumberToWordConverter 
{
	public static void main(String[] args)
	{
		
		NumberToWordConverter obj = new NumberToWordConverter();
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the Number to be converted");
		int num = reader.nextInt();
		
		//long num = reader.nextLong();
		
		System.out.println(obj.convert(num));
		
	}
	
	
	// These names are immutable so named as final
	
	private static final String[] onesNames = {" "," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"," Ten"," Eleven"," Twelve"," Thirteen"," Fourteen"," Fifteen"," Sixteen"," Seventeen"," Eighteen"," Nineteen"};
	private static final String[] tensNames = {" "," ten"," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};  
	private static final String[] multiNames = { " "," thousand"," million"};
	
	// Method to convert the numbers less than thousand
	
	private String convertLessThanOneThousand(int number)
	{
		String current = " ";
		
		if (number % 100 < 20)
		{
			current = onesNames[number % 100];
		    number = number/ 100;
		}
		else 
		{
			current = onesNames[number % 10];
			number = number/10;
			current = tensNames[number % 10] + current;
			number = number/10;
		}
		
		if (number == 0)
		{
			return current;
		}
		
		return onesNames[number] + " hundred" + current;

	}
	
	// Checking the number is zero or negative or greater than 10 crore
	
	public String convert(int number)
	{
		if (number == 0)
		{
			return "Zero"; 
		}
		
		if (number < 0)
		{
			return "Number cannot be negative";
		}
		
		if( number > 100000000)
		{
			return "Limit Exceeded";
		}
		
		String current = " ";
		
		int placeHolder = 0;
		
		do
		{
			int n = number % 1000;
			
			if (n != 0)
			{
				String s = convertLessThanOneThousand(n);
				current = s + multiNames[placeHolder] + current;
			}
			
			placeHolder++;
		    number = number/1000;
		} 
		
		while (number > 0);
		return current.trim();
		
	}

}
