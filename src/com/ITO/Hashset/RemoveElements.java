package com.ITO.Hashset;

import java.util.HashSet;

public class RemoveElements 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		  
		hs.add("Jhon");  
		hs.add("Ramesh");  
		hs.add("Suresh");  
		hs.add("Rajesh");
		hs.add("Jagadish");
		
		System.out.println("Before Removing Elements :");
		System.out.println(hs);
		
		hs.clear();
		
		System.out.println("After Removing Elements :");
		System.out.println(hs);
	}
}
