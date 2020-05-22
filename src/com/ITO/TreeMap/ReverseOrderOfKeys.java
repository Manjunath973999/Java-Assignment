package com.ITO.TreeMap;

import java.util.TreeMap;

public class ReverseOrderOfKeys 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(10, "Manjunath");
		tm.put(20, "Abhisek");
		tm.put(30, "Ankith");
		tm.put(40, "Hussian");
		tm.put(50, "Harshitha");
		tm.put(60, "Sathya");
		
		System.out.println("TreeMap elements are :"+tm);
		
		System.out.println("Reverse order of Keys is :"+tm.descendingKeySet());
	}
}
