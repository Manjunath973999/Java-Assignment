package com.ITO.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElement 
{
	public static void main(String[] args) 
	{
		List<String> al = new ArrayList<String>();
		
		al.add("Raina");
		al.add("Warner");
		al.add("MS Dhoni");
		al.add("Sachin");
		al.add("Virat Kohli");
		al.add("Rohit");
		
		System.out.println("Students Present in the arraylist ");
		System.out.println("-------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name to be searched");
		String str = sc.next();
		
			if (al.contains(str)) 
			{
				System.out.println("Element Found");
			}
			else
			{
				System.out.println("Element not found");
			}
		
	}
}
