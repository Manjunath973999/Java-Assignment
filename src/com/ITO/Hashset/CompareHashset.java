package com.ITO.Hashset;

import java.util.HashSet;

public class CompareHashset 
{
	public static void main(String[] args) 
	{
		  HashSet<String> hs1 = new HashSet<String>(); 
		  hs1.add("Jhon");  
		  hs1.add("Ramesh");  
		  hs1.add("Suresh");  
		  hs1.add("Rajesh");
		  hs1.add("Jagadish");
		  System.out.println("First HashSet is :"+hs1);
		  
		  HashSet<String> hs2 = new HashSet<String>();
		  hs2.add("Ganesh");
		  hs1.add("Girish");  
		  hs1.add("Suresh");  
		  hs1.add("Harish");
		  hs1.add("Jagadish");
		  System.out.println("Second HashSet is :"+hs1);
		  
		  if(hs1.equals(hs2))
		  {
			  System.out.println("Both the sets are Equal");
		  }
		  else
		  {
			  System.out.println("HashStes are not equal");
		  }
		  
	}
}
