package com.ITO.Hashmap;

import java.util.HashMap;

public class ContainsSpecificKey 
{
	public static void main(String[] args)
	{
		  HashMap <Integer, String> hm = new HashMap <Integer, String>();
		  hm.put(10, "Manjunath");
		  hm.put(20, "Abhishek");
		  hm.put(30, "Ankith");
		  hm.put(40, "Hashitha");
		  hm.put(50, "hussian");
		  hm.put(60, "Sathya");
		  
		  System.out.println("Map contains :" + hm);
		  
		  boolean flag1 = hm.containsKey(22);
		  System.out.println("Is Key 70 exists in HashMap :"+flag1);
		 
		  boolean flag2 = hm.containsKey(55);
		  System.out.println("Is Key 60 exists in HashMap :"+flag2);
		 
		  boolean flag3 = hm.containsKey(99);
		  System.out.println("Is Key 50 exists in HashMap :"+flag3);

	}
}
