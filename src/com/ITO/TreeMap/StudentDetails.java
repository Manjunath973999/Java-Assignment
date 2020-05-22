package com.ITO.TreeMap;

import java.util.TreeMap;

public class StudentDetails 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(6, "Manjunath");
		tm.put(29, "Abhisek");
		tm.put(17, "Ankith");
		tm.put(55, "Hussian");
		tm.put(13, "Harshitha");
		tm.put(33, "Sathya");
		
		System.out.println(tm);
		
		tm.put(61, "Chandu");
		tm.put(37, "Dilip");
		
		System.out.println(tm);
	}
}
