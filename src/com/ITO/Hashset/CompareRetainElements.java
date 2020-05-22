package com.ITO.Hashset;

import java.util.HashSet;

public class CompareRetainElements 
{
	public static void main(String[] args) 
	{
		  HashSet<String> hs1 = new HashSet<String>();
		  
		  hs1.add("Jhon");  
		  hs1.add("Ramesh");  
		  hs1.add("Suresh");  
		  hs1.add("Rajesh");
		  hs1.add("Jagadish");
		  
		  HashSet<String> hs2 = new HashSet<String>();
	      hs2.add("Suresh");
	      hs2.add("Jhon");
	      hs2.add("Rajesh");
	      hs2.add("Ramesh");
	      
	      hs1.retainAll(hs2);
	      
	      System.out.println("Retained Elements are :");
	      System.out.println(hs1);
	}
}
