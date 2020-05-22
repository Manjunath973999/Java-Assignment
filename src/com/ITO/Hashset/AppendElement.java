package com.ITO.Hashset;

import java.util.HashSet;

public class AppendElement 
{
	public static void main(String[] args) 
	{
		  HashSet<String> hs = new HashSet<String>();
		  
		  hs.add("Jhon");  
		  hs.add("Ramesh");  
		  hs.add("Suresh");  
		  hs.add("Rajesh");
		  hs.add("Jagadish");
		  
		  System.out.println("Before adding Element "+hs);
		  
		  hs.add("Ranga");
		  hs.add("Ramesh");
		  
		  System.out.println("After adding element "+hs);
	}
}
