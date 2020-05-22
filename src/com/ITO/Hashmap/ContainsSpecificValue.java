package com.ITO.Hashmap;

import java.util.HashMap;

public class ContainsSpecificValue 
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
		  
		  boolean flag1 = hm.containsValue("Abhishek");
		  System.out.println("Is value exists in HashMap :"+flag1);
		  
		  boolean flag2 = hm.containsValue("Chandu");
		  System.out.println("Is value exists in HashMap :"+flag2);
	}
}
